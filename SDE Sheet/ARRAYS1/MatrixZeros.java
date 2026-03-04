public class MatrixZeros {
  public static void main(String[] args) {
      int[][] arr= {
          {1, 1, 1, 1},
          {1, 0, 0, 1},
          {1, 1, 0, 1},
          {1, 1, 1, 1},
      };

    
      // matrix(arr, arr.length, arr[0].length);
      // matrix2(arr, arr.length, arr[0].length);
      matrix3(arr, arr.length, arr[0].length);
  }

  static void matrix(int[][] arr, int n, int m) {
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              if (arr[i][j] == 0) {
                  makeR(arr, i, m);
                  makeC(arr, j, n);
              }
          }
      }

      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              if (arr[i][j] == -1) {
                  arr[i][j] = 0;
              }
          }
      }

      printMatrix(arr, n, m);
  }

  static void makeR(int[][] arr, int i, int m) {
      for (int j = 0; j < m; j++) {
          if (arr[i][j] != 0) {
              arr[i][j] = -1;
          }
      }
  }

  static void makeC(int[][] arr, int j, int n) {
      for (int i = 0; i < n; i++) {
          if (arr[i][j] != 0) {
              arr[i][j] = -1;
          }
      }
  }

  static void matrix2(int[][] arr, int n, int m) {
      int[] row = new int[n];
      int[] col = new int[m];
      
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              if (arr[i][j] == 0) {
                  row[i] = 1;
                  col[j] = 1;
              }
          }
      }

      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              if (row[i] == 1 || col[j] == 1) {
                  arr[i][j] = 0;
              }
          }
      }

      printMatrix(arr, n, m);
  }

  static void matrix3(int[][] arr, int n, int m) {
      int col0 = 1;
      
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              if (arr[i][j] == 0) {
                  arr[i][0] = 0;
                  if (j != 0) {
                      arr[0][j] = 0;
                  } else {
                      col0 = 0;
                  }
              }
          }
      }

      for (int i = 1; i < n; i++) {
          for (int j = 1; j < m; j++) {
              if (arr[i][0] == 0 || arr[0][j] == 0) {
                  arr[i][j] = 0;
              }
          }
      }

      for (int j = 0; j < m; j++) {
          if (arr[0][0] == 0) {
              arr[0][j] = 0;
          }
      }

      for (int i = 0; i < n; i++) {
          if (col0 == 0) {
              arr[i][0] = 0;
          }
      }

      printMatrix(arr, n, m);
  }

  static void printMatrix(int[][] arr, int n, int m) {
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
  }
}

