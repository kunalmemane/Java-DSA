package datastructures.stack;

public class Stack {
    public void InitStack(){
        //Stack with Array
        // StackWithArray();

        //Stack with linked list
        StackWithLinkedList();
    }

    public void StackWithArray(){
        IStack stack = new StackWithArray();

        stack.display();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.display();

        stack.pop();
        stack.display();

        System.out.println("\nFinal output: ");
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Stack Pick: " + stack.pick());
    }
    
    public void StackWithLinkedList(){
        IStack stack = new StackWithLinkedList();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.display();

        stack.pop();
        stack.display();

        System.out.println("\nFinal Result: ");
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Stack Pick: " + stack.pick());
    }

}

