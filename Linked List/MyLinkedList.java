  public class MyLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

     void insertAtEnd(int value){
      Node temp = new Node(value);
      if(head == null){
        head = temp;
      }
      else{
        tail.next = temp;
      }

      tail = temp;
      size++;
     }

     void deleteAt(int index){
      if(index == 0){
        head = head.next;
        size--;
        return ;
      } 
      Node temp = head;
      for (int i = 0; i < index-1; i++) {
        temp = temp.next;
      }

      temp.next = temp.next.next;
      size--;
      tail = temp.next;

     }

     void insertAtStart(int value){
      Node temp = new Node(value);
      if(head == null){
        head = temp;
        tail = temp;
      }
      else{
        temp.next = head;
        head = temp;
      }
      size++;
     }

     int getAt(int index){
      if(index < 0 || index >= size){
        System.out.println("Wrong Index");
        return -1;
      }

      Node temp = head;
      for (int i = 0; i < index; i++) {
        temp = temp.next;
      } 
      return temp.value ;
     }


     void insertAt(int index,int value){
      Node t = new Node(value);
      Node temp = head;
      if(index == size){
        insertAtEnd(value);
        return ;
      }
       
      else if(index < 0 || index > size){
        System.out.println("Wrong Index");
        return ;
      }

      if(index == 0){
        insertAtStart(value);
        return ;
      }
      if(head == null){
        head = t;
        tail = t;
      }
      else{
        for (int i = 0; i < index-1; i++) {
          temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
      } 
      size++;
     }


     void display(){
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.value + " ");
        temp = temp.next;
      }
     }
}


