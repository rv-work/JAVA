public class Duplicate{

  public static void findDuplicate(int[] array) {
     for(int i = 0; i<array.length; i++){
        for(int j = i+1; j<( array.length - i); j++) {
        if ( array[j] == array[i]) {
           System.out.println("duplicated number is  " + array[j] );
        } 
     }
  } 
}


public static void findDuplicate2(int[] array) {
    int tempArr[] = new int[array.length];
     for(int i = 0; i<array.length; i++) {
      if(tempArr[array[i]] == 1){
        System.out.println("duplicated number is  " + array[i] );
        break;
      } else {
        tempArr[array[i]] = 1;
      }
     }
}


public static void findDuplicate3(int[] array) {
  int n = array.length;
  int Sum =( n*(n-1))/2;
  int summ = 0;
  for(int i = 0; i<array.length; i++){
    summ = summ + array[i];
  } 
   System.out.println("Our Duplicate Number : " + (summ - Sum));
  
}


public static void main(String[] args) {
  
 int arr[] = {1,2,3,4,2,5,6};
 findDuplicate3(arr);
}
}
