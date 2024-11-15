import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        int[] charCount = new int[26]; // Array to store count of each character (a-z)
        int numberOfWords = 0; // Variable to store the number of words
        int numberOfSentence = 0; // Variable to store the number of sentences

        try {
            BufferedReader br = new BufferedReader(new FileReader("myAmbition.txt")); // Open the file for reading
            String line;
            boolean isFirstLine = true; // Flag to check if it's the first line
            while ((line = br.readLine()) != null) { // Read the file line by line
                if (isFirstLine) { // If it's the first line, skip it
                    isFirstLine = false;
                    continue;
                }
                line = line.toLowerCase(); // Convert the line to lowercase
                for (int i = 0; i < line.length(); i++) { // Iterate through each character in the line
                    char ch = line.charAt(i);
                    if (ch >= 'a' && ch <= 'z') { // If the character is a letter, increment the corresponding count
                        // Subtracting 'a' from the character gives the index in the array
                        // Increment the count at that index
                        // For example, if ch = 'a', then ch - 'a' = 0, so charCount[0]++
                        // If ch = 'b', then ch - 'a' = 1, so charCount[1]++
                        // This way, we are counting the occurrences of each character
                        charCount[ch - 'a']++;
                    } else if (ch == ' ') { // If the character is a space, increment the word count
                        numberOfWords++;
                    } else if (ch == '.') { // If the character is a period, increment the sentence count
                        numberOfSentence++;
                    }
                }
            }
            br.close(); // Close the file

            // Print the character counts
            for (int i = 0; i < charCount.length; i++) {
                System.out.println((char) (i + 'a') + ": " + charCount[i]);
            }
            System.out.println("Number of words: " + (numberOfWords + 1)); // Adding 1 to count the last word
            System.out.println("Number of sentences: " + numberOfSentence);

        } catch (FileNotFoundException e) {
            System.out.println("File not found"); // Handle the case where the file is not found
        } catch (IOException e) {
            System.out.println("Error reading file"); // Handle any other IO exceptions
        }
    }
}
