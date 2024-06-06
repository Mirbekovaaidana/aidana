import javax.swing.*;
public class RunningString {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Введите текст для бегущей строки:");
        if (text == null || text.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Вы не ввели текст!");
            return;
        }

        JFrame frame = new JFrame("Бегущая строка");
        JLabel label = new JLabel(text, JLabel.CENTER);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Бегущая строка
        while (true) {
            text = text.substring(1) + text.charAt(0);
            label.setText(text);
            try {
                Thread.sleep(200); // Задержка в миллисекундах
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
