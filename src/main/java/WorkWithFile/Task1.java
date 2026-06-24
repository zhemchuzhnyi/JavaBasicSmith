package WorkWithFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
//        try (FileWriter writer = new FileWriter("src/file.txt")) {
//            writer.write("Hello World");
//        } catch (IOException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }

//        try (FileReader reader = new FileReader("src/file.txt")) {
//            char[] buffer = new char[100];
//            int length = reader.read(buffer);
//            for (int i = 0; i < length; i++) {
//                System.out.print(buffer[i]);
//            }
//        }catch (IOException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader("src/file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {}
            System.out.println(line);
        }catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
