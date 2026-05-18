package ElseIf;

import java.util.Scanner;

public class Task6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive"); {
                if (num == 0) {
                    System.out.println("Zero");
                }
            }
        } else {
            System.out.println("Negative");
        }

    }
}
