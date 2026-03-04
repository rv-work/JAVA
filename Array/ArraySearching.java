import java.util.Scanner;

public class ArraySearching{


  public static int Search(int arr[] , int num) {
    
  for(int i = 0; i <arr.length; i++){
    if(num == arr[i]){
      return i;
    } 
  }  return 0;
  
  }
  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number that you want to search : ");
  int num = sc.nextInt();
  int[] array = {4,14,24,6,8,9};
  int index = Search(array , num);

  if(index == 0) {
    System.out.println("Number Is Not Found In Array");
  } else {
    System.out.println("Number Is Found At Index : " + index);
  }

}

}
