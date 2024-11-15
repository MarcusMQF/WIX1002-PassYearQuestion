import java.util.Random;
// Filename: Q1.java
public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers. The random numbers must be from 0-100");
        
        int num, odd=0, even=0; Random r = new Random();
        for (int i=0; i<10; i++) {
        num = r.nextInt(101);
        System.out.print(num + " ");
        if (isEven(num)) {
            even++;
        } else {
            odd++;
        }
        System.out.println("\nNumber of odd number: " + odd);
        System.out.println("Number of even number: " + even);
        }
        }

    public static boolean isEven (int a) { 
        return a % 2 == 0;
    }
}