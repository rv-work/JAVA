public class ArrayImplemention {
  
  private static class Stack{
    int[] arr = new int[50];
    int index = 0;

    void push(int x){
     if(index == arr.length) {
      System.out.println("Stack is Full!");
      return;
     } 
      else {
        arr[index] = x;
        index++;
      }
      
    }

    int peek(){
      if(index == 0) {
        System.out.println("Stack is Empty!");
        return -1 ;
      }

      else {
        return arr[index-1];
      }
    }

    int pop(){
      if(index == 0) {
        System.out.println("Stack is Empty!");
        return -1 ;
      }

      else {
        int top =  arr[index-1];
        arr[index-1] = 0;
        index--;
        return top;
      }
    }

    boolean isEmpty(){
     if(index==0) return true;
     else {
      return false;
     }
    }


    boolean isFull(){
     if(index==arr.length) return true;
     else {
      return false;
     }
    }

    int capacity(){
      return arr.length;
    }

    int size(){
      return index;
    }

    void display(){
      for (int i = 0; i < index; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(5);
    st.push(8);
    st.push(6);
    st.push(11);
    st.display();
    System.out.println(st.size());
    System.out.println(st.pop());
    st.display();
  }
}
