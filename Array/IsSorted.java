public class IsSorted {
  
  public static boolean IsIncreasing(int[] arr) {
    boolean sort = true;
    for(int i =0; i<arr.length -1; i++) {
      if(arr[i] > arr[i+1]){
        sort = false;
      } 
    } return sort;
  }

  public static boolean IsDecreasing(int[] arr) {
    boolean sort = true;
    for(int i =0; i<arr.length -1; i++) {
      if(arr[i] < arr[i+1]){
        sort = false;
      } 
    } return sort;
  }

  public static void main(String[] args) {
    int[] arr = ArrayCall.InputArray();
    boolean IsInc = IsIncreasing(arr);
    boolean IsDec = IsDecreasing(arr);
     
     if( IsInc || IsDec) {
      System.out.println("Given Array is Sorted ");
     } else {
      System.out.println("Given Array is Not Sorted ");
     }
    
  }


}
