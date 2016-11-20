/* BubbleSort.java
 * Written by Vincent Zelinsky
 * 
 * Contains the necessary methods to sort data with the bubble sort algorithm
 */
import java.util.Arrays;
public class BubbleSort {
  //Private fields
  //private Node t;
  //private Node lastPos;
  //Constructors
  public BubbleSort() {
    //this.t = null;
    //this.lastPos = null;
  }
  //sortIntList method
  //Sorts an Int
  public void sortIntList(List listInput){
    int[] array; 
    array = (listInput.arrayOutput());
    int temp;
    int i,k;
    boolean finished;
    
    finished = false;
    
    while(!finished)
    {
      //System.out.println("Step "+(array.length-k)+": ");
      //System.out.println(Arrays.toString(array));
      
      finished = true;
      
      for(i=0; i < array.length-1; i++)
      {
        if(array[i] > array[i+1])
        {
          temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          
          finished = false;
        }
      }
    }
    listInput.arrayInput(array);
  }
}
