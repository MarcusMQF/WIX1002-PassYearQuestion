import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileInputStream("C:\\Users\\kimho\\OneDrive\\Documents\\STUDY\\UM\\Y1S1\\UM-WIX1002-main\\UM-WIX1002-main\\A - Questions Bank\\Past Year\\2016\\Password.txt"));
            while (in.hasNextLine()) {
                String password = in.nextLine();
                if (strengthChecker(password))
                    System.out.println(password + " - Strong password.");
                else
                    System.out.println(password + " - Not a strong password.");
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }

    public static boolean strengthChecker(String password) {
        // Check if the password meets all criteria
        boolean length = password.length() >= 8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean lower = password.matches(".*[a-z].*");
        boolean digit = password.matches(".*[0-9].*");
        boolean nonAlphaChar = password.matches(".*[^a-zA-Z0-9].*");

        // Return true if all conditions are met
        return length && upper && lower && digit && nonAlphaChar;
    }
}
