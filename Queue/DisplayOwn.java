import java.util.LinkedList;
import java.util.Queue;

public class DisplayOwn {
  public static void main(String[] args) {
  Queue<Integer> q = new LinkedList<>();
  q.add(5);
  q.add(4);;
  q.add(7);
  q.add(3);
  q.add(9);
  Queue<Integer> q2 = new LinkedList<>();

  while (q.size()>0) {
    System.out.print(q.peek());
    q.remove();
  } 
  while (q2.size()>0) {
    q.add(q2.remove());
  }

  }
}
