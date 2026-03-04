public class Array {
  
  public static class queueA{
    int f = 0;
    int r = 0;
    int size = 0;
    int[] arr = new int[100];

    void add(int value){
      if (r== arr.length) {
        System.out.println("Queue is Full!");
        return ;
      }
        arr[r] = value;
        r++;
        size++;
    }

    int remove(){
      if(r==f){
        System.out.println("Queue is empty!");
        return -1;
      }
      
      else {
            int x = arr[f];
            f++;
            size--;
            return x;
      }
    }

    int peek(){
      if(r==f){
        System.out.println("Queue is empty!");
        return -1;
      }
      return arr[f];
    }

    void display(){
      if(r==f){
        System.out.println("Queue is empty!");
        return ;
      }
      
      for (int i = f; i < r; i++) {
        System.out.print(arr[i] + " ");
      } 
      System.out.println();

    }

    int size(){
      return size;
    }
  }

  public static void main(String[] args) {
  queueA q = new queueA();
    q.add(8);
    q.add(7);
    q.add(3);
    q.add(5);
    q.add(51);
    q.display();
   System.out.println(q.remove());
   System.out.println(q.peek());
   System.out.println(q.size());
  }
}
