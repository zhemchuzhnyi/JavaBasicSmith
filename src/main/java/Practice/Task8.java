package Practice;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int sec = days * 24 * 60 * 60;
        System.out.println(sec);
    }
}
