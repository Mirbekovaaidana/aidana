import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Введите пароль (только целые числа): ");
            if (scanner.hasNextInt()) {
                password = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Неверный формат пароля. Попробуйте снова.");
                scanner.next();
            }
        }

        System.out.println("Пароль принят: " + password);
    }
}
