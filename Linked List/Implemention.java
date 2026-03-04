public class Implemention {
  public static void main(String[] args) {
    MyLinkedList ll = new MyLinkedList();
    ll.insertAtEnd(5);
    ll.insertAtEnd(6);
    ll.insertAtStart(8);
    ll.insertAt(1, 9);
    ll.insertAt(0, 21);
    ll.display();
    System.out.println();
    //System.out.println(ll.getAt(4));
    ll.deleteAt(0);
    ll.display();
    System.out.println();
    System.out.print(ll.size);
    
    

  }
}

