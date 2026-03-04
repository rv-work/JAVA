import java.util.Scanner;

public class Floor{
   
    public static void main(String[] args) {
      System.out.println("***NOTE : Provide a Sorted Array");
      int[] arr = ArrayCall.InputArray();
        int target = 4;
        floorSearch(arr,target);
    }


    static void floorSearch(int[] arr, int target) {
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
            System.out.println("Ceiling Element is : " + arr[end]);


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
            System.out.println("Ceiling Element is : " +arr[start]);
        }
    }
}


