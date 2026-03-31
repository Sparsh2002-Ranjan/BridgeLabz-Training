import java.util.*;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100");
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high / low / correct)");
            String feedback = sc.next();
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }
    }
    static int generateGuess(int low, int high) {
        return new Random().nextInt(high - low + 1) + low;
    }
}
