public class Rotate_Matrix_90 {

  public static void main(String[] args) {
    int[][] mat = {
                   {1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16} };
    //  mat = rotate(mat);
    //  printRotatedMatrix(mat);

    //  System.out.println();
    // rotate2(mat);
    // printRotatedMatrix(mat);
    int c = 0;
    String str = "Hello";
    if (str.contains("l")) {
      c++;
    }
    System.out.println(c);
    


  }

  private static void rotate2(int[][] mat) {
   transpose(mat);
   for (int i = 0; i < mat.length; i++) {
     reverse(mat , i, 0 , mat[0].length-1 );
   }
  }

  private static void reverse(int[][] mat, int i, int s, int end ) {
      while (s<end) {
        swap(mat, i, s, end);
        s++;
        end--;
      }
  }

  private static void swap(int[][] mat, int i, int s, int end) {
    int temp = mat[i][s];
    mat[i][s] = mat[i][end];
    mat[i][end] = temp;
  }

  private static void transpose(int[][] mat) {
    for (int i = 0; i < mat.length-1; i++) {
      for (int j = i+1; j < mat.length; j++) {
        swap(mat , i , j);
      }
    }
  }

  private static void swap(int[][] mat, int i, int j) {
    int temp = mat[i][j];
    mat[i][j] = mat[j][i];
    mat[j][i] = temp;
  }

  private static void printRotatedMatrix(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      System.out.print("{");
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.print("}\n");
    }
  }

  private static int[][] rotate(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    int mat2[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          mat2[j][n-1-i] = mat[i][j];
        }
    }
    return mat2;
  
  }




}