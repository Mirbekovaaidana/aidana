import javax.swing.JOptionPane;
import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        int n = 0;
        double x = 0, y = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                String inputN = JOptionPane.showInputDialog("Введите длину массива:");
                n = Integer.parseInt(inputN);

                String inputX = JOptionPane.showInputDialog("Введите x (диапазон от -x до x):");
                x = Double.parseDouble(inputX);

                String inputY = JOptionPane.showInputDialog("Введите y (диапазон от -y до y):");
                y = Double.parseDouble(inputY);

                if (n > 0 && x >= 0 && y >= 0) {
                    validInput = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Пожалуйста, введите положительное число для длины массива и диапазона.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Пожалуйста, введите корректное число.");
            }
        }

        double[] array = new double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble() * (x + y) - x;
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / n;
        JOptionPane.showMessageDialog(null, "Сумма элементов массива: " + sum + "\nСреднее арифметическое значение" +
                " массива: " + average);
    }
}