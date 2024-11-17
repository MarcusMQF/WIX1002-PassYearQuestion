import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try {
            // Open the file for reading
            Scanner sc = new Scanner(new FileInputStream("raw.txt"));
            int[] num = new int[50];  // Array to hold the numbers from the file
            int count = 0;  // To keep track of how many numbers we read
            
            // Reading numbers from the file until there are no more integers or we reach the array limit
            while (sc.hasNextInt() && count < num.length) {
                num[count++] = sc.nextInt();
            }
            sc.close();  // Close the scanner after reading all numbers

            // Generate the frequency distribution table
            int[] frequency = frequencyDistributionTable(num, count);

            int mode = -1;  // Variable to hold the mode of the dataset
            int maxFrequency = 0;  // Variable to hold the highest frequency

            // Print the frequency distribution table
            System.out.println("Frequency Distribution Table:");
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    System.out.println(i + ": " + frequency[i]);  // Print the number and its frequency
                    // Check if the current number has the highest frequency
                    if (frequency[i] > maxFrequency) {
                        maxFrequency = frequency[i];
                        mode = i;  // Update the mode if we find a number with a higher frequency
                    }
                }
            }
            // Output the mode
            System.out.println("The mode of the dataset is: " + mode);

        } catch (FileNotFoundException e) {
            // Handle case when the file is not found
            System.out.println("File not found.");
        }
    }

    // Method to calculate the frequency distribution of the numbers
    public static int[] frequencyDistributionTable(int[] num, int count) {
        int[] frequency = new int[11]; // Array to hold the frequency of numbers from 0 to 10
        for (int i = 0; i < count; i++) {
            if (num[i] >= 0 && num[i] <= 10) {
                frequency[num[i]]++;  // Increment the frequency of the corresponding number
            }
        }
        return frequency;  // Return the frequency table
    }
}
