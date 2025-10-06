import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // Generate three random single-digit integers (0–9)
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        // Calculate the correct sum
        int correctSum = number1 + number2 + number3;

        // Prompt the user
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int userAnswer = input.nextInt();

        // Check the answer
        if (userAnswer == correctSum) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctSum + ".");
        }

        input.close();
    }
}