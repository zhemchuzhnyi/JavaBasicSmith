package TryCatch;

import java.util.Scanner;

public class Task1Practice {
    public static void main(String[] args) {
        Scanner cs =  new Scanner(System.in);
        String str = cs.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Невозможно преобразовать строку в целое число");
        }
    }
}
