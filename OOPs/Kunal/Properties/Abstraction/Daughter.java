public class Daughter extends Parent {

  @Override
  void career(String name) {
    System.out.println("I Want to be a " + name);
  }

  @Override
  void partner(String name , int age) {
    System.out.println("I Love  " + name + " and he is " + age + " years old");
  }
    
  }



