public class Build {
  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(5);
    Box box3 = new Box(box1);
    BoxWeight box5 = new BoxWeight(5);
    BoxWeight box4 = new BoxWeight(5,4,6,8);
    BoxPrice box6 = new BoxPrice(600);



    // System.out.println(box1.l);
    // System.out.println(box2.l);
    // System.out.println(box3.l);
    // System.out.println(box4.l);
    // System.out.println(box4.h);
    //System.out.println(box5.l);
    System.out.println(box6.wt);
  }
}
