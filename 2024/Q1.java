
import java.util.Scanner;


public class Q1{
    public static void main (String []args){

        int positive_count = 0, negative_count = 0,zeros_count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (Press X to quit): ");
        while (true) { 
            String input = sc.nextLine();
            if (input.equals("X")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    positive_count++;
                } else if (number < 0) {
                    negative_count++;
                } else {
                    zeros_count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
        
        System.out.println("Positive numbers: " + positive_count);
        System.out.println("Negative numbers: " + negative_count);
        System.out.println("Zeros: " + zeros_count);

        sc.close();



    }

    
}