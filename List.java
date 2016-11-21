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
  
  //addNode methods
  //Adds Nodes to the List in chronological order
  //Adds a Node to the List with a random int (0-100) as the data for the Node
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
  //Overloades addNode method
  //Adds a Node to the List with the int argument as the data for the Node
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
    //for when i is less than desired listLength loop then increment i 
    for(int i = 0; i<listLength; i++) {
      //add a Node to the List with random int data
      this.addNode();
    }
  }
  
  //arrayOutput method
  //Returns an array with identical contents of the List
  public int[] arrayOutput() {
    //Creates a new array with length equal to that of the List that called it
    int[] arrayOutput = new int[this.length()];
    //Initializes a traversal Node, t, at head
    Node t = head;
    //for when i is less than the length of the this List loop then increment i
    for (int i = 0; i < this.length(); i++){
      //sets array element of index i equal to the data stored in the current Node
      arrayOutput[i] = t.getData();
      //Traverses the Node to the next Node in the List
      t = t.getNext();
    }
    return arrayOutput;
  }
  //arrayInput method
  //Takes in an array and overwrites the contents of the List
  public void arrayInput(int[] arrayInput){
    //Delete the elements in the List
    this.deleteList();
    //for when i is less than the length of the array loop then increment i
    for (int i = 0; i < arrayInput.length; i++){
      //Adds a new node with the value of array index i
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
    //Initializes counter
    int i = 0;
    //While the Node t is not equal to null loop
    while(t != null) {
      //Increment counter
      i++;
      //Traverse Node t to the next Node in the List
      t = t.getNext();
    }
    return i;
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
    //System.out.println("The List has been deleted");
  }
}