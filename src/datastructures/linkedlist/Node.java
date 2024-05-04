package datastructures.linkedlist;

//Node having data + one node like: [[data]:[next]]
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }
}

// Node having data + two ends like: [[previous]:[data]:[next]]
class DoublyNode {
    DoublyNode previous;
    int data;
    DoublyNode next;

    public DoublyNode(int data){
        this.data = data;
    }

    public DoublyNode(DoublyNode prev, int data, DoublyNode next){
        this.previous = prev;
        this.data = data;
        this.next = next;
    }
}