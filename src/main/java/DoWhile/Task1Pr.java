package DoWhile;

import java.util.Scanner;

public class Task1Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;

        do {
            System.out.println("Iteration: " + n);
            if (n == 1) break;
            n--;
        } while (n < 10);
    }
}
