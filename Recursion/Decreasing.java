public class Decreasing {

  public static void printDec(int n) {
    if (n==1) {
      System.out.println(1);
      return;
    }
    System.out.print(n + ",");
    printDec(n-1);
  }


  //concept 
  public static void func(int n) {
    if (n == 0){
      return;
    }

    System.out.println(n);
    //func(n--); infinite loop
    func(--n);
  }
  

  public static void main(String[] args) {
    printDec(10);
    func(5);
  }
}