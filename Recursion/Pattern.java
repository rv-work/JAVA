public class Pattern {
  public static void main(String[] args) {
    Triangle2(4,0);
  }

  public static void Triangle1(int row, int col) {
    if(row == 0){
      return;
    }

    if(row > col ){
      System.out.print("*");
      Triangle1(row,col+1);
    }

    if(row == col){
      System.out.println();
      Triangle1(row-1,col=0);
    }

  }



  public static void Triangle2(int row, int col) {
    if(row == 0){
      return;
    }

    if(row > col ){
      Triangle2(row,col+1);
      System.out.print("*");
    }

    if(row == col){
      Triangle2(row-1,col=0); 
      System.out.println();
    }

  }
}
