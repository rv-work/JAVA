import java.util.*;

public class BubbleSort {
  
  public static void main(String[] args) {
    int[] arr = {3,2,0,5,-4,1};
    sortTheArray(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sortTheArray(int[] arr) {
    boolean swapped;
    for(int i =0; i < arr.length-1; i++){
      swapped = false;
      for(int j =0; j < arr.length-i-1; j++){
        if(arr[j] > arr[j+1]){
          //swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }
      }
      if (!swapped){
        break;
      }
    }
  }

}
