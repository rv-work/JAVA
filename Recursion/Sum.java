import java.util.Scanner;

public class Sum {
  
   public static int sum(int n ) {
    if (n == 0 ){
      return 0;
    }
  
    return n + sum(n-1);

   }
    

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter The Number:  ");
    int n = sc.nextInt();
    int ans = sum(n);
    System.out.println("Sum is : " + ans);
  }
}
