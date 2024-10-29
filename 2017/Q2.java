
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial tuition fee(i.e year 1): ");
        int tuition = sc.nextInt();

        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt();

        double total = computeTuition(tuition, rate, year);

        System.out.printf("The total tuition fee for %d years is $%.2f\n", year, total);


        sc.close();
    }

    public static double computeTuition(int tuition, double rate, int year) {
        double total = 0;
        for (int i = 1; i <= year; i++) {
            total += tuition;
            tuition += tuition * rate / 100;
        }
        return total;
    }
   
}
