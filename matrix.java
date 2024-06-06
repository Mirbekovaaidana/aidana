import java.util.Scanner;
import java.util.Random;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в матрице: ");
        int n = scanner.nextInt();

        System.out.print("Введите количество столбцов в матрице: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        Random random = new Random();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(100);
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        int[] rowSums = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rowSums[i] += matrix[i][j];
            }
        }
        int[] colSums = new int[m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                colSums[j] += matrix[i][j];
            }
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        System.out.println("Сумма элементов для каждой строки:");
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + i + ": " + rowSums[i]);
        }

        System.out.println("Сумма элементов для каждого столбца:");
        for (int j = 0; j < m; j++) {
            System.out.println("Столбец " + j + ": " + colSums[j]);
        }
    }
}
