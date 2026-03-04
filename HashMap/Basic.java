import java.util.HashMap;
import java.util.Map;

public class Basic {

  public static void main(String[] args) {
    HashMapMethods();

  }

  static void HashMapMethods() {
    Map<String , Integer> mp = new HashMap<>();
    mp.put("Vishnu", 21);
    mp.put("Rutuja", 21);
    mp.put("Navneet", 21);
    mp.put("Suniti", 20);
    mp.put("Yash", 20);

    System.out.println(mp.get("Rutuja"));
    mp.putIfAbsent("Zohadur", 19);
    System.out.println(mp.containsKey("Rutuja"));
    System.out.println( mp.keySet());
    System.out.println( mp.remove("Yash"));
    System.out.println( mp.values());
    System.out.println(mp.entrySet());
    for(String key : mp.keySet()){
       System.out.printf("Age Of %s is %d\n" , key , mp.get(key));
    }
    for (var e : mp.entrySet()) {
      System.out.println("Age Of " + e.getKey() + "is " + e.getValue());
    }
    
  }
}