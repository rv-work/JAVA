import java.util.Scanner;
import java.util.Stack;

public class Move {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n ;
      System.out.println("Enter The Number Of Elements You Want To Insert :");
      n = sc.nextInt();
      System.out.println("Enter The Elements : ");
      Stack<Integer> st = new Stack<>();
      for (int i = 1; i <= n; i++) {
        st.push(sc.nextInt());
      }
       
      System.out.println(st);

      Stack<Integer> gt = new Stack<>();
      while(st.size()>0){
           gt.push(st.pop());
      }
      System.out.println(gt);


      Stack<Integer> rt = new Stack<>();
      while(gt.size()>0){
           rt.push(gt.pop());
      }
      System.out.println(rt);
    }
  }
}
