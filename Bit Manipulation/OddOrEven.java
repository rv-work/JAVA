import java.util.*;

public class OddOrEven {
  
  public static void OddEven(int n ) {
    int bit = 1;
    if(( n & bit) == 0 ) {
      System.out.println("Number is Even");
    } else {
      System.out.println("Number is Odd");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number That You Want To Check : ");
    int n = sc.nextInt();
    OddEven(n) ;
  }
}
