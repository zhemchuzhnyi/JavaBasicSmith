package ElseIf;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int answer = sc.nextInt();

        if (answer == 18) {
            System.out.println("You alredy 18");
        } else if (answer > 18 ) {
            System.out.println("You are grown up, you alredy older than 18.");
        } else {
            System.out.println("You are very young");
        }
    }
}
