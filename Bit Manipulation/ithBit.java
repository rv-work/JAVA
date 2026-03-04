import java.util.*;

public class ithBit {

 public static int getIth(int n , int i ) {
  int bit = 1<<i;
  if(( n & bit) == 0) {
    return 0;
  } else {
    return 1;
  }
 }
 

 public static int setIth(int n , int i ) {
  int bit = 1<<i;
    return n | bit;
 }

 public static int clearIth(int n , int i ) {
  int bit = ~(1<<i);
    return n & bit;
 }
 
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number For Which You Want To Check : ");
    int n = sc.nextInt();
    System.out.print("Enter The Position at : ");
    int i = sc.nextInt();
    //System.out.println(getIth(n,i));
    //System.out.println(setIth(n,i));
    System.out.println(clearIth(n,i));
    
    
  }
}