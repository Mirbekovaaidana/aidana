import javax.swing.JOptionPane;
import java.util.Random;

public class zad6 {
    public static void main(String[] args) {
        // Ввод данных пользователем
        int n = 0;
        double x = 0.0;
        double y = 0.0;

        try {
            n = Integer.parseInt(JOptionPane.showInputDialog("Введите размерность матриц n:"));
            x = Double.parseDouble(JOptionPane.showInputDialog("Введите значение x:"));
            y = Double.parseDouble(JOptionPane.showInputDialog("Введите значение y:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода. Пожалуйста, введите корректные числовые значения.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        double[][] matrix1 = generateRandomMatrix(n, x, y);
        double[][] matrix2 = generateRandomMatrix(n, x, y);

        double[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        StringBuilder output = new StringBuilder();
        output.append("Матрица 1:\n");
        printMatrix(matrix1, output);
        output.append("\nМатрица 2:\n");
        printMatrix(matrix2, output);
        output.append("\nРезультат умножения:\n");
        printMatrix(resultMatrix, output);

        JOptionPane.showMessageDialog(null, output.toString(), "Результаты", JOptionPane.INFORMATION_MESSAGE);
    }

    public static double[][] generateRandomMatrix(int n, double x, double y) {
        Random random = new Random();
        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.random() * (2 * Math.abs(y)) - Math.abs(y);
            }
        }

        return matrix;
    }

    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        int n = matrix1.length;
        double[][] resultMatrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(double[][] matrix, StringBuilder output) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                output.append(matrix[i][j]).append("\t");
            }
            output.append("\n");
        }
    }
}
