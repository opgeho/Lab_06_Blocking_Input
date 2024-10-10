import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean gDone  = false;
        System.out.println("the correct answer was " + target);

        do {
            System.out.println("make a guess between 1-10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                gDone = true;

            }
            else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input. please try again.");
            }
        } while (!gDone);
        if (guess < target) {
            System.out.println("You guessed low!");
        }
        if (guess > target) {
            System.out.println("You guessed high!");
        }
        else if (guess == target) {
            System.out.println("You guessed correctly!");
        }

    }
}
