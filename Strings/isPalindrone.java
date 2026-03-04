import java.util.*;

public class isPalindrone {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Provide The String :");
    String str = sc.nextLine();
    System.out.println(Palindrone(str));
  }

  public static boolean Palindrone(String str) {
    for (int i = 0; i < str.length()/2; i++) {
      int n = str.length() -i -1;
      if(str.charAt(i) != str.charAt(n)){
        return false;
      } 
    } return true;
  }
}
