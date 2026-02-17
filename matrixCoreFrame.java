//wap to find sum offrame elements of a matrix.
import java.util.Scanner;

public class matrixCoreFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Rows:");
        int n = sc.nextInt();
        System.out.println("Enter no. of Column:");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        int sum = 0;
        int Sum = 0;

        System.out.println("Enter elements of Matrix:");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        // Sum of frame elements of Matrix---------------------

        System.out.println("Frame elements of matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    sum += arr[i][j];
                }

            }
        }
        System.out.println(sum);
        System.out.println();

        // sum of core elements of Matrix---------------

        System.out.println("Core elements of matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0 && j > 0 && i < n - 1 && j < m - 1) {
                    Sum += arr[i][j];
                }

            }
        }
        System.out.println(Sum);
        System.out.println();

    }
}





//wap to find core elements of a matrix
//rotate the square matrix by 90 degree clock bise(bottam right as center ).