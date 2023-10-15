import java.util.Scanner;

//Nguyen Hoang Thuong - 20215146
public class bai6_6 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrix2 = {
                { 10, 11, 12 },
                { 13, 14, 15 },
                { 16, 17, 18 }
        };

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Nguyen Hoang Thuong - 20215146-Sum of two matrices is: ");
        for (int[] row : sumMatrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
