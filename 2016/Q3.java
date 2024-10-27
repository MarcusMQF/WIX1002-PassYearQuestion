import java.util.Random;
import java.util.Scanner;

public class Q3 {   
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        int[] num = new int[n];

        // Generate random integers between 0 and 1000
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1001);
        }
        
        // Display the random integers
        System.out.print("The random integers: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Find and print the largest number
        int largest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println("The largest number is " + largest);

        // Round each integer to the nearest ten and display
        System.out.print("The approximation of integers to the nearest ten: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.round(num[i] / 10f) * 10;
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Display the integers in reverse order
        System.out.print("The random integers in reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        sc.close();
    }
}
