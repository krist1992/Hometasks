import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int minEdge = -30;
        int maxEdge = 30;
        int diff = maxEdge - minEdge;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter columns and rows quantity:");
        int n = scanner.nextInt();
        int matrix[][] = new int[n][n];

        System.out.println("Original matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = random.nextInt(diff + 1);
                val += minEdge;
                matrix[i][j] = val;
                System.out.printf("%d\t", val);
            }
            System.out.printf("\n");
        }
        System.out.println("Sorted matrix:");
        System.out.println("Matrix sorted by rows:");
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int min = matrix[i][k];
                int min_k = k;
                for (int j = k + 1; j < n; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                        min_k = j;
                    }
                }
                if (k != min_k) {
                    int temp = matrix[i][k];
                    matrix[i][k] = matrix[i][min_k];
                    matrix[i][min_k] = temp;
                }
                System.out.printf("%d\t", matrix[i][k]);
            }
            System.out.printf("\n");
        }
        System.out.println("Matrix sorted by columns:");
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                int min = matrix[i][k];
                int min_k = k;
                for (int j = k + 1; j < n; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                        min_k = j;
                    }
                }

                if (k != min_k) {
                    int temp = matrix[i][k];
                    matrix[i][k] = matrix[i][min_k];
                    matrix[i][min_k] = temp;
                }
                System.out.printf("%d\t", matrix[i][k]);
            }
            System.out.printf("\n");
        }
    }
}

