public class Sorted {
  public static void main(String[] args) {
    int[] arr = {5,6,8,9,8,14};
    System.out.println(checkSorted(arr, 0));

  }

  public static Boolean checkSorted(int[] arr , int index) {
    if(index == arr.length-1){
      return true;
    }
   
    return arr[index] < arr[index+1] && checkSorted(arr, index+1);

  }
}
