public class Constructers {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Vishnu");
    Student s3 = new Student(67);

    // System.out.println(s3.roll);
    // System.out.println(s2.name);

  }
}


class Student {
  String name;
  int roll;
  String password;

   Student() {
    System.out.println("Constructer has been called ...............");
   }
  
   Student(String Name){
    System.out.println(" Name Constructer has been called ...............");
    this.name = Name;
   }
   Student(int roll){
    System.out.println(" Roll No Constructer has been called ...............");
    this.roll = roll;
   }
}