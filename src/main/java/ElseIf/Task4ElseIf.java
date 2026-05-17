package ElseIf;

import java.util.Scanner;

public class Task4ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month is it today?: ");
        String answer1 = sc.nextLine();
        System.out.println("What is the day of the month: ");
        int answer2 = sc.nextInt();

        if (answer1.equals("December") && answer2 == 31) {
            System.out.println("The New Year!!!");
        } else {
            System.out.println("... its bad");
        }
    }
}

