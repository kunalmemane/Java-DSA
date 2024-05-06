package datastructures.queue;

public class QueueWithArray implements IQueue {
    int size = 10;
    int[] queue = new int[size];
    
    int front, rear;

    QueueWithArray(){
        this.front = -1;
        this.rear = -1;
    }

    public void enQueue(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front=0;
        }

        rear++;
        queue[rear] = data;
    }

    public void deQueue(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        if(front >= rear){
            front = -1;
            rear = -1;
            return;
        }
        front++;
    }

    public int pick(){
        if (front == -1) {
            return -404;
        }
        return queue[front];
    }

    public int size(){
        if (front ==-1) {
            return 0;
        }
        return rear-front+1;
    }

    public boolean isEmpty(){
        return front == -1 ? true: false;
    }
   
    public void display(){

        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        for(int i=front; i<=rear; i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    
}
