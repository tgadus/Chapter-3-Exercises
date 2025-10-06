import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for coefficients
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Determine the nature of the roots
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two real roots: " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r = -b / (2 * a);
            System.out.println("The equation has one real root: " + r);
        } else {
            System.out.println("The equation has no real roots.");
        }

        input.close();
    }
}