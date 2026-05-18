package ElseIf;

import java.util.Scanner;

public class Task7Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 18) {
            System.out.println("Early");
        } else if (num >= 18 & num <= 28 ) {
            System.out.println("Coming");
        } else {
            System.out.println("Late");
        }
    }
}
