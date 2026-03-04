import java.util.Scanner;

public class SearchIn2D {
  
   int[][] Array = ArrayCall.Input2DArray();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
      
    for(int i=0; i<Array.length; i++){
       for(int j=0; j<Array[i].length; j++) {
        if(Array[i][j] == num){
          System.out.print("Number Is Found at " + i +"row & " + j + "column");
        }
       }
    }
    
  }
}
