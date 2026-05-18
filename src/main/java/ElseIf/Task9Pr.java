package ElseIf;

import java.util.Scanner;

public class Task9Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num >= num1 && num >= num2) {
            System.out.println("num");
        } else if (num1 >= num && num1 >= num2) {
            System.out.println("num1");
        } else {
            System.out.println("num2");
        }
    }
}
