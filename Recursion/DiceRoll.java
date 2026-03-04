import java.util.ArrayList;

public class DiceRoll {
  public static void main(String[] args) {
    //Dice("", 4);
    //System.out.println(Diceret("", 4));
    //DiceFace("", 4 , 8);
    System.out.println(DiceFaceret("", 4 , 9));
  }

  static void Dice(String p , int target){
    if (target == 0){
      System.out.println(p);
      return;
    }
   
    for (int i = 1; i <= 6 && i <= target; i++) {
      Dice(p+i , target - i);
    }

  }



  static ArrayList<String> Diceret(String p , int target){
    if (target == 0){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> ans = new ArrayList<>();
   
    for (int i = 1; i <= 6 && i <= target; i++) {
      ans.addAll(Diceret(p+i , target - i));
    }
    return ans;
  }



  static void DiceFace(String p , int target , int face){
    if (target == 0){
      System.out.println(p);
      return;
    }
   
    for (int i = 1; i <= face && i <= target; i++) {
      DiceFace(p+i , target - i, face);
    }

  }



  static ArrayList<String> DiceFaceret(String p , int target , int face){
    if (target == 0){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> ans = new ArrayList<>();
   
    for (int i = 1; i <= face && i <= target; i++) {
      ans.addAll(DiceFaceret(p+i , target - i , face));
    }
    return ans;
  }
}
