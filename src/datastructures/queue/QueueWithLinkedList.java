package datastructures.queue;

class QueueNode{
    int data;
    QueueNode next;

    QueueNode(int data){
        this.data = data;
    }
}

public class QueueWithLinkedList implements IQueue {
    private QueueNode front;
    private QueueNode rear;

    public void enQueue(int data){
        QueueNode queueNode = new QueueNode(data);
        if(front == null){
            front = queueNode;
            rear = queueNode;
            return;
        }
        
        rear.next =queueNode;
        rear = queueNode;
    }

    public void deQueue(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    public int pick() {
        return front == null ? -404 : front.data;
    }

    public int size(){
        int size = 0;

        if (front == null) {
            return size;
        }

        QueueNode current = front;
        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    public boolean isEmpty(){
        return front == null ? true: false;
    }

    public void display(){
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

}
