package ElseIf;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("December")) {
            System.out.println("Its winter");
        } else if (answer.equals("March")) {
            System.out.println("Its spring");
        } else if (answer.equals("June")) {
            System.out.println("its summer");
        } else if (answer.equals("September")) {
            System.out.println("its autumn");
        } else {
            System.out.println("Something Unknown");
        }
    }
}
