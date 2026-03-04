public class Human {
  int age;
  String name;
  int Salarry;
  boolean isMarried;
  static long population;

  public Human(int age,String name, int Salarry,boolean isMarried){
    this.age = age;
    this.name = name;
    this.Salarry = Salarry;
    this.isMarried = isMarried;
    Human.population += 1;
  }

}
