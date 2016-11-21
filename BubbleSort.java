/* BubbleSort.java
 * Written by Vincent Zelinsky
 * 
 * Contains the necessary methods to sort data with the bubble sort algorithm
 */
import java.util.Arrays;
public class BubbleSort {
  //Private fields
  
  //Constructors
  public BubbleSort() {
  }
  
  //sortIntList method
  //Sorts a List with int data by transfering into an array, sorting the data, and then transferring it back to the List
  public void sortIntList(List listInput){
    //int array that will hold the data while it is being sorted
    int[] array;
    //Calls arrayOuput(arrayExport) which makes an array identical to listInput and stores it as the variable array
    array = (listInput.arrayOutput());
    //int variable for juggling values
    int temp;
    //int variables for counting
    int i,k;
    //boolean variable for determining when the sorting is complete(flag)
    boolean finished;
    
    //sets flag to false
    finished = false;
    
    //while flag is false loop
    while(!finished)
    {
      //System.out.println(Arrays.toString(array));
      
      //sets flag to true
      //this will only remain true if the for loop completes without swapping any elements
      finished = true;
      
      //for when i is less than array.length-1 loop then increment i
      for(i=0; i < array.length-1; i++)
      {
        //if array element i is less than the element next to it(i+1) then swap them
        if(array[i] > array[i+1])
        {
          //temp = current array element
          temp = array[i];
          //current array element = next array element
          array[i] = array[i+1];
          //next array element = temp(old current)
          array[i+1] = temp;
          
          //set flag to false because a swap occured
          finished = false;
        }
      }
    }
    //Now that the array is sorted
    //Calls arrayInput(arrayImport) which overwrites the elements in the List listInput with the elements in array
    listInput.arrayInput(array);
  }
}
