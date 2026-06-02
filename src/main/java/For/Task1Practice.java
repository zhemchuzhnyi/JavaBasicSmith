package For;

public class Task1Practice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " +(i + 1));
        }
        for (int i = 10; i > 0; i -= 2 ) {
            System.out.println("Current counter i: " + i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            System.out.println("Iteration: " + 1);
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) break;
            System.out.println("Current counter i: " + i);
        }
    }
}
