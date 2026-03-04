public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {4,5,8,6,7,9,1};
    int target = 8;
    Search(arr, target);
  }


  static void Search(int arr[], int target ) {
    for(int i=0; i<arr.length; i++){
      if (target == arr[i]){
        System.out.println("Yes We get it at index "+i);
      }
    }
  }

}
