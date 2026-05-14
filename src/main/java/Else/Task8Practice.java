package Else;

import java.util.Scanner;

public class Task8Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        String password = sc.nextLine();

        if (login.equals("Admin")) {
            if (password.equals("qwer1234")) {
                System.out.println("Welcome Admin!");
            } else {
                System.out.println("Error! Try again!");
            }
        }
    }
}
