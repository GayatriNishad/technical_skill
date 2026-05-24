/* wap to find the sum of diagonal elements of a matrix*/
import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[rows][col];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println(" sum of diagonal elements is: " + diagonalSum);
    }
}



