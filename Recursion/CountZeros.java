public class CountZeros {
  public static void main(String[] args) {
    System.out.println(Count(98050060));
  }

  public static int Count(int num) {
 
    return helper(num , 0);

  }


  public static int helper(int n, int c) {
    if(n == 0){
      return c;
    }

    int rem = n%10;

    if(rem == 0){
      return helper(n/10, c+1);
    }

    return helper(n/10, c);



  }
}
