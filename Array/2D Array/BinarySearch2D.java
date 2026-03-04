import java.util.Scanner;

public class BinarySearch2D{
   
  public static void main(String[] args) {
      int[][] matrix = {
          {10, 20, 30, 40},
          {15, 22, 33, 45},
          {17, 27, 37, 50},
          {21, 31, 39, 55},
      };
      int target = 37;
      binarySearch(matrix,target);
  }

  static void binarySearch(int[][] matrix, int target) {
      int rows = matrix.length;
      int cols = matrix[0].length;

      int row = 0;
      int col = cols - 1;

      while (row < rows && col >= 0) {
          if (matrix[row][col] == target) {
              System.out.println("Target Element Found At Row:" + (row + 1) + " & Col:" + (col + 1));
              return;
          } else if (matrix[row][col] < target) {
              row++;
          } else {
              col--;
          }
      }
      
      System.out.println("Target Element Not Found");
  }
}
