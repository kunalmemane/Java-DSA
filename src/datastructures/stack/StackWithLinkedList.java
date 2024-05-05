package datastructures.stack;

class StackNode{
    int data;
    StackNode next;

    StackNode(int data){
        this.data = data;
    }
}

public class StackWithLinkedList implements IStack {

    StackNode top;

    public void push(int data) {
        StackNode StackNode = new StackNode(data);

        if(top == null){
            top = StackNode;
            return;
        }

        StackNode.next = top;
        top = StackNode;
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is empty!");
            return;
        }
        top =  top.next;
    }

    public int pick() {
        return top == null ? -404 : top.data;
    }

    public int size(){
        int size = 0;

        if (top == null) {
            return size;
        }

        StackNode current = top;
        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    public void clear(){
        if (top == null) {
            System.out.println("Stack is already empty!");
            return;
        }   

        top = null;
    }

    public boolean isEmpty(){
        return top == null ? true: false;
    }

    public void display(){
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        StackNode current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
    
}