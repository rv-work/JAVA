
public class BoxWeight extends Box {
  double wt;


  BoxWeight(){
    super();
    this.wt = 1;
  }


  BoxWeight(double wt){
    super();
    this.wt = wt;
  }

  BoxWeight(BoxWeight other){
    super(other);
    this.wt = other.wt;
  }

  BoxWeight(double l, double w, double h , double wt){
    super(l,w,h);
    this.wt = wt;
  }

  BoxWeight(double side , double wt){
    super(side);
    this.wt = wt;
  }

}
