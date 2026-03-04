public class PlayWithPrivate {
  public static void main(String[] args) {
  Pen p1 = new Pen();
  p1.setColour("Yellow");
  System.out.println(p1.getColour());
  p1.setTip(5);
  System.out.println(p1.getTip());
  p1.setTip(7);
  System.out.println(p1.getTip());

} 

}


class Pen {
   private String colour;
   private int tip;

  String getColour(){
     return this.colour;
  }

  int getTip(){
    return this.tip;
 }

  void setColour(String newColour){
    this.colour = newColour;
  }

  void setTip(int newTip){
    this.tip = newTip;
  }
}