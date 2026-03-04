public class BinaryFroSortedM2 {
  
  public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };
    
    int target = 11;
    searchInMatrix(matrix, target);

  }

  public static void searchInMatrix(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    int start = 0;
    int end = (rows * cols) - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      int row = mid / cols; 
      int col = mid % cols;

      if (target > matrix[row][col]) {
        start = mid + 1;
      } else if (target < matrix[row][col]) {
        end = mid - 1;
      } else {
        System.out.println("Target element found at Index : [" + row + "," + col + "]");
        return; 
      }
    }
    System.out.println("Element Not Found !!!!!!!");
  }
}
