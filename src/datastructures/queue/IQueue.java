package datastructures.queue;

public interface IQueue {

    void enQueue(int data);

    void deQueue();

    int pick();

    int size();

    boolean isEmpty();

    void display();


}