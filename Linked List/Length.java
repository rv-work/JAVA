public class Length {
  public static void main(String[] args) {
    
  Node a = new Node(3);
  Node b = new Node(5);
  Node c = new Node(7);

  
  a.next = b;
  b.next = c;
  
  System.out.println(length(a , 0));
  
  }

  
  public static int length(Node head ,int count) {
    if(head == null) {
      return count; 
    }
    return length(head.next , count += 1);
  
  }

  }

