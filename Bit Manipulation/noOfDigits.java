public class noOfDigits {
  public static void main(String[] args) {
    int num = 345565562;
    int b = 10;

    int ans = (int)( Math.log(num) / Math.log(b)) + 1 ;

    System.out.println(ans);
  }
}
