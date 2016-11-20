/* Main.java(H5)
 * Written by Vincent Zelinsky
 * 
 * Contains the methods to test Stack.java and Queue.java
 */
public class Main {
  //main method
  public static void main(String[] args) {
    List myList = new List();
    
    myList.addNode();
    myList.addNode();
    myList.addNode();
    myList.addNode();
    //myList.popList(3);
    myList.printListForward();
    System.out.println("----------");
    //int[] myArray;
    //myArray = (myList.arrayOutput());
    //System.out.println(myArray[0]);
    //System.out.println(myArray[1]);
    //System.out.println(myArray[2]);
    //System.out.println(myArray[3]);
    //myList.arrayInput(myArray);
    
    //myList.printListForward();
    //myList.printListForward();
    //System.out.println(myList.length());
    
    BubbleSort sorter = new BubbleSort();
    sorter.sortIntList(myList);
    //System.out.println("fuck this");
    myList.printListForward();
  }
}