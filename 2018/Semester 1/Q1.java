import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num, sum = 0;
        do {
            System.out.print("Enter a integer number, -1 to quit: ");
            num = a.nextInt(); // Before Changed: nextDouble()
            if (num == -1) {
                break; // Before Changed: continue;
            }
            if (num % 2 == 0) // Before Changed: if(num % 2 == 1)
                System.out.println("The number is an even number");
            else
                System.out.println("The number is an odd number");
            sum += num; // Before Changed: sum = num;
        } while (num != -1); // Before Changed: while(num == -1)

        System.out.printf("The sum of all integer numbers(s) is: %d\n", sum); // Before Changed: %5d

        a.close(); // Added
    }
}