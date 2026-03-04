public class ProductOfDigits {
  
  public static void main(String[] args) {
    int num = 5432;
    int ans = productOfDigits(num);
    System.out.println("Sum of digits is : " + ans);
  }


  public static int productOfDigits(int n) {
     if (n%10 == n){
      return n;
     }
    
   
     return n%10 * productOfDigits(n/10);
    
  }
  

}
