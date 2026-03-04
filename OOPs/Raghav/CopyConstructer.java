public class CopyConstructer {
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.name = "Vishnu";
    s1.roll = 67;
    s1.password = "rv";
    s1.marks[0] = 90;
    s1.marks[1] = 80;
    s1.marks[2] = 100;

    Student s2 = new Student(s1);
    s1.marks[1] = 100;
    for(int i = 0; i<3; i++){
         System.out.println(s2.marks[i]);
    }
    
  }
}

class Student {
  String name;
  int roll;
  String password;
  int marks[];

  //Default constructor
  Student() {
    marks = new int[3]; // Initialize the marks array
  }

  // Copy constructor
  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    //this.marks = s1.marks;     ........... isme change ho jayega 

   // isme change nhi hoga
    for (int i = 0; i < 3; i++) {
      this.marks[i] = s1.marks[i];
    } 
  }
}
