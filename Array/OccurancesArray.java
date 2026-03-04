import java.util.Scanner;

public class OccurancesArray {

  public static int NumberOfOccurances(int[] arr, int num) {
    int count = 0;
    for( int i =0; i<arr.length; i++) {
      if(arr[i] == num ) {
      count++; 
    }
    } return count;
    
  }
  
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int[] array = ArrayCall.InputArray();
   System.out.print("Enter The Number For You Want To Check Number Of Occurances : ");
   int num = sc.nextInt();
   int count = NumberOfOccurances(array, num );
   System.out.println("Your Entered Number is Found " + count + " Times In Array.");

}


}
