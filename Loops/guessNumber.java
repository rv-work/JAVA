import java.util.*;

public class guessNumber {


  public static void GuessNumber(int num) {
    Scanner sc = new Scanner(System.in);
    int num2;
    do {
      System.out.print("Enter To Check :  ");
      num2 = sc.nextInt();
      if (num2 != num) {
        System.out.println("Ohhhhh.........Try Again .. ");
      }

    } while(num2 != num);
    System.out.println("Congratulation.............You Cracked It");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A Number :");
    int num = sc.nextInt();
     GuessNumber(num);
  


  }
}