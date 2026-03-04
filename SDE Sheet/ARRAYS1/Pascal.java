public class Pascal {
  public static void main(String[] args) {
    printAll2(6);
  }


static int elementAt(int row, int col){
  return nCr(row-1, col-1);
}

static void printAll(int numRows) {
  for (int i = 0; i < numRows; i++) {
      for (int k = 0; k < numRows - i - 1; k++) {
          System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
          System.out.print(nCr(i, j) + " ");
      }
      System.out.println();
  }
}


static void printAll2(int numRows) {
  for (int i = 0; i < numRows; i++) {
      for (int k = 0; k < numRows - i - 1; k++) {
          System.out.print(" ");
      }
      printRow2(i+1);
      System.out.println();
  }
}

static void printRow(int row){
  for (int i = 1; i <= row; i++) {
    System.out.print(nCr(row-1 , i-1) + " ");
  }
}

static void printRow2(int row){
  int ans = 1;
  System.out.print(ans + " ");
  for (int i = 1; i < row; i++) {
    ans *= (row-i);
    ans /= (i);
    System.out.print(ans + " ");
  }
}

static int nCr(int n , int r){
  int res = 1;
  for (int i = 0; i < r; i++) {
   res = (res*(n-i));
   res = res/(i+1);
  } 
  return res;
}


}

