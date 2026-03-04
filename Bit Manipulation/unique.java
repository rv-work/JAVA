public class unique {
  public static void main(String[] args) {
    int[] arr = {3,5,8,5,6,3,8};
    System.out.println(ans(arr));
  }

  public static int ans(int[] arr) {
    int unique = 0;

    for(int n : arr){
      unique ^= n;
    }

    return unique;
  }
}
