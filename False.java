public class False {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;

        if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
            System.out.println("Верно");
        } else {
            System.out.println("Неверно");
        }

        int option = 1; // Можно изменить значение переменной option для проверки других вариантов

        switch (option) {
            case 1:
                System.out.println("Вы выбрали вариант 1");
                break;
            case 2:
                System.out.println("Вы выбрали вариант 2");
                break;
            default:
                System.out.println("Неизвестный вариант");
                break;
        }
    }
}