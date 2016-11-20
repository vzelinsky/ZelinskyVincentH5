/* List.java(Sorting)
 * Written by Vincent Zelinsky
 * 
 * Contains the necessary methods to create a Singly Linked List, interacts with Node(Sorting).java
 */
import java.util.Random;
public class List {
  //Private fields
  //Contains a reference to the head Node object
  private Node head;
  //Contains a reference to the tail Node object
  private Node tail;
  
  //Constructors
  //No argument constructor that when called creates an empty List
  public List() {
    //Sets head to null
    this.head = null;
    //Sets tail to null
    this.tail = null;
  }
  
  //Methods
  //Getter methods
  //Returns the reference to the Node stored at head
  public Node getHead() {
    return head;
  }
  //Returns the reference to the Node stored at tail
  public Node getTail() {
    return tail;
  }
  
  //addNode method
  //Adds a Node to the List in chronological order
  public void addNode() {
    //if the List is empty (head = null)
    //Inserts the new Node at head and makes it the tail as it is the only Node
    if(head == null) {
      Random rand = new Random();
      int random = rand.nextInt(100);
      //Add the Node as the head
      head = new Node(random);
      //Set the tail to the same Node as head
      tail = head;
    }
    else {
      Random rand = new Random();
      int random = rand.nextInt(100);
      //Creates a new Node and calls the third constructor in Node
      //The argument gets passed as the int, the next Node is null, and the prev Node is the tail 
      Node n = new Node(random, null, tail);
      //The new Node is added as the next Node of the current tail
      tail.setNext(n);
      //The new Node is the new tail
      tail = tail.getNext();
    }
  }
  //addNode method
  //Adds a Node to the List in chronological order
  public void addNode(int input) {
    //if the List is empty (head = null)
    //Inserts the new Node at head and makes it the tail as it is the only Node
    if(head == null) {
      //Add the Node as the head
      head = new Node(input);
      //Set the tail to the same Node as head
      tail = head;
    }
    else {
      //Creates a new Node and calls the third constructor in Node
      //The argument gets passed as the int, the next Node is null, and the prev Node is the tail 
      Node n = new Node(input, null, tail);
      //The new Node is added as the next Node of the current tail
      tail.setNext(n);
      //The new Node is the new tail
      tail = tail.getNext();
    }
  }
  
  //popList method
  //Populates the List with listLength(the argument) amount of random int Nodes
  public void popList(int listLength) {
    for(int i = 0; i<listLength; i++) {
      this.addNode();
    }
  }
  
  //arrayOutput method
  //Returns an array with identical contents of the List
  public int[] arrayOutput() {
    int[] arrayOutput = new int[this.length()];
    Node t = head;
    for (int i = 0; i < this.length(); i++){
      arrayOutput[i] = t.getData();
      t = t.getNext();
    }
    return arrayOutput;
  }
  //arrayInput method
  //Takes in an array and overwrites the contents of the List
  public void arrayInput(int[] arrayInput){
    this.deleteList();
    for (int i = 0; i < arrayInput.length; i++){
      this.addNode(arrayInput[i]);
    }
  }
  
  //Print methods
  //printListForward method 
  //Traverses list and prints every Node alphabetically forward (from head to tail)
  public void printListForward() {
    //Initializes a traversal Node, t, at head
    Node t = head;
    //While the Node t is not equal to null loop
    while(t != null) {
      //Print the data stored in the current Node that Node t is at
      System.out.println(t.getData());
      //Traverse Node t to the next Node in the List
      t = t.getNext();
    }
  }
  
  //length method
  //Returns the length of the List
  public int length() {
    //Initializes a traversal Node, t, at head
    Node t = head;
    int i = 0;
    //While the Node t is not equal to null loop
    while(t != null) {
      i++;
      //Traverse Node t to the next Node in the List
      t = t.getNext();
    }
    return i;
  }
  
  //deleteTail method
  //Deletes the tail Node and sets the new tail
  public void deleteTail() {
    //Initializes a temp Node to be deleted, d, at tail
    Node d = tail;
    //if the tail is null
    if(d == null) {
      //Print that the Node does not exist
      System.out.println("Node did not exist");
    }
    else {
      //Initializes the Node next to the Node after Node d
      Node next = d.getNext();
      //Initializes the Node prev to the Node before Node d
      Node prev = d.getPrev();
      //if the Node before Node d is null (Node d is head)
      if(prev == null)
        //head is now the Node after Node d
        head = next;
      else
        //The next Node after Node prev is Node next (routing around Node d) 
        prev.setNext(next);
      //if the Node after Node d is null (Node d is tail)
      if(next == null)
        //tail is now the Node before Node d
        tail = prev;
      else
        //The prev Node before Node next is Node prev (routing around Node d)
        next.setPrev(prev);
      //Print success
      //System.out.println("The Node has been deleted");
    }
  }
  
  //deleteList method
  //Removes references to the List, deleting the List
  public void deleteList() {
    //Makes head null
    this.head = null;
    //Makes tail null
    this.tail = null;
    /* Everything else is swept up by garbage collection
     */
    //Print success
    System.out.println("The List has been deleted");
  }
}