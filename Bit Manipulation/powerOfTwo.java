public class powerOfTwo {
  public static void main(String[] args) {
    int num = 62;


    if((num & (num-1)) == 0) {
      System.out.println("Yes this number is only power of 2");
    }
     else {
      System.out.println("No this number is only power of 2");
     }
    
  }
}
