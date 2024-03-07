package matrixOperations;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int maxElement = 0;
        int maxElementX = 0, maxElementY = 0;

        int temp;

        int N_dimension = (int) (Math.random() * 50 + 1);
        int M_dimension = (int) (Math.random() * 50 + 1);

        int[][] matrix = new int[N_dimension][M_dimension];

        for (int i = 0; i < N_dimension; i++) {
            for (int j = 0; j < M_dimension; j++) {
                matrix[i][j] = (int) (Math.random() * 50 + 1);
            }
        }

        for (int matrixX = 0; matrixX < N_dimension; matrixX++) {
            for (int matrixY = 0; matrixY < M_dimension; matrixY++) {
                if (matrix[matrixX][matrixY] >= maxElement) {
                    maxElement = matrix[matrixX][matrixY];

                    maxElementX = matrixX;
                    maxElementY = matrixY;
                }
            }
        }

        for (int column = 0; column < M_dimension; column++) {
            temp = matrix[0][column];
            matrix[0][column] = matrix[maxElementX][column];
            matrix[maxElementX][column] = temp;
        }

        for (int column = 0; column < N_dimension; column++) {
            temp = matrix[column][0];
            matrix[column][0] = matrix[column][maxElementY];
            matrix[column][maxElementY] = temp;
        }

        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
