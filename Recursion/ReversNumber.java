public class ReversNumber {
  public static void main(String[] args) {
    Reverse(52648);
    //System.out.println(sum);
    System.out.println(Reverse2(52648));
  } 
  
  static int sum = 0;
  public static void Reverse(int n) {
    if(n == 0){
      return  ;
    }
    sum = sum*10 + n%10;
    Reverse(n/10); 

  }


  public static int Reverse2(int num) {
    int digit = (int)(Math.log10(num)) + 1;
    return helper(num , digit);
  }

  public static int helper(int n , int digit) {
    if(n%10 == 0){
      return n;
    }

    return (n%10)*(int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
  }

}