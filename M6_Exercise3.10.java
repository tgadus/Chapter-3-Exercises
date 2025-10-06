import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // Generate two random integers less than 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        // Prompt the user with the addition question
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int userAnswer = input.nextInt();

        // Check the user's answer
        int correctAnswer = number1 + number2;
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        input.close();
    }
}