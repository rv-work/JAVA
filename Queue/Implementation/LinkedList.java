public class LinkedList {

  public static class Node {
    int value;
    Node head;
    Node next;

    Node(int value){
      this.value = value;
    }
  }  

  public static class queueLL {
    int size = 0;
    Node head = null;
    Node tail = null;
    

    void add(int value){
      Node temp = new Node(value);
      if(size == 0){
        head = tail = temp;
        size++;
        return ;
      }

      tail.next = temp;
      tail = temp;
      size++;
    }

    int remove(){
      if(size == 0) {
        System.out.println("Queue is empty");
        return -1;
      }

      int x = head.value;
      head = head.next;
      size--;
      return x;
    }

    int peek(){
      if(size == 0) {
        System.out.println("Queue is empty");
        return -1;
      }

      return head.value;

    }

    void display(){
      if(size == 0) {
        System.out.println("Queue is empty");
        return ;
      }
      Node temp = head;
      while (temp!= null) {
        System.out.print(temp.value + " ");
        temp = temp.next;
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    queueLL q = new queueLL();
    q.add(8);
    q.add(7);
    q.add(3);
    q.add(5);
    q.add(51);
    q.display();
   System.out.println(q.remove());
   System.out.println(q.peek());
   System.out.println(q.size);
  }
}
