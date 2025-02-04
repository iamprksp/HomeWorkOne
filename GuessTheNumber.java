import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10) + 1; 
        int maxGuess = 5;
        int tries = 0;
        int userGuess;

        System.out.println("Guess a number between 1 and 10. You have " + maxGuess + " tries.");

        while (tries < maxGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            tries++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number.");
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }

            if (tries == maxGuess) {
                System.out.println("Sorry, you've lost your tries . The correct number was: " + randomNumber);
            }
        }

        scanner.close();
    }
}
