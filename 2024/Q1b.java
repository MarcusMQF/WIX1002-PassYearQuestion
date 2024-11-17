import java.util.Scanner;

public class Q1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fraction_sum = 0;
        int n;

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fraction_sum += 1.0 / i;
        }

        System.out.println("Sum of the series: " + fraction_sum);

        sc.close();
    }
}
