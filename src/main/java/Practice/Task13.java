package Practice;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int year = sc.nextInt();
        int result = 2026 - year;
        String message = String.format("Фильму %s в 2026 году исполнится %d", name, result);
        System.out.println(message);

    }
}
