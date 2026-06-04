package For;

import java.util.Scanner;

public class Task5Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean found = false;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 4 ==0) {
            System.out.println(i);
            found = true;
            }
        }
        if (!found) {
            System.out.println("Error");
        }
    }
}
