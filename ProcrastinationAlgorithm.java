import java.util.Scanner;

public class ProcrastinationAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Days before deadline
        System.out.print("Days before deadline: ");
        double days = scanner.nextDouble();

        // Step 2: Subject Difficulty
        System.out.print("Subject Difficulty: (easy, medium, hard): ");
        String subjdifficulty = scanner.next();

        // Step 3: Check if it's still doable
        if (days > 7) {
            System.out.println("You still have time!");

            // Step 4: Check if it's easy
            if (subjdifficulty.equalsIgnoreCase("easy")) {
                System.out.println("You can do it later");
            }
            // Step 5: Check if it's medium

            else if (subjdifficulty.equalsIgnoreCase("medium")) {
                System.out.println("You should start thinking about it");
            }
            // Step 6: Check if it's hard
            else if (subjdifficulty.equalsIgnoreCase("hard")) {
                System.out.println("You should start working on it now");
            }
        }
        // Step 7: Days before deadline
        else if (days <= 7 && days >= 1) {
            System.out.println("You do not have much time left!");

            // Step 8: Check if it's easy
            if (subjdifficulty.equalsIgnoreCase("easy")) {
                System.out.println("You can finish it on time");
            }
            // Step 9: Check if it's medium or hard
            else if (subjdifficulty.equalsIgnoreCase("medium") || subjdifficulty.equalsIgnoreCase("hard")) {
                System.out.println("You might not be able to finish it on time");
            }
        }
        // Step 10: 0 days before deadline
        else {
            System.out.println("You failed");
        }
        scanner.close();
    }
}
