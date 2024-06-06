import javax.swing.JOptionPane;
import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                String input = JOptionPane.showInputDialog("Введите длину массива:");
                n = Integer.parseInt(input);

                if (n > 0) {
                    validInput = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Пожалуйста, введите положительное число.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Пожалуйста, введите корректное число.");
            }
        }

        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        StringBuilder originalArray = new StringBuilder("Исходный массив:\n");
        for (int num : array) {
            originalArray.append(num).append("\n");
        }
        JOptionPane.showMessageDialog(null, originalArray);

        // Обращение порядка элементов в массиве
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - i - 1];
        }
        StringBuilder reversedArrayString = new StringBuilder("Массив с обращенным порядком:\n");
        for (int num : reversedArray) {
            reversedArrayString.append(num).append("\n");
        }
        JOptionPane.showMessageDialog(null, reversedArrayString);
    }
}
