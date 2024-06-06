import javax.swing.JOptionPane;
import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Введите длину массивов:"));
        double x = Double.parseDouble(JOptionPane.showInputDialog("Введите значение x:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Введите значение y:"));
        double[] array1 = new double[n];
        double[] array2 = new double[n];
        double[] resultArray = new double[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array1[i] = Math.random() * (2 * Math.abs(x)) - Math.abs(x);
            array2[i] = Math.random() * (2 * Math.abs(y)) - Math.abs(y);
            resultArray[i] = array1[i] + array2[i];
        }

        StringBuilder output = new StringBuilder();
        output.append("Массив 1: ").append(java.util.Arrays.toString(array1)).append("\n");
        output.append("Массив 2: ").append(java.util.Arrays.toString(array2)).append("\n");
        output.append("Результат: ").append(java.util.Arrays.toString(resultArray));

        JOptionPane.showMessageDialog(null, output.toString(), "Результаты", JOptionPane.INFORMATION_MESSAGE);
    }
}
