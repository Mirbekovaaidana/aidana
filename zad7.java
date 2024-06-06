import java.util.Scanner;
public class zad7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите цель расчета: площадь (1) или длина окружности (2):");
        int choice = scanner.nextInt();

        System.out.println("Введите значение радиуса:");
        double radius = scanner.nextDouble();

        if(radius <= 0) {
            System.out.println("Радиус должен быть положительным числом.");
        } else {
            if(choice == 1) {
                double area = Math.PI * radius * radius;
                System.out.println("Площадь круга с радиусом " + radius + " равна " + area);
            } else if(choice == 2) {
                double circumference = 2 * Math.PI * radius;
                System.out.println("Длина окружности с радиусом " + radius + " равна " + circumference);
            } else {
                System.out.println("Некорректный выбор цели расчета.");
            }
        }

        scanner.close();
    }
}
