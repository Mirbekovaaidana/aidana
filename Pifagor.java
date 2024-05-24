import java.util.Scanner; public class Pifagor {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите значение длины первого катета");
        double a = in.nextDouble();
        System.out.println ("Введите значение длины второго катета");
        double b = in.nextDouble();
        System.out.println("Гипотенуза равна = " +
                Math.sqrt (a*a + b*b));
    }
}