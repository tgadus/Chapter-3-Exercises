import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three edge lengths
        System.out.print("Enter three edges of a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        // Check triangle validity using triangle inequality theorem
        boolean isValid = 
            (edge1 + edge2 > edge3) &&
            (edge1 + edge3 > edge2) &&
            (edge2 + edge3 > edge1);

        if (isValid) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("Invalid input: the edges do not form a triangle.");
        }

        input.close();
    }
}