

public class BoxPrice extends BoxWeight {
  double price;


 BoxPrice(double price){
  super();
  this.price = price;
 }


 BoxPrice(double price , double wt){
  super(wt);
  this.price = price;
 }


 BoxPrice(double price , double l, double w, double h , double wt ){
  super(l,w,h,wt);
  this.price = price;
 }


 BoxPrice(double price , double side , double wt ){
  super(side,wt);
  this.price = price;
 }





}
