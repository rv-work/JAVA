import java.util.Arrays;

public class CycleSort {
  public static void main(String[] args) {
    int[] arr = {1,5,6,8,3,4};
    Sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void Sort(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
           int correct = arr[i] -1;
             if(arr[i] != arr[correct]){
              int temp = arr[i];
              arr[i] = arr[correct];
              arr[correct] = temp;
              break;
      } 
    }
  }
}
