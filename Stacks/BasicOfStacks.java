import java.util.Stack;

public class BasicOfStacks {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(7);
    st.push(5);
    st.push(8);
    st.push(11);
    System.out.println(st.peek());
    System.out.println(st);
    System.out.println("Size of Stack : " + st.size());
  }
}