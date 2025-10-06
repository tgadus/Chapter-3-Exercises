import java.util.Scanner; 

public class SubtractionQuiz {
  public static void main(String[] args) {
    // 1. Generate two random single-digit integers
    int number1 = FILL_CODE_OR_CLICK_ANSWER
    int number2 = (int)(Math.random() * 10);

    // 2. If number1 < number2, swap number1 with number2
    if FILL_CODE_OR_CLICK_ANSWER {
      int temp = number1;
      FILL_CODE_OR_CLICK_ANSWER
      number2 = temp;
    }

    // 3. Prompt the student to answer "what is number1 - number2?"
    System.out.print
      ("What is " + number1 + " - " + number2 + "? ");
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    // 4. Grade the answer and display the result
    if (FILL_CODE_OR_CLICK_ANSWER)
      System.out.println("You are correct!");
    else {
      System.out.println("Your answer is wrong.");
      System.out.println(number1 + " - " + number2 + 
        " should be " + (number1 - number2)); 
    }
  }
}