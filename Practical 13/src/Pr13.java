import java.util.Scanner;
public class Pr13 {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        if (colA != rowB) {
            System.out.println("Matrix multiplication is not possible.");
            return new int[0][0];
        }

        int[][] result = new int[rowA][colB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] inputMatrix(int row, int col) {
        Scanner s = new Scanner(System.in);
        int[][] matrix = new int[row][col];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix A: ");
        int rowA = s.nextInt();
        int colA = s.nextInt();

        System.out.print("Enter rows and columns for Matrix B: ");
        int rowB = s.nextInt();
        int colB = s.nextInt();

        System.out.println("Enter Matrix A:");
        int[][] matrixA = inputMatrix(rowA, colA);

        System.out.println("Enter Matrix B:");
        int[][] matrixB = inputMatrix(rowB, colB);

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }
}
