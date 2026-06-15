package While;

import java.util.Scanner;

public class Lection2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctLogin = "Ivan";
        String correctPassword = "qwer123";

        boolean loginCorrect = false;
        while (!loginCorrect) {
            System.out.println("Enter login: ");
            String inputLogin = sc.nextLine();

            if (inputLogin.equals(correctLogin)) {
                loginCorrect = true;
            } else {
                System.out.println("No user with this login exists");
            }
        }
        boolean passwordCorrect = false;
        while (!passwordCorrect) {
            System.out.println("Enter password: ");
            String inputPassword = sc.nextLine();

            if (inputPassword.equals(correctPassword)) {
                passwordCorrect = true;
                System.out.println("Welcome");
            } else {
                System.out.println("Incorrect password, please try again");
                }
            }
        }
    }
