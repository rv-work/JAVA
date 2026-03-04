
public class Basics {
  
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColour("Yellow");
    System.out.println(p1.colour);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.tip = 7;
    System.out.println(p1.tip);

    BankAccount myAcc = new BankAccount();
    myAcc.username = "vishnu";
   // myAcc.password = "rv"; : eror because it is a private so........
   myAcc.setPassword("rv");

   System.out.println(myAcc.username);
   //System.out.println(myAcc.password); , not possible , we can set only
  }
}


  class BankAccount{
   public String username;
   private String password;

   public void setPassword(String pwd){
    password = pwd;
   }
   

  }

  class Pen {
    String colour;
    int tip;

    void setColour(String newColour){
      colour = newColour;
    }

    void setTip(int newTip){
      tip = newTip;
    }
  }

  class Student {
    String name;
    int age;
    float percentage;

    void percentage(int phy, int chem , int maths){
      percentage = (phy + chem + maths) / 3;  
    }

    void setName(String newName){
      name = newName;
    }

    void setAge(int number){
      age = number;
    }

    }
  
