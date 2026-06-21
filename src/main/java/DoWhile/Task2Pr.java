package DoWhile;

import java.util.Scanner;

public class Task2Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;

        if (n >= num) {
            do {
                sum += num;
                num++;
            } while (num <= n);
        }
        System.out.println(sum);
    }
}
