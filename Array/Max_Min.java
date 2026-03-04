import java.util.Scanner;

public class Max_Min {
  
  public static int Max(int[] arr) {
    int max = Integer.MIN_VALUE;
    for(int i =0; i<arr.length; i++){
      if( max < arr[i] ){
        max = arr[i];
      }
    } return max;
  }


  public static int Min(int[] arr) {
    int min = Integer.MAX_VALUE;
    for(int i =0; i<arr.length; i++){
      if( min > arr[i] ){
        min = arr[i];
      }
    } return min;
  }

  public static void main(String[] args) {
    int[] arr = ArrayCall.InputArray();
    int max = Max(arr);
    int min = Min(arr);
    System.out.println("Maximum In Array Is  : " + max);
    System.out.println("Minimum In Array Is  : " + min);
    

  }
}
