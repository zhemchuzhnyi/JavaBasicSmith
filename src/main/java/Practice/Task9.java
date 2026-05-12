package Practice;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        String result = first.repeat(2) + second.repeat(3);

        System.out.println(result);

    }
}
