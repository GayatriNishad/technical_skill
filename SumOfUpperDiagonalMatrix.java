
/*write a program to sum of apper digonal matrix using user define matrix */
import java.util.Scanner;

public class SumOfUpperDiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
      
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int upperDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                upperDiagonalSum += matrix[i][j];
            }
        }
        System.out.println("Sum of upper diagonal elements: " + upperDiagonalSum);
    }
}