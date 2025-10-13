import java.util.Scanner;

public class HeadsOrTailsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate a random coin flip: 0 for heads, 1 for tails
        int coin = (int)(Math.random() * 2);

        // Prompt the user for their guess
        System.out.print("Is it heads or tails? Enter 0 for heads and 1 for tails: ");
        int guess = input.nextInt();

        // Validate input
        if (guess != 0 && guess != 1) {
            System.out.println("Invalid input. Please enter 0 or 1.");
        } else {
            // Compare guess to actual result
            if (guess == coin) {
                System.out.println("Correct! It is " + (coin == 0 ? "heads." : "tails."));
            } else {
                System.out.println("Sorry, it is " + (coin == 0 ? "heads." : "tails."));
            }
        }

        input.close();
    }
}