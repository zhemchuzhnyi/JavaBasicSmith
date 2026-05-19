package ElseIf;

import java.util.Scanner;

public class Task12Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine();

        if (num == word.length() ) {
            System.out.println("Good");
        } else  {
            System.out.println("Bad");
        }
    }
}
