import java.util.Scanner;

public class RKU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        double x1, x2;

        System.out.println("Данная программа решает уравнения вида: ax^2 + bx + c = 0");
        System.out.println("Введите a: ");
        a = in.nextInt();
        System.out.println("Введите b: ");
        b = in.nextInt();
        System.out.println("Введите c: ");
        c = in.nextInt();

        System.out.println("Ваше уравнение имеет вид: " + '\n' + a + "x^2" + "+" + b + "x" + "+" + c + "=0");

        d = (int) (Math.pow(b, 2) - (4 * a * c));

        System.out.println("Дискриминант равен = " + d);

        if (d > 0){
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни квадратного уравнения: " + '\n' + "x1 = " + x1 + '\n' + "x2 = " + x2);
        }
        else if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Так как d = 0, у нас имеется два одинаковых вещественных корня уравнения: " + '\n' + "x1 = " + x1);
        }
        else {
            System.out.println("Квадратное уравнение не имеет вещественных корней");
        }
    }
}