public class SumOfArray{

  public static int SOA(int[] array) {
    int sum = 0;
    for(int i = 0; i<array.length; i++){
      sum = sum + array[i];
    } return sum;
  }

  public static double AvgOfA(int[] array) { 
    double sum = SOA(array);
    double Avg = (sum / array.length);
    return Avg;
  }

public static void main(String[] args) {
  int[] arr = ArrayCall.InputArray();
  int sum = SOA(arr);
  System.out.println("Sum Of Given Array Is : " + sum);
  double avg = AvgOfA(arr);
  System.out.println("Avg Of Given Array Is : " + avg);


}
  
}
