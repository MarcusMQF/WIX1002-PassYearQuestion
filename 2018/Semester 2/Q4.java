import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the values for a, b, c, d, e and f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        // Create LinearEquation object
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        
        // Display the equation
        System.out.println("\nThe equation :");
        System.out.println(equation.toString());
        
        // Check if solvable and display results
        if (equation.isSolvable()) {
            System.out.printf("\nx = %.0f ; y = %.0f", 
                equation.computeX(), equation.computeY());
        } else {
            System.out.println("\nThe equation has no solution");
        }
        
        input.close();
    }
}