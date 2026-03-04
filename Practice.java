import java.util.Scanner;

public class Practice{

  public static void mTable(int num) {

    // for(int i=num; i<=num*10; i+=num){-
    //   System.out.println(i);
    // }

    for (int i = 1; i<=10; i++){
      int multiple = num*i;
      System.out.println(multiple);
    }
  }

  public static int SumOfOdd(int n) {
      int sum = 0;
      for(int i = 1; i<=n; i++ ){
        if(i%2 == 1){
         sum = sum + i;
        }
      }
      return sum;
  }


    public static int factorial(int n) {



      int fact = n;
      for(int i=fact -1; i>=1; i--) {
        fact = fact*i;
      }  return fact;

      // int fact = 1;
      // for(int i=1; i<=n; i++) {
      //   fact = fact*i;
      // }  return fact;

    }

    public static int SumOfDigits(int num) {
      int sum = 0;
      for(int i = num%10; num>0;  num = num / 10){
        sum+=i;
      } return sum;
    }


    public static int LCM(int n1, int n2) {
        for(int i=1; i<=n2; i++){
        int m1 = n1*i;
        if ( m1%n2 == 0) {
          return m1;
        }
        }
         return 0;
    }


    public static int GCD(int n1, int n2){
      if (n1>n2) {
        for(int i = n2; i>=2; i--){
          if(n1%i==0 && n2%i==0 ){
            return i;
          }
        }
      } 

      if (n1<n2) {
        for(int i = n1; i>=2; i--){
          if(n2%i==0 && n1%i==0){
            return i;
          }
        }
      } return 0;
    }

    

    public static boolean isPrime(int n) {
      boolean prime = true;
    for(int i=2; i<Math.sqrt(n); i++){
         if(n%i==0){
         prime = false;
         } 
      } return prime;
    }


   
    public static void reverseDigit(int n) {
      int fnum = 0;
      for(int i = n; i>0; i=i/10){
       int num = i%10;
       fnum = fnum*10+num;
        
      }System.out.print(fnum);
    
      
    }

    public static boolean isPalindrome(int n) {
      int fnum = 0;
      for(int i = n; i>0; i=i/10){
       int num = i%10;
       fnum = fnum*10+num;
      }
      if(fnum == n){
        return true;
      }
     else{
      return false;
     }
    }


    public static void FabSeries(int n) {
        if(n<0) return ;
        System.out.print("0 ");
        if(n==0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first+second<=n) {
          int third = first + second;
          System.out.print(third +" ");
          first = second;
          second = third;
        }
      }

      
  


	public static void main(String[] args) {

    //Q.1
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number : ");
    // int num = sc.nextInt();
    // mTable(num);


    //Q.2
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number : ");
    // int num = sc.nextInt();
    // int sum = SumOfOdd(num);
    // System.out.println("The Sum is : " + sum );




    //Q.3
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number : ");
    // int num = sc.nextInt();
    // int fact = factorial(num);
    // System.out.println("The Factorial Of Num : " + fact);





    //Q.4

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number : ");
    // int num = sc.nextInt();
    // int SOD = SumOfDigits(num);
    // System.out.println("The SOD Of Num : " + SOD);




    //Q.5

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number1 : ");
    // int num1 = sc.nextInt();
    // System.out.println("Enter The Number2 : ");
    // int num2 = sc.nextInt();
    // int lcd = LCM(num1,num2);
    // System.out.println("The LCD Of Numbers : " + lcd);





    //Q.6

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number1 : ");
    // int num1 = sc.nextInt();
    // System.out.println("Enter The Number2 : ");
    // int num2 = sc.nextInt();
    // int gcd = GCD(num1,num2);
    // System.out.println("The GCD Of Numbers : " + gcd);






    //Q.7 
    
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number : ");
    // int num = sc.nextInt();
    // boolean Prime = isPrime(num);
    // System.out.println("Number is prime : " + Prime);


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number : ");
    int num = sc.nextInt();
    boolean Prime = isPalindrome(num);
    System.out.println("Number is Palindrome : " + Prime);




    //Q.8 

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number : ");
    // int num = sc.nextInt();
    //   reverseDigit(num);





    //Q.9

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Number : ");
    // int num = sc.nextInt();
    //   FabSeries(num);


	   }
 }
