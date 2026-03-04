public class Inheritance {

  public static void main(String[] args) {
    Fish f1 = new Fish();
    f1.eat();
    shark s1 = new shark();
    s1.weight();
    s1.colour = "White";
    System.out.println(s1.colour);

    bird b1 = new bird();
    b1.fly();



  }
}

class Animal {
 String colour;

 void eat(){
  System.out.println("Eats");
 }

 void breathes(){
  System.out.println("Breathes");
 }


}


class Fish extends Animal {
int fins ;

  void swim(){
    System.out.println("Swimmingh");
  }
}

class shark extends Fish {
  int size;

  void weight(){
    System.out.println("Heavy Wt.");
  }
}

class bird extends Animal {

   void fly(){
    System.out.println("Bird is flying");
   }
}