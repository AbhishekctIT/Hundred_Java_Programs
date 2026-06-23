package toper_world;

public class MatrixMultiplication33 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {5, 6},
                {7, 8}
        };
        int rows = A.length;
        int columns = B[0].length;
        int common = A[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] = result[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
