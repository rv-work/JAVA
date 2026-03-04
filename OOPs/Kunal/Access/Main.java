

public class Main {
  public static void main(String[] args) {
    A obj = new A(10, "Vishnu;");

    System.out.println(obj.name);
    //System.out.println(obj.num); this will give an error 
    System.out.println(obj.getNum());
  }
}
