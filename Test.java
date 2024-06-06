public class Test {
    public static void main(String[] args) {
        int a[] = {14, 27, 8, 16, 59, 121, 256, 45, 89, 1024};
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                if (a[i] < a[j]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] <= 98) {
                System.out.println(a[i]);
            }
        }
    }
}
