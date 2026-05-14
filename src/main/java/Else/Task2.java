package Else;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city");

        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("Phuket")) {
            System.out.println("ola la youre from Phuket!!!");
        } else {
            System.out.println("Where is this city?");
        }
    }
}
