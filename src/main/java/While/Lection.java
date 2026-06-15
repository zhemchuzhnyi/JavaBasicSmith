package While;

import java.util.Scanner;

public class Lection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        while(!name.equals("Ivan")) {
            System.out.println("What is your name?");
            name = sc.nextLine();

            if(!name.equals("Ivan")) {
                System.out.println("Hello, " + name);
            } else {
                System.out.println("Sorry, enter again " + name);
            }
            sc.close();
        }
    }
}
