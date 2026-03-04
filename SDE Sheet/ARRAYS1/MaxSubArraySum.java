public class MaxSubArraySum {
  
  static int maxSum(int[] arr , int n){
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum += arr[k];
        }
        maxSum = Math.max(maxSum, sum);
      }
    }
    return maxSum;
  }

  static int maxSum2(int[] arr , int n){
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
          sum += arr[j];
          maxSum = Math.max(maxSum, sum);
      }
    }
    return maxSum;
  }
  static int maxSum3(int[] arr , int n){
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    int start = 0;
    int ansStr = -1, ansEnd = -1;
    for (int i = 0; i < n; i++) {
      if (sum==0) start = i;
        sum += arr[i];
        
        if (sum > maxSum) {
          maxSum = sum;
          ansStr = start ;
          ansEnd = i;
        }

        if (maxSum < 0) {
          maxSum = 0;
        }
    }

    for (int i = ansStr; i <= ansEnd; i++) {
      System.out.print(arr[i] + " ");
    } 
    System.out.println();
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    // int max = maxSum(arr, arr.length);
    // System.out.println(max);
    // int max2 = maxSum2(arr, arr.length);
    // System.out.println(max2);
    
    int max3 = maxSum3(arr, arr.length);
    System.out.println(max3);
    
  }
}



//https://xnxxcom.xyz/en/xnxx-clip/231142.html
//https://xnxxcom.xyz/en/xnxx-clip/331405.html
//https://xnxxcom.xyz/en/xnxx-clip/324335.html