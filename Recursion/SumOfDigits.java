public class SumOfDigits {

  public static void main(String[] args) {
    int num = 5432;
    int ans = sumOFDigits(num);
    System.out.println("Sum of digits is : " + ans);
  }


  public static int sumOFDigits(int n) {
     if (n == 0){
      return 0;
     }
    
   
     return n%10 + sumOFDigits(n/10);
    
  }
  
}