
import java.util.*;

public class MaxInteger {

  public static void maxInteger(int[] array) {
    int max = Integer.MIN_VALUE;
    for(int num: array){
      if(max < num){
        max = num;
      } 
    } System.out.println("Max Integer in Array is : " + max);
  }

  public static void main(String[] args) {
     int[] arr = ArrayCall.InputArray();
     maxInteger(arr);

  }
 
}