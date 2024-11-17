import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int[][] matrixA = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = r.nextInt(11);
            }
        }

        System.out.println("Matrix A: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println("]");
        }

        int[][] matrixB = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matrixB[i][j] = r.nextInt(11);
            }
        }

        System.out.println("Matrix B: ");
        for (int i=0; i<n; i++) {
            System.out.print("[");
            for (int j=0; j<n; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Matrix A + Matrix B: ");
        int[][] result = AddTwoMatrices(matrixA, matrixB);
        for (int i=0; i<n; i++) {
            System.out.print("[");
            for (int j=0; j<n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Matrix A X Matrix B: ");
        int[][] resultMultiplication = MultipleTwoMatrices(matrixA, matrixB);
        for (int i=0; i<n; i++) {
            System.out.print("[");
            for (int j=0; j<n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("]");
        }

        sc.close();

    }

    public static int[][] AddTwoMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
        
    }

    public static int[][] MultipleTwoMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b[0].length; j++) {
                for (int k=0; k<a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
