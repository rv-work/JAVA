public class Doubly {

  public static class Node {
    int value;
    Node next;
    Node prev;

    Node(int value){
      this.value = value;
    }
    
   public static void display(Node head) {
    Node temp = head;
    while(temp!= null){
      System.out.print(temp.value + " ");
      temp = temp.next;
    } 
    System.out.println();
   }

   public static void display2(Node Random) {
    Node temp = Random;
    while(temp.prev!= null){
      temp = temp.prev;
    } 
    while(temp!= null){
      System.out.print(temp.value + " ");
      temp = temp.next;
    } 
    System.out.println();
   }


   public static Node insertionAtHead(Node head , int x) {
    Node t = new Node(x);
    t.next = head;
    head.prev = t;
    head = t;
    return head;
   }

   public static Node insertionAtTail(Node tail , int x) {
    Node t = new Node(x);
    t.prev = tail;
    tail.next = t;
    tail = t;
    return tail;
   }

   
   public static Node insertionAtTailBYHead(Node head , int x) {
    Node temp = head;
    while(temp.next!= null){
      temp = temp.next;
    }
    Node t = new Node(x);
    t.prev = temp;
    temp.next = t;
    temp = t;
    return head;
   }


   public static void insertATIndex(Node head , int index, int value) {
    Node temp = head;
    int i = 1;
    while(i<index -1 && temp.next != null){
      temp = temp.next;
      i++;
    }

    Node temp2 = temp.next;

    Node t = new Node(value);
    temp.next = t;
    t.prev = temp;
    t.next = temp2;
    temp2.prev = t;
   }



   public static void displayRev(Node tail) {
    Node temp = tail;
    while(temp!= null){
      System.out.print(temp.value + " ");
      temp = temp.prev;
    } 
    System.out.println();
   }

  }
  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(7);
    Node c = new Node(8);
    Node d = new Node(6);
    Node e = new Node(3);
    
    a.prev = null;
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = null;


   
    // Node.display(a);
    // Node.displayRev(e);

    //Node.display2(c);
    // Node newhead = Node.insertionAtHead(a, 11);
    // Node.display(newhead);
    // Node newtail = Node.insertionAtTail(e, 21);
    // Node.displayRev(newtail);

    //Node.insertionAtTailBYHead(a,27);
    Node.insertATIndex(a, 2, 11);
    Node.display(a);
  }
}
