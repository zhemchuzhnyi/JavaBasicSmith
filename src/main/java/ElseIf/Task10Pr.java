package ElseIf;

import java.util.Scanner;

public class Task10Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word1 = sc.nextLine();

        if (word.equalsIgnoreCase("Good") && word1.equalsIgnoreCase("Good")) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
