import java.util.Scanner;
import java.util.Random;

public class randomN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        System.out.print("Введите пороговое значение x: ");
        int x = scanner.nextInt();

        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Индексы элементов, значение которых превышает порог " + x + ":");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                System.out.println("Индекс: " + i + ", Значение: " + array[i]);
            }
        }
    }
}
