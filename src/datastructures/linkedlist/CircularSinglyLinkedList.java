package datastructures.linkedlist;

// Circular linked list implementation by Singly Linked list
public class CircularSinglyLinkedList implements IList {
    Node head;

    // All inset/add operations
    public void addFirst(int data){
        Node node = new Node(data);

        if(head == null){
            node.next = node;
        }else{
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);

        if(head==null){
            node.next = node;
            head = node;
            return;
        }else{
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
    }

    public void add(int index, int data){
        Node node = new Node(data);

        if (index<0) {
            System.out.println("invalid index");
            return;
        }

        if(index == 0){
             addFirst(data);
             return;
        }
        
        if (index>=size()) {
            System.out.println("Index out of bound");
            return;
        }

        Node current = head;
        int count = 0;
        while (count != index-1) {
            current= current.next;
            count++;
        }
        node.next = current.next;
        current.next = node;
    }

    //All remove/delete operations
    public void removeFirst(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        if(head.next == head){
            head = null;
        }else{
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        }        
    }

    public void removeLast(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if(head.next == head){
            head = null;
        }else{
            Node current = head;
            Node previous = null;
            while (current.next != head) {
                previous = current;
                current = current.next;
            }

            previous.next = head;
        }
    }

    public void remove(int index){
        if (index<0) {
            System.out.println("Invalid index.");
            return;
        }
        if (index >= size()) {
            System.out.println("Index out of bound!");
            return;
        }

        if(index == 0){
            removeFirst();
            return;
        }
        
        Node current = head;
        Node prev = null;
        int count = 0;
        while (count != index) {
            prev = current;
            current = current.next;
            count++;
        }
        prev.next = current.next;
        current.next = null;
    }

    //All get operations
    public int getFirst(){
       return head == null? -404 : head.data;
    }

    public int getLast(){
        if (head == null) {
            return -404;
        }
        Node current  = head;
        while (current.next != head) {
            current = current.next;
        }
        return current.data;
    }

    public int get(int index){

        if(index<0){
            return -404;
        }
        if (index >= size()) {
            return -404;
        }

        if (head == null) {
            return -404;
        }

        Node current = head;
        int count = 0;
        while (count != index) {
            current = current.next;
            count++;
        }

        return current.data;
    }

    //set operation
    public void set(int index, int data){

        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        int len = size();
        if (index >= len) {
            System.out.println("Index out of bound.");
            return;
        }

        Node current = head;
        int count = 0;
        while (count != index) {
            current = current.next;
            count++;
        }
        current.data = data;
    }

    //size and isEmpty
    public int size(){

        if (head == null) {
            return 0;
        }

        int size = 0;
        Node current = head;
        
        do{
            size++;
            current = current.next;
        }
        while (current != head);
        return size;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    //Display list
    public void display(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }

        Node current = head;
        do{
            System.out.print(current.data+" ");
            current = current.next;
        }while (current != head);
        
        System.out.println("");
    }
}

// Circular linked list implementation by doubly Linked list
class CircularDoublyLinkedList implements IList {

    DoublyNode head;
    
    public void addFirst(int data){
        DoublyNode node = new DoublyNode(data);
        
        if(head == null){
            node.next = node;
            node.previous = node;
            head = node;
            return;
        }
        
        head.previous.next = node;
        node.previous = head.previous; 
        node.next = head;
        head.previous = node;
        head = node;
    }
    
    public void addLast(int data){
        DoublyNode node = new DoublyNode(data);
        if (head == null) {
            addFirst(data);
            return;
        }

        head.previous.next = node;
        node.previous = head.previous;
        node.next = head;
        head.previous = node;
    }

    public void add(int index, int data){
        if(index<0){
            System.out.println("Invalid Index");
            return;
        }

        if(index >= size()){
            System.out.println("Index out of bound");
            return;
        }

        if(index == 0){
            addFirst(data);
            return;
        }

        DoublyNode node = new DoublyNode(data);

        DoublyNode current = head;
        int count = 0;
        while (count != index-1) {
            count++;
            current = current.next;
        }

        node.previous = current;
        node.next = current.next;
        current.next.previous = node;
        current.next = node;
        current = node;
    }

    // Remove operations
    public void removeFirst(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        head.next.previous = head.previous;
        head.previous.next = head.next;
        head = head.next;

    }

    public void removeLast(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }
        head.previous.previous.next = head;
        head.previous = head.previous.previous;
    }

    public void remove(int index){
        if (index<0) {
            System.out.println("Invalid index");
            return;
        }

        if (index>=size()) {
            System.out.println("Index out of bound");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        DoublyNode current = head;
        int count = 0;
        while (count != index) {
            count++;
            current = current.next;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;
    }

    // Get operations
    public int getFirst(){
        return head == null ? -404 : head.data;
    }

    public int getLast(){
        return head == null ? -404 : head.previous.data;
    }

    public int get(int index){

        if (index<0) {
            System.out.print("Invalid Index: ");
            return -404;
        }

        if (index >= size()) {
            System.out.print("Index out of bound: ");
            return -404;
        }

        if (head == null) {
            return -404;
        }

        DoublyNode current = head;
        int count = 0;
        while (count != index && current.next != head) {
            count++;
            current = current.next;
        }

        return current.data;
    }

    // Set / Update
    public void set(int index, int data){
        
        if (index<0) {
            System.out.println("Invalid Index: ");
            return;
        }

        if (index >= size()) {
            System.out.println("Index out of bound: ");
            return;
        }

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        DoublyNode current = head;
        int count = 0;
        while (count != index && current.next != head) {
            count++;
            current = current.next;
        }        
        current.data = data;
    }

    public boolean isEmpty(){
        return head == null ? true: false;
    }

    // Size and isEmpty
    public int size(){

        if (head == null) {
            return 0;
        }

        int size = 0;
        DoublyNode current = head;
        do{
            size++;
            current=current.next;
        }
        while (current != head);
        return size;
    }

    // Display list
    public void display(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        DoublyNode current = head;
        do{
            System.out.print(current.data + " ");
            current = current.next;
        }
        while (current != head);
        
        System.out.println("");
    }

}