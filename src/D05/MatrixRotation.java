package D05;

// Create a function that rotates
// a 3x3 matrix 90 degrees

import java.util.Arrays;

public class MatrixRotation {

        public static void main(String[] args) {
            int[][] aa = {{1, 1, 1},
                         {2, 2, 2},
                         {3, 3, 3}};

            System.out.println(Arrays.deepToString(MatrixRotation(aa)));
    }
        public static int[][] MatrixRotation(int[][] aa) {
            int rowLength = aa.length;
            int colLength = aa[0].length;

            int[][] result = new int[rowLength][colLength];

            for (int row = 0; row < rowLength; row++) {
                for (int col = 0; col < colLength; col++) {

                    result[col][rowLength - 1 - row] = aa[row][col];
                }
            }
            return result;
        }
}





