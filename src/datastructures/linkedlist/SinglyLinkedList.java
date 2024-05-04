package datastructures.linkedlist;

public class SinglyLinkedList implements IList {
    Node head;

    // All Insert operations
    public void addLast(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void add(int index, int data) {
        Node node = new Node(data);

        // if position is less than index 0
        if (index < 0) {
            System.err.println("Invalid position");
            return;
        }
        
        // if position is 0th index
        if (index == 0) {
            addFirst(data);
            return;
        }

        // if position is greater than linkedList
        if(index>=size()){
            System.out.println("Index out of bound");
            return;
        }

        // if position is in middle of list, then traverse till pos-1 th position and insert node
        /*  eg: 
            list: 1-2-3-4-5
            pos : 3

            explanation: traverse till 2nd index i.e till 3
                        insert currents next node address to new nodes next section
                        add new nodes address to current nodes address section.
        */          
        Node current = head;
        int count = 0;
        while (count != index-1) {
            current = current.next;
            count++;
        }

        node.next = current.next;
        current.next = node;    
    }

    // All delete operations
    public void removeFirst() {
        if(head == null){
        System.out.println("List is Empty!");
        return;
        }
        head = head.next;
    }

    public void removeLast() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public void remove(int index) {

        // if list is empty
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        // if position is 1 then move head to head.next
        if (index == 0) {
            head = head.next;
            return;
        }
        
        // if position is greater than length of list
        if (index >=size()) {
            System.out.println("Invalid position!");
            return;
        }

        // if position is greater than 1, traverse till < pos-1 > node
        Node previous = head;
        int count = 1;
        while (count != index - 1) {
            previous = previous.next;
            count++;
        }

        // current is node to be removed
        Node current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    // All get operation
    public int getFirst(){
       return head == null ? -404 : head.data;
    }

    public int getLast(){
        if(head == null){
            return -1;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public int get(int index){

        if(head == null){
            return -1;
        }

        if(index < 0){
            System.out.println("Index out of bound");
            return -1;
        }
        
        int len = size();
        if(index>len-1){
            System.out.println("Index out of bound");
            return -1;
        }

        Node current = head;
        int count = 0;
        while (current != null) {
            if(index == count){
                return current.data; 
            }
            current = current.next;
            count++;
        }
        
        return -1;
    }

    // All set/update operations
    public void set(int index, int data){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(index < 0){
            System.out.println("Index out of bound");
            return;
        }
        int len = size();
        if(index>len-1){
            System.out.println("Index out of bound");
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null) {
            if(count == index){
                current.data = data;
                System.out.println("Node updated Index: " + index + " Data: " + data);
                return;
            }
            current = current.next;
            count++;
        }
    }

    // Length of list
    public int size() {
        int size = 0;
        if (head== null) {
            return 0;
        }

        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    
    public boolean isEmpty(){
        if(head== null){
            return true;
        }
        return false;
    }

    // Print list operations
    public void display() {

        if (head == null) {
            System.err.println("List is Empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.err.print(current.data+" ");
            current = current.next;
        }
        System.err.println("");
    }

    // Recursively print reverse list
    public void displayReverse(Node head) {
        if (head == null)
            return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }

}