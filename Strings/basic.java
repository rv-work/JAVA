import java.util.*;


public class basic {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Str : ");
     String str = sc.nextLine();
     System.out.print("Enter The Gtr : ");
     String gtr = sc.nextLine();
     System.out.println(str.length());
     System.out.println(str.charAt(2));
      System.out.println(str.indexOf('s'));
      System.out.println(str.compareTo(gtr));
      System.out.println(str.contains("sh"));
      System.out.println(str.startsWith("vi"));
    //   System.out.println(gtr.endsWith("la"));
    //   System.out.println(str.toUpperCase());
    //   System.out.println(gtr.toLowerCase());
      // String s3 = str.concat(gtr);
      // System.out.println(s3);
      // str = str + "xyz" + 'x' + 15;
      // String st1 = str.substring(1);
      // String st1 = str.substring(1 , 3);

      // String str1 = "hello";
      // String str2 = "hello";
      // String str3 = new String("hello");
      // System.out.println(str1 == str2);
      // System.out.println(str1 == str2);
      // System.out.println(str1.equals(str3));

}
  }
  

