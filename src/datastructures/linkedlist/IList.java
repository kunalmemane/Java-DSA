package datastructures.linkedlist;

public interface IList {
        
    // Insert / Add operations
    public void add(int index, int data);
    public void addFirst(int data);
    public void addLast(int data);

    // Delete / Remove operations
    public void remove(int index);
    public void removeFirst();
    public void removeLast();

    // Get operations
    public int get(int index);
    public int getFirst();
    public int getLast();

    //Update / set operation
    public void set(int index, int data);

    // Size and isEmpty
    public int size();
    public boolean isEmpty();

    //Print / Display list
    public void display();

}
