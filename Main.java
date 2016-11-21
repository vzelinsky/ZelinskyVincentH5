/* Main.java(H5)
 * Written by Vincent Zelinsky
 * 
 * Contains the methods to test Stack.java and Queue.java
 */
public class Main {
  //main method
  public static void main(String[] args) {
 
    List myList = new List();
    
    //myList.addNode();
    //myList.addNode();
    //myList.addNode();
    
    //Populates myList with 10  elements
    myList.popList(10);
    
    //Prints myList(unsorted) to console
    System.out.println("Unsorted List:");
    myList.printListForward();
    
    System.out.println("----------");
 
    //Creates an instance of BubbleSort
    BubbleSort sorter = new BubbleSort();
    //Calls sortIntList and passes myList
    sorter.sortIntList(myList);
    
    //Prints the sorted myList to console
    System.out.println("Sorted List: ");
    myList.printListForward();
  }
}