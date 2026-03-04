import java.util.Scanner;

public class BinarySearch{
   
    public static void main(String[] args) {
      System.out.println("***NOTE : Provide a Sorted Array");
      int[] arr = ArrayCall.InputArray();
        int target = 4;
        binarySearch(arr,target);
    }


    static void binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    System.out.println("Target Element Found At Index " + mid);
                    return;
                } 
            }
            System.out.println("Target Element is Not in Provided Array ");


        } else  {
            while (arr[start] >= arr[end]) {
                int mid = start + (end - start) / 2;

                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    System.out.println("Target Element Found At Index " + mid);
                    return;
                } 
            }
            System.out.println("Target Element is Not in Provided Array ");
        }
    }
}
