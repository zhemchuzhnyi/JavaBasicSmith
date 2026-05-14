package Else;

import java.util.Scanner;

public class Task7Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            int a = num / 4;
            System.out.println(a);
        } else {
            int b = num * 3;
            System.out.println(b);
        }
    }
}
