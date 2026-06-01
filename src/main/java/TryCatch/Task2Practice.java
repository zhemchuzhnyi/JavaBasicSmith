package TryCatch;

import java.util.Scanner;

public class Task2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter the number: from 1 to 3");

        try {
            int num = Integer.parseInt(input);

            if (num >= 1 || num >= 3) {
                System.out.println(num);
            } else {
                System.out.println("Некорректный ввод");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        }
    }
}
