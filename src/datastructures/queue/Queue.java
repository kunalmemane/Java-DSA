package datastructures.queue;

/*
    To Run Queue - 
    Create object of class Queue and initialize the queue implementation
    In InitQueue method you can change the respective queue implementation by uncommenting the lines.

    Ex: 
    psvm(){
        Queue queue = new Queue();
        queue.InitQueue();
    }
*/ 

public class Queue {
    
    public void InitQueue(){
        //queue with arrays
        // queueWithArray();

        //queue with linked list
        queueWithLinkedList();
    }

    public void queueWithArray(){
        IQueue queue = new QueueWithArray();
        queue.enQueue(0);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.display();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.display();

        System.out.println("\nFinal output:");
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
        System.out.println("Queue Pick: " + queue.pick());
        System.out.print("Queue: ");
        queue.display();
    }
 
    public void queueWithLinkedList(){
        
        IQueue queue = new QueueWithLinkedList();

        queue.enQueue(0);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.display();

        queue.deQueue();
        queue.display();

        System.out.println("\nFinal result: ");
        System.out.println("Size: " + queue.size());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("Pick: " + queue.pick());
    }

}
