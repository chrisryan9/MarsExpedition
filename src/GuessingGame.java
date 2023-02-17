import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game!");
        System.out.println(" - Please type your name");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.printf("\n");
        System.out.println(name + ", I'm thinking of a number between 1 and 100.");
        System.out.println(" - Can you guess what the number is?");

        Random ranNum = new Random();
        int number = ranNum.nextInt(100);
        int attempts = 0;

        while (true) {
            int guess = scan.nextInt();

            attempts += 1;

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }

            if (guess < number) {
                System.out.println("\nYour guess is too low, try again!");
            } else if (guess > number) {
                System.out.println("\nYour guess is too high, try again!");
            } else {
                System.out.println("\nWell done " + name + "!");
                System.out.println(" - You guessed my number in " + attempts + " tries!");
            }
        }

    }
}
