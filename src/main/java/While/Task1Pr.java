package While;

public class Task1Pr {
    public static void main(String[] args) {
        int count = 10;
        while (true) {
            System.out.println("Iteration: " + count);
            if (count == 1) break;
            count--;
        }
    }
}
