import java.util.Stack;

public class Insertion {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    
    int index = 3;
    int value = 7;

    Stack<Integer> t =  new Stack<>();
    while (st.size() >= index) {
      t.push(st.pop());
    }
    st.push(value);

    while (t.size() > 0) {
      st.push(t.pop());
    }

    System.out.println(st);
  }
}
