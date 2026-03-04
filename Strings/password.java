// import java.util.*;

// public class password {


//   public static void checkPassword() {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Create A New Password : ");
//     String pass = sc.nextLine();

//     String pass1;
//     do {
//       System.out.print("Enter Password To Unlock : ");
//        pass1 = sc.nextLine();

//       }
//       while( pass1 != pass);
//       System.out.println("Congratulation");
    
//   }


//   public static void main(String[] args) {
//     checkPassword();
//   }
// }


import java.util.*;

public class password{

    public static void checkPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create A New Password : ");
        String pass = sc.nextLine();

        String pass1;
        do {
            System.out.print("Enter Password To Unlock : ");
            pass1 = sc.nextLine();
        } while (!pass1.equals(pass));

        System.out.println("Congratulations You Cracked It");
    }

    public static void main(String[] args) {
        checkPassword();
    }
}
