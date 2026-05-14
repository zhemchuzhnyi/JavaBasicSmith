package Else;

import java.util.Scanner;

public class Task4Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        if (num > num1) {
            System.out.println("Num is bigger than num1");
        } else {
            System.out.println("Num1 is bigger!");
        }
    }
}
