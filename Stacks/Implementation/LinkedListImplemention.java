public class LinkedListImplemention {

  public static class Node {
    int value;
    Node next;
    Node(int value){
      this.value = value;
    }
  }

  public static class Stack {
    Node head = null;
    int size = 0;

    void push(int x) {
      Node temp = new Node(x);
      temp.next = head;
      head = temp;
      size++;
    }

    int pop() {
      if(head == null) {
        System.out.println("Stack is Empty!");
        return -1;
      } 
      Node temp = head;
      head = head.next;
      size--; // Decrease the size of the stack
      return temp.value;
    }

    int getSize() {
      return size;
    }

    void displayRec(Node h) {
      if(h == null) {
        return;
      } 
      displayRec(h.next);
      System.out.print(h.value + " ");
    }

    void display() {
      if(head == null) {
        System.out.println("Stack is Empty!");
      } else {
        displayRec(head);
        System.out.println();
      }
    }

    void displayRev() {
      Node temp = head;
      if(temp == null) {
        System.out.println("Stack is Empty!");
      } else {
        while (temp != null) {
          System.out.print(temp.value + " ");
          temp = temp.next;
        } 
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(5);
    st.push(8);
    st.push(6);
    st.push(11);
    st.display();
    System.out.println("Size: " + st.getSize());
    System.out.println("Popped: " + st.pop());
    st.display();
    System.out.println("Size: " + st.getSize());
    st.displayRev();
  }
}
