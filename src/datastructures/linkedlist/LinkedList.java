/* 
 * You can test all the List functions one by one.
 * 
 *      list.add(0, 0);
        list.add(0, 10);
        list.add(0, 20);
        list.add(0, 30);

        list.display();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));
        list.remove(0);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());
        list.set(4, 0);
        System.out.println(list.isEmpty());
 * 
 * Author - Kunal Memane [LinkedIn - @kunalmemane]
 * Note - Please report bugs if any.
*/

package datastructures.linkedlist;

public class LinkedList {
    
    public void InitLinkedList(){

        //Singly linked list implementation - Uncomment to test the output
        singlyLinkedList();

        //Doubly linked list implementation - Uncomment to test the output
        // doublyLinkedList();

        //CircularLinkedList implementation - Uncomment to test the output
        // circularSinglyLinkedList();
        // circularDoublyLinkedList();
    }

    public void singlyLinkedList(){

        System.out.println("Singly Linked List:");

        //Initialize singly liked list
        IList list = new SinglyLinkedList();

        //add elements at end
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        
        //add element at start
        list.addFirst(50);
        list.display();
        
        //update/set element at specific index
        list.set(0, 100);
        list.display();
        
        //get element from specific index
        System.out.println("At 2: " + list.get(2));

        //print final result
        System.out.println("\nFinal result: ");
        System.out.println("Size: "+ list.size());
        System.out.println("First element: "+ list.getFirst());
        System.out.println("Last element: "+ list.getLast());
        System.out.print("List: ");
        list.display();
        
              
    }

    public void doublyLinkedList(){

        System.out.println("\nDoubly Linked List:");

        //Initialize Doubly linked list
        IList list = new DoublyLinkedList();

        //add elements at end
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        
        //add elements at start
        list.addFirst(50);
        list.display();
      
        // add element at specific index
        list.add(4, 101);
        list.display();
        
        //update/set element at specific index
        list.set(4, 11);
        list.display();
        
        //get element at specific index
        System.out.println("Element at 2: " +list.get(2));

        //print final result
        System.out.println("\nFinal output: ");
        System.out.println("Size: "+ list.size());
        System.out.println("First element: "+ list.getFirst());
        System.out.println("Last element: "+ list.getLast());
        System.out.print("List: ");
        list.display();

    }
 
    public void circularSinglyLinkedList(){
        
        System.out.println("\nCircular Linked List: ");

        //initialize Circular linked list
        IList list = new CircularSinglyLinkedList();

        //add elements at end
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        
        //add elements at start
        list.addFirst(50);
        list.display();

        //update/set element at specific index
        list.set(3, 1001);
        list.display();

        //remove first element
        list.removeFirst();
        list.display();
        
        //get element at specific index
        System.out.println("Element at 2: "+ list.get(2));

        //print final result
        System.out.println("\nFinal output: ");
        System.out.println("Size: "+ list.size());
        System.out.println("First element: "+ list.getFirst());
        System.out.println("Last element: "+ list.getLast());
        System.out.print("List: ");
        list.display();
    }

    public void circularDoublyLinkedList(){
        
        IList list = new CircularDoublyLinkedList();

        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.display();
      
        list.addLast(10);
        list.display();

        list.add(1, 100);
        list.display();
        
        list.removeFirst();
        list.display();

        list.set(3, 200);
        list.display();

        System.out.println("At 2: " + list.get(2));

        System.out.println("\nFinal Result:");
        System.out.println("Size: " + list.size());
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.print("List: ");
        list.display();
    }
}
