import java.util.Arrays;

public class nextPermutation {
  
   static void swap(int[] arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void reverse (int arr[] , int start , int end ){
    while (start <= end ) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end --;
    }
  }

  static void nextPermutation(int[] arr){
    int index = -1;
    for (int i = arr.length-2; i >= 0; i--) {
      if(arr[i] < arr[i+1]){
         index = i;
         break;
      }
    }

    for (int i = arr.length -1 ; i > index; i--) {
      if (arr[i] > arr[index]) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
        break ;
      }
    }

    reverse(arr, index+1, arr.length-1);
  }

  public static void main(String[] args) {
    int arr[] = {2,1,5,4,3,0,0};
    nextPermutation(arr);
    System.out.println(Arrays.toString(arr));
  }
}
