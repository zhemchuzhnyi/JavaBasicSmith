package Else;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is youre favorite number?");

        int number = sc.nextInt();

        if (number == 9) {
            System.out.println("Perfect choise!");
        } else {
            System.out.println("Good!");
        }
    }
}
