import java.util.Scanner;

public class Rghy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для таблицы умножения: ");
        int number = scanner.nextInt();

        System.out.println("Таблица умножения для числа " + number + ":");

        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        scanner.close();
    }
}
