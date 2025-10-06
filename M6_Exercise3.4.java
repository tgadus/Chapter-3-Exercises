public class RandomMonth {
    public static void main(String[] args) {
        // Generate a random integer between 1 and 12
        int monthNumber = (int)(Math.random() * 12) + 1;

        String monthName;

        // Map the number to a month name
        switch (monthNumber) {
            case 1:  monthName = "January"; break;
            case 2:  monthName = "February"; break;
            case 3:  monthName = "March"; break;
            case 4:  monthName = "April"; break;
            case 5:  monthName = "May"; break;
            case 6:  monthName = "June"; break;
            case 7:  monthName = "July"; break;
            case 8:  monthName = "August"; break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Unknown"; // Should never happen
        }

        // Display the result
        System.out.println("Month is " + monthName);
    }
}