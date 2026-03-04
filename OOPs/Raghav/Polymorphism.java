public class Polymorphism {
  public static void main(String[] args) {
    
    Calculator c1 = new Calculator();
    System.out.println(c1.sum(2,3));
    System.out.println(c1.sum((float)2.5,(float)3.5));
    System.out.println(c1.sum(2,3,5));


    Dear d1 = new Dear();
    d1.eat(); // khud ka aayega naki parent ka 
  }
}


class Calculator{
  int sum(int a , int b){
    return a+b;
  }

  float sum(float a , float b){
    return a+b;
  }
  int sum(int a , int b , int c){
    return a+b+c;
  }
}

class Animal {
  String colour;
 
  void eat(){
   System.out.println("eats");
  }
 
  void breathes(){
   System.out.println("Breathes");
  }
}

  class Dear extends Animal {
    
      void eat(){
        System.out.println("eats grass");
      }
    }
    