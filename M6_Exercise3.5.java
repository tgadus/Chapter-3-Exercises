import java.util.Scanner;

public class FutureDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for today's day
        System.out.print("Enter today's day of week (0 for Sunday to 6 for Saturday): ");
        int today = input.nextInt();

        // Prompt for number of days elapsed
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        // Calculate future day
        int futureDay = (today + elapsed) % 7;

        // Array of day names
        String[] dayNames = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };

        // Output result
        System.out.println("Today is " + dayNames[today] +
                           " and the future day is " + dayNames[futureDay]);

        input.close();
    }
}