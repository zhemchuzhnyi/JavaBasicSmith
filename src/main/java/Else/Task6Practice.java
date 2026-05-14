package Else;

import java.util.Scanner;

public class Task6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = (n + m);

        if (k > 160) {
            System.out.println("Красава, ты Поступил!");
        } else {
            System.out.println("УВЫ...");
        }
    }
}
