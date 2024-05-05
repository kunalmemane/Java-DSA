package datastructures.stack;

public interface IStack {
    void push(int data);
    
    void pop();

    boolean isEmpty();

    int pick();

    void clear();

    void display();

    int size();
}
