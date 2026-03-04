import java.util.LinkedList;
import java.util.Queue;

public class Basic {
 public static void main(String[] args) {
  Queue<Integer> q = new LinkedList<>();
  q.add(5);
  q.add(4);;
  q.add(7);
  q.add(3);
  q.add(9);
System.out.println(q.size());
System.out.println(q);
q.remove();
System.out.println(q.peek());
  System.out.println(q.size());
 }
}