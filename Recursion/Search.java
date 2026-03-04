import java.util.ArrayList;

public class Search {
  public static void main(String[] args) {
    int[] arr = {4,2,7,6,8,7,3,9};
    System.out.println(CheckLinearSearch(arr, 7 , 0));
    System.out.println(LinearSearch(arr, 7 , 0));
    System.out.println(LinearSearchFromLast(arr, 7 , arr.length-1));
    LinearSearchAll(arr, 7 , 0);
    System.out.println(list);
    System.out.println(LinearSearchAll2(arr, 7 , 0 , new ArrayList<>()));
    System.out.println(LinearSearchAll3(arr, 7 , 0));

  }


  public static Boolean CheckLinearSearch(int[] arr , int target, int index) {
    if(index == arr.length){
      return false;
    }
    
    return arr[index] == target || CheckLinearSearch(arr, target, index+1);

  }


  public static int LinearSearch(int[] arr , int target, int index) {
    if(index == arr.length){
      return -1;
    }
    
    if(arr[index] == target){
      return index;
    }
    else {
      return LinearSearch(arr, target, index+1);
    }
  }


  public static int LinearSearchFromLast(int[] arr , int target, int index) {
    if(index == -1){
      return -1;
    }
    
    if(arr[index] == target){
      return index;
    }

    else {
      return LinearSearchFromLast(arr, target, index-1);
    }

  }

  static ArrayList<Integer> list = new ArrayList<>();
  public static void LinearSearchAll(int[] arr , int target, int index) {
    if(index == arr.length){
      return ;
    }
    
    if(arr[index] == target){
      list.add(index);
    }

    LinearSearchAll(arr, target, index+1);
  }


  
  static ArrayList LinearSearchAll2(int[] arr , int target, int index , ArrayList<Integer> list) {
    if(index == arr.length){
      return list;
    }
    
    if(arr[index] == target){
      list.add(index);
    }

    return LinearSearchAll2(arr, target, index+1 , list);
  }


  
  public static ArrayList<Integer> LinearSearchAll3(int[] arr , int target, int index) {
    ArrayList<Integer> list = new ArrayList<>();
    if(index == arr.length){
      return list;
    }
    
    if(arr[index] == target){
      list.add(index);
    }

    ArrayList<Integer> ansFromBelowCalls = LinearSearchAll3(arr, target, index+1);
    list.addAll(ansFromBelowCalls);
    return list;
  }

}
