
/*write a program to sum of lower digonal matrix using user define matrix*/
import java.util.Scanner;

public class SumOfLowerDiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[rows][col];
        System.out.println("Enter the elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int lowerDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i > j) {
                    lowerDiagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of lower diagonal elements is: " + lowerDiagonalSum);
    }
}