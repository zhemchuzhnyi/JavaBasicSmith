package ElseIf;

import java.util.Scanner;

public class Task13Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double min, max;

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;

        }

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        double diff = (max - min) / min * 100;

        if (diff < 20) {
            System.out.println("Все молодцы");
        } else {
            System.out.println("Кто - то халтурит");
        }
    }
}
