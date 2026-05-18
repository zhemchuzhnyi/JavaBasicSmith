package ElseIf;

import java.util.Scanner;

public class Task8Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (name.length() > 10) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
