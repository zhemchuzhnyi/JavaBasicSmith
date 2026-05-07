package Practice;

// Напишите код, который принимает от пользователя три числа
// (каждое с новой строки, тип данных int) и выводит на печать максимальное из них (тип данных int).

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        int a = 4;
        int b = 5;
        int c = 9;

        int d = Math.max(Math.max(a, b),c);

        System.out.println(d);
    }
}
