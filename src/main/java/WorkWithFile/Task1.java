package WorkWithFile;

import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/file.txt")) {
            writer.write("Hello World");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
