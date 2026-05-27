package ElseIf;

import java.util.Scanner;

public class Task14Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean found = false;

        if (a > 10) {
            System.out.println(a);
            found = true;
        }  else if (b > 10) {
            System.out.println(b);
            found = true;
        } else if (c > 10) {
            System.out.println(c);
            found = true;
        }
        if (!found) {
            System.out.println("Нет ни одного числа");
        }
    }
}
