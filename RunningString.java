public class RunningString {
    public static void main(String[] args) throws InterruptedException{
        String text = "Добро пожаловать!";
        while (true) {
            System.out.print(text);
            Thread.sleep(300);

        }
    }
}