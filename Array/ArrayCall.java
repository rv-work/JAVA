import java.util.Scanner;

public class ArrayCall {
  
public static int[] InputArray() {
  
  Scanner sc = new Scanner(System.in);
  System.out.print("Please Enter The Size Of Array : " );
  int size = sc.nextInt();
  int[] nums = new int[size];
  
   for(int i =0; i<size; i++){
    System.out.print("Please Enter The Value For " + i + " Index" + " = " );
    int num = sc.nextInt();
    nums[i] = num;
   }
     return nums;
  }


  public static int[][] Input2DArray() {
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter Number Of Rows You Want To Create : " );
    int rows = sc.nextInt();
    System.out.print("Please Enter Number Of Columns You Want To Create : " );
    int columns = sc.nextInt();
    int[][] nums = new int[rows][columns];
    
     for(int i =0; i< rows; i++){
       for(int j = 0; j< columns; j++){
         System.out.print("Please Enter The Value For " + i + " Row & " + j + " Column  = " );
         int num = sc.nextInt();
          nums[i][j] = num;
       }
        
     }
       return nums;
    }
  

  public static void PrintArray(int[] newArray) {
    System.out.print(" Your New Array : {");
  for(int i =0; i<newArray.length; i++){
    System.out.print( newArray[i] + ",");
  } 
  System.out.print("} ");
  }

}







