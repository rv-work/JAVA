import java.util.Arrays;

public class CustomArrayList {
  
   private int DEFAUL_VALUE = 10;
   int [] data;
   int size = 0;

   public CustomArrayList() {
    this.data = new int[DEFAUL_VALUE];
   }

   public void add(int num){
    if(isFull()){
       resize();
    }
    data[size++] = num;
   }

  private void resize() {
    int[] temp = new int[data.length*2];
    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public int remove(){
    int removed = data[--size];
    return removed;
  }

  public int get(int index){
    return data[index];
  }

  public void set(int index, int value){
    data[index]= value;
  }

  private boolean isFull() {
    return size == data.length;
  }

  public int size(){
    return size ;
  }


  @Override
  public String toString(){
    return "CustomArrayList {" + 
    "data = " + Arrays.toString(data) +
    ", size = " + size +
    "}";
  }

}
