package While;

import java.util.Scanner;

public class Lection2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctLogin = "Ivan";
        String correctPassword = "qwer123";

        while (true) {
            System.out.println("Enter login: ");
            String inputLogin = sc.nextLine();

            if (!inputLogin.equals(correctLogin)) {
                System.out.println("No user with this login exists");
                continue;
            }
            System.out.println("Enter password: ");
            String inputPassword = sc.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Welcome " + inputLogin);
            } else {
                System.out.println("Incorrect password, please try again");
            }
        }
    }
}
