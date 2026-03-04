import java.io.Serial;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {2,4,5,6,8,7,5,3,1};
    System.out.println(Search(arr, 4 , 0 , arr.length-1));
  }

  public static int Search(int[] arr , int target , int s, int e) {
    if(s > e){
      return -1;
    }
    
    int m = s + (e-s)/2;

    if(arr[m] == target){
      return m;
    }

    if(arr[s] <= arr[m]){
      if(target >= arr[s] && target <= arr[m]){
        return Search(arr , target , s , m-1);
      } else {
        return Search(arr , target , s+1 , e);
      }
    }

    if(target >= arr[m] && target <= arr[e]){
      return Search(arr , target , s+1 , e);
    }

    return Search(arr , target , s , m-1);

  }
}
