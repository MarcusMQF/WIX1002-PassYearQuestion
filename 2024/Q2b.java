
import java.util.Scanner;


public class Q2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt(); 

        try {
            checkAge(age);
            System.out.println("Valid age");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    public static boolean checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age");
        }
        return true;
    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}
