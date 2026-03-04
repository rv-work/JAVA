public class CircularQueue {

  public static class Cqa{
    int front = -1;
    int rear = -1;
    int size = 0;
    int[] arr = new int[8];

    void add(int value) throws Exception{
      if(size == arr.length)  {
        throw new Exception("Queue is Full!");
      } 
      else if (size == 0){
        front = 0;
        rear = 0;
        arr[0] = value;
        size++;
      }
      else if (rear < arr.length-1){
        arr[++rear] = value;
        size++;
      }
      else if(rear == arr.length-1){
        rear = 0;
        arr[0] = value;
        size++;
      }
    } 

    int remove() throws Exception{
      if(size == 0)  {
        throw new Exception("Queue is empty!");
      } 
      else if (front == arr.length-1){
        int x = arr[front];
        front = 0;
        size--;
        return x;
      } 
      else {
        int x = arr[front];
        front++;
        size--;
        return x;
      }
    }

    int peek(){
      if(size == 0)  {
        System.out.println("Queue is empty!");
        return -1;
      } 

      else{
        return arr[front];
      }
    }

    void display(){
      if(size == 0)  {
        System.out.println("Queue is empty!");
        return;
      } else if (front < rear){
        for (int i = front; i <= rear; i++) {
          System.out.print(arr[i] + " ");
        }
      }
       else if (front > rear){
        for (int i = front; i <= arr.length-1; i++) {
          System.out.print(arr[i] + " ");
        }
        for (int i = 0; i <= rear; i++) {
          System.out.print(arr[i] + " ");
        }
        
      }
      System.out.println();
    }
  }
  public static void main(String[] args) throws Exception {
   Cqa q = new Cqa();
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
