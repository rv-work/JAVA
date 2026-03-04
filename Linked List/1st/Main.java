public class Main {
  public static void main(String[] args) {
    
  Node a = new Node(3);
  Node b = new Node(5);
  Node c = new Node(7);
  Node d = new Node(9);
  Node e = new Node(6);
  
  a.next = b;
  b.next = c;
  c.next = d;
  d.next = e;
  
  // System.out.println(a.value);
  // System.out.println(a.next.value);
  // System.out.println(a.next.next.value);
  // System.out.println(a.next.next.next.value);
  // System.out.println(a.next.next.next.next.value);
  Node temp = a;
  for (int i = 0; i <= 4; i++) { // foer this we need size .. what if we dont have  so while loop
    System.out.print(temp.value + " ");
    temp = temp.next;
  }
 

  }
}
