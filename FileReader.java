import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\test.txt");
            String name = file.getPath();
            System.out.println(name);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "UTF-8"
                    )
            );
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден. Пожалуйста, убедитесь в правильном пути к файлу.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.getMessage());
        }
    }
}
