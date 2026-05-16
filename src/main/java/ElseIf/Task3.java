package ElseIf;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Yes or Not: ");
        String answer = sc.nextLine();

        if (answer.equals("Yes")) {
            System.out.println("Yes? or maybe No?: ");
            String answer1 = sc.nextLine();
            if (answer1.equals("Yes")) {
                System.out.println("Yes means Yes");
            } else {
                System.out.println("Changed your mind");
            }
        } else {
            System.out.println("You selected No");
        }
    }
}
