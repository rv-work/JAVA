public class compare {
  public static void main(String[] args) {
    String s1 = "Vishnu";
    String s2 = "Vishnu";
    String s3 = new String("Vishnu");

    if(s1 == s2 ){
      System.out.println("s1 and sw2 are equal");
    } else {
      System.out.println("s1 and sw2 are not equal");
    }

    if(s1 == s3 ){
      System.out.println("s1 and sw2 are equal");
    } else {
      System.out.println("s1 and sw2 are not equal");
    }

    if(s1.equals(s3) ){
      System.out.println("s1 and sw2 are equal");
    } else {
      System.out.println("s1 and sw2 are not equal");
    }


  }
}
