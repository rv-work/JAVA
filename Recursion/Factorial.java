import java.util.*;


public class Factorial{


public static long factorial(int number) {

  if( number == 1 || number == 0){
    return 1;
  } 
  return number *= factorial(number - 1 );
}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number : ");
    int num = sc.nextInt();

    long ans = factorial(num);
    System.out.print("Factorial of " + num + " is :"  + ans);
  }
}