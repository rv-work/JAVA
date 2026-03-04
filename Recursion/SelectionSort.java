import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
   int[] arr = {5,4,8,6};
   Selection(arr , arr.length-1 , 0 , 0); 
   System.out.println(Arrays.toString(arr)); 
  }


  public static void Selection(int[] arr, int row, int col , int max) {

    if(row == 0){
      return;
    }
    
    else if(row > col ){
      if(arr[col] > arr[max]){
        Selection(arr,row,col+1,col);
      } else {
        Selection(arr,row,col+1,max);
      }
    }
    else {
      int temp = arr[max];
      arr[max] = arr[row-1];
      arr[row-1] = temp;
      Selection(arr,row-1,col=0,max=0);
    }

  }

}
 