/* BubbleSort.java
 * Written by Vincent Zelinsky
 * 
 * Contains the necessary methods to sort data with the bubble sort algorithm
 */
public class BubbleSort {
  //Private fields
  private Node t;
  //private Node lastPos;
  //Constructors
  public BubbleSort() {
    this.t = null;
    //this.lastPos = null;
  }
  //sortIntList method
  //Sorts an Int
  public void sortIntList(List listInput){
    Node temp;
    int k = 0;
    for(int i = listInput.length()-1; i != 0; i--){
      k++;
    }
    System.out.println(k);
  }
}
