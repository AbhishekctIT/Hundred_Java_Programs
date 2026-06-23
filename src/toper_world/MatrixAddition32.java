package toper_world;

public class MatrixAddition32 {
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
        int columns = B.length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("addition result");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
//        for (int[] row : result) {
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
    }
}
