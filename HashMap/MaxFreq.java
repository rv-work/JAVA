import java.util.*;

public class MaxFreq {
  public static void main(String[] args) {
    int[] arr = {1,2,4,3,5,8,9,3,4,6,5,1,2,5,3,7,5,6,9,8,6,3};
    Map<Integer,Integer> freq = new HashMap<>();
    for (int i : arr) {
      if(!freq.containsKey(i)){
        freq.put(i, 1);
      } else {
        freq.put(i, freq.get(i) + 1);
      }
    }

    System.out.print("Frequency Map : ");
    System.out.println(freq.entrySet());
    int maxFreq = 0, ansKey = -1;
    
    for (var el : freq.keySet()) {
      if(freq.get(el) > maxFreq){
        maxFreq = freq.get(el);
        ansKey = el;
      }
    }

    System.out.println("Element : " + ansKey + " Has Highest No Of Appearence , That Is " + maxFreq );

  }
}
