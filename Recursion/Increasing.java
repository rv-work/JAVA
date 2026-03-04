import java.util.*;

public class Increasing {

  public static void printInc(int n) {
    if (n==1) {
      System.out.print(n+",");
      return;
    }
    printInc(n-1);
    System.out.print(n + ",");
   
  }

  public static void printIncR(int x ,int n) {
    if(x > n){
      return ;
    }
    System.out.println(x);
    printIncR(x+1, n);
  }
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter The Number You Want To Print :  ");
    int n = sc.nextInt();
    printIncR(1,n);
  }
}