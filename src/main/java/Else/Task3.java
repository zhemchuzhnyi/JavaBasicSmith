package Else;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");

        int number = sc.nextInt();

        if (number == 25) {
            System.out.println("Youre 25 years old!");
        } else {
            System.out.println("");
        }
    }
}
