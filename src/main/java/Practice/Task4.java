package Practice;

// Напишите код, который принимает от пользователя одно значение и округлите его до целого числа,
// а после выведите на печать результат.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        long l = Math.round(n);
        System.out.println(l);
    }
}
