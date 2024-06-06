public class abc {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 1;

        if (a + b > c) {
            if (a < c) {
                System.out.println(a);
            }
        } else if (b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}