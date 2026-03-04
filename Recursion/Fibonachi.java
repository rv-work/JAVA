public class Fibonachi {
  public static void main(String[] args) {
    int num = 7;
    int fibSum = fibo(num);
    System.out.println("Sum of series till " + num + " is : " + fibSum);
  }

  public static int fibo(int n) {
    if (n<2){
      return n;
    }

    int fibonachi = fibo(n-1) + fibo(n-2);
    return fibonachi;
    

  }
}
