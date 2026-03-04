import java.util.*;

public class shortest {
  public static void main(String[] args) {
    String path = "WNEENESENNN";
    System.out.println(getShortestPath(path));
  }

  
   public static float getShortestPath(String path) {
    int X = 0, Y = 0;

    for (int i = 0; i < path.length(); i++) {
      if(path.charAt(i) == 'W'){
        X--;
      }
      else if(path.charAt(i) == 'N'){
        Y++;
      }
      else if(path.charAt(i) == 'S'){
        Y--;
      } 
      else {
        X++;
      }
    }

    int X2 = X*X;
    int Y2 = Y*Y;

    return (float)Math.sqrt(X2+Y2);

   }

}
