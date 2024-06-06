import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = new String[3];
        int[] quantities = new int[3];
        double[] prices = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название товара " + (i+1) + ":");
            products[i] = scanner.nextLine();
            System.out.println("Введите количество товара " + products[i] + ":");
            quantities[i] = scanner.nextInt();
            System.out.println("Введите стоимость товара " + products[i] + " за штуку:");
            prices[i] = scanner.nextDouble();
            scanner.nextLine(); // очистка буфера сканнера
        }

        double totalCost = 0;
        for (int i = 0; i < 3; i++) {
            double productCost = prices[i] * quantities[i];
            System.out.println("Стоимость товара " + products[i] + " на складе: " + productCost);
            totalCost += productCost;
        }

        System.out.println("Общая стоимость товарных запасов на складе: " + totalCost);

        scanner.close();
    }
}