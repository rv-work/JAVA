public class Main {
  public static void main(String[] args) {
    
  Node a = new Node(3);
  Node b = new Node(5);
  Node c = new Node(7);

  
  a.next = b;
  b.next = c;
  
  display(a);
  System.out.println();
  displayRec(a);
  System.out.println();
  displayRecRev(a);
  insertAtEnd(a,5);
  System.out.println();
  display(a);
  }

    public static void insertAtEnd(Node head ,int value){
    Node t = new Node(value);
    Node temp = head;
      while (temp.next!= null) {
        temp = temp.next;
      }
      temp.next = t;
   }

  public static void display(Node head) {
    Node temp = head;
    while (temp != null) {
    System.out.print(temp.value + " ");
    temp = temp.next;
  }
  
}

  public static void displayRec(Node head) {
    if(head == null) return;
    System.out.print(head.value + " ");
    displayRec(head.next);
  }

  public static void displayRecRev(Node head) {
    if(head == null) return;
     displayRecRev(head.next);
    System.out.print(head.value + " ");
  }

  }

