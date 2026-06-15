package For;

import java.util.Scanner;

public class Task6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
