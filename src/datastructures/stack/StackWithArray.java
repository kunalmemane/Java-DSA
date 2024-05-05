package datastructures.stack;

public class StackWithArray implements IStack {
    int top;
    int size = 10;

    int[] stack = new int[size];

    StackWithArray(){
        top = -1;
    }

    public void push(int data){
        if(top == size-1){
            System.out.println("Stack overflow!");
            return;
        }

        top++;
        stack[top] = data;
    }   

    public void pop(){
        if(top == -1){
            System.out.println("Stack underflow!");
            return;
        }
        top--;
    }

    public int pick(){
        return top == -1 ? -404 : stack[top];
    }

    public void clear(){
        if (top == -1) {
            System.out.println("Stack is already empty!");
            return;
        }
        top = -1;
    }

    public int size(){
        return top == -1 ? 0 : top+1;
    }

    public boolean isEmpty(){
        return top != -1 ? false : true;
    }

    public void display(){
        for(int i=top; i>=0 ;i--){
            System.out.println(stack[i]);
        }
        System.out.println();
    }

}
