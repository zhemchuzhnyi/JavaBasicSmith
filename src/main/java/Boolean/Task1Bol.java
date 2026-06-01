package Boolean;

public class Task1Bol {
    public static void main(String[] args) {
        int age = 22;
        int ageRequirement = 21;
        boolean isActive = (age >= ageRequirement);
        boolean isVip = true;

        if (isActive) {
            System.out.println("Welcome!");
            if (isVip) {
                System.out.println("Welcome, VIP user!");
            } else {
                System.out.println("Regular user");
            }
        } else {
            System.out.println("Sorry!");
        }
    }
}
