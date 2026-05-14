package Else;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city");

        String message = sc.nextLine();

        if (message == "Phuket") {
            System.out.println("ola la tour from Phuket!!!");
        } else {
            System.out.println("Where is this city?");
        }
    }
}
