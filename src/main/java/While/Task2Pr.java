package While;

import java.util.Scanner;

public class Task2Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int finish = sc.nextInt();

        if (start > finish) {
            int temp = start;
            start = finish;
            finish = temp;
        }

        int sum = 0;
        int current = start;

        while (current <= finish) {
            sum += current;
            current++;
        }
        System.out.println(sum);
    }
}
