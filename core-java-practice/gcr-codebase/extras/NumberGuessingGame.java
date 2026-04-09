import java.util.*;

public class NumberGuessingGame {

    // method to generate guess between range
    public static int generateGuess(int lowerLimit, int upperLimit) {
        return (lowerLimit + upperLimit) / 2;
    }

    // method to get feedback from user
    public static String getUserFeedback(Scanner sc) {
        System.out.println("Enter feedback (high / low / correct):");
        return sc.next().toLowerCase();
    }

    // method to update range based on feedback
    public static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("high")) {
            range[1] = guess - 1;
        } else if (feedback.equals("low")) {
            range[0] = guess + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lowerLimit = 1;
        int upperLimit = 100;
        int[] range = { lowerLimit, upperLimit };

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            int computerGuess = generateGuess(range[0], range[1]);
            System.out.println("Computer Guess: " + computerGuess);

            String feedback = getUserFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed your number correctly!");
                break;
            }

            updateRange(feedback, computerGuess, range);
        }
        sc.close();
    }
}
