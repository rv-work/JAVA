import java.util.*;

public class Basic {
  public static void main(String[] args) {
    Deque<Integer> d = new LinkedList<>();

    d.add(5);
    d.addFirst(6);
    d.addLast(9);

    System.out.println(d);
    
    
  }
}
