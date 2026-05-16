package ElseIf;

import java.util.Scanner;

public class ElseIfLogics {
    public static void main(String[] args) {
        System.out.println("Enter the day of the week: ");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("You can sleep");
        } else {
            System.out.println("You can go to work! SORRY!!");
        }
    }
}
