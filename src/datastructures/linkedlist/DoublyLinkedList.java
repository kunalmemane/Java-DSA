package datastructures.linkedlist;

public class DoublyLinkedList implements IList {

    DoublyNode head;

    //All Add operations
    public void addLast(int data){

        DoublyNode node = new DoublyNode(data);

        if(head == null){
            head = node;
            return;
        }
            
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
        node.previous = current;
        node.next = null;
    }

    public void addFirst(int data){
        
        DoublyNode node = new DoublyNode(data);

        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head.previous = node;
        head = node;
    }

    public void add(int index, int data){

        DoublyNode node = new DoublyNode(data);

        if(index<0){
            System.out.println("Invalid index!");
            return;
        }
        
        if(index == 0){
            addFirst(data);
            return;
        }

        if(index>=size()){
            System.out.println("Index out of bound");
            return;
        }   
        
        DoublyNode current = head;
        int count=0;
        while (count != index-1) {
            current = current.next;
            count++;
        }

        node.next = current.next;
        node.previous = current;
        if(current.next != null){
            current.next.previous = node;
        }
        current.next = node;
    }

    //all remove operations
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }

        DoublyNode current = head;
        DoublyNode prev = null;
        while (current.next!= null)  {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        current.previous = null;
    }

    public void remove(int index){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if(index<0){
            System.out.println("Invalid index");
            return;
        }

        int len =size();
        if(index >= len){
            System.out.println("Index out of bound");
            return;
        }

        if(index == 0){
            removeFirst();
            return;
        }

        DoublyNode current = head; 
        int count = 0;
        while (count != index) {
            current = current.next;
            count++;
        }
        
        current.previous.next = current.next;
        if(current.next != null){
            current.next.previous = current.previous;
        }
        current.previous = null;
        current.next = null;
    }

    //All Get Operations
    public int getFirst(){
        return head != null ? head.data : -404;
    }

    public int getLast(){
        if(head == null){
            return -404;
        }   

        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public int get(int index){ 
        if(head==null){
            return -404;
        }

        if(index < 0){
            System.out.println("Invalid index");
            return -404;
        }

        int len = size();
        if(index>len){
            System.out.println("Index out of bound");
            return -404;
        }

        DoublyNode current = head;
        int count = 0;
        while (count != index) {
            current = current.next;
            count++;
        }
        return current.data;
    }

    //set operation
    public void set(int index, int data){

        if(head == null){
            System.out.println("List is empty!");
            return;
        }
       
        if(index<0){
            System.out.println("Invalid index");
            return;
        }
       
        int len = size();
        if(index >= len){
            System.out.println("Index out of bound");
            return;
        }
       
        DoublyNode current = head;
        int count = 0;
        while (count != index) {
            current = current.next;
            count++;
        }
        current.data = data;
        return;
    }

    // Size and isEmpty operations
    public int size(){
        if(head == null){
            return 0;
        }
        int size = 0;
        DoublyNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    // All display operations
    public void display(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("");
    }
   
    public void displayReverse(DoublyNode head){
        if (head == null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
}
