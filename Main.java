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
    myList.popList(10);
    
    System.out.println("Unsorted List:");
    myList.printListForward();
    
    System.out.println("----------");
 
    BubbleSort sorter = new BubbleSort();
    sorter.sortIntList(myList);
    
    System.out.println("Sorted List: ");
    myList.printListForward();
  }
}