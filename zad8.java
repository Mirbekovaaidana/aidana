import java.util.Scanner;
import java.util.Random;
public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Добро пожаловать в игру 'Угадай число'!");

        System.out.print("Введите минимальное значение диапазона чисел: ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальное значение диапазона чисел: ");
        int max = scanner.nextInt();

        int randomNumber = random.nextInt(max - min + 1) + min;
        int guess = 0;

        System.out.println("Программа загадала число в диапазоне от " + min + " до " + max);

        while (true) {
            System.out.print("Угадайте число: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Загаданное число больше");
            } else if (guess > randomNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Поздравляем! Вы угадали число!");
                break;
            }
        }

        scanner.close();
    }
}
