import java.util.Scanner;

public class DeletionFromArray {


    public static int[] NewArray(int[] arr, int Dnum) {
      int NoOfTimesDnum = OccurancesArray.NumberOfOccurances(arr, Dnum);
      int newSize = arr.length - NoOfTimesDnum;
      int[] newArray = new int[newSize];
          
      int j=0;
      for(int i =0; i<arr.length; i++){
       if(arr[i] != Dnum){
          newArray[j] = arr[i];
          j++;
        } 
      } return newArray;
    }

    

 public static void main(String[] args) {

      int[] arr = ArrayCall.InputArray();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number , You Want To Delete From Array:");
      int Dnum = sc.nextInt();
      int[] newArray = NewArray(arr, Dnum);
      ArrayCall.PrintArray(newArray);

  } 

}


