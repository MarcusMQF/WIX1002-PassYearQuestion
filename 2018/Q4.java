import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double highestScore = 0;
        String highestScorer = "";

        try {
            // Open the file for reading
            Scanner sc = new Scanner(new FileInputStream("Q4.txt"));

            while (sc.hasNextLine()) {
                // Read each line
                String line = sc.nextLine().trim();

                // Split the line into parts using a comma delimiter
                String[] result = line.split(",");

                // Validate the line format
                if (result.length != 7) {
                    System.out.println("Invalid line format: " + line);
                    continue;
                }

                // Extract name, scores, and degree of difficulty
                String name = result[0];
                double[] scores = new double[5];
                for (int i = 0; i < 5; i++) {
                    scores[i] = Double.parseDouble(result[i + 1]);
                }
                int degreeOfDifficulty = Integer.parseInt(result[6]);

                // Calculate the final score
                double finalScore = getScore(scores, degreeOfDifficulty);

                // Print the contestant's name, marks, and final score
                System.out.print(name + "'s Marks ");
                System.out.printf("%.2f%n", finalScore);

                // Update the highest score and scorer if necessary
                if (finalScore > highestScore) {
                    highestScore = finalScore;
                    highestScorer = name;
                }
            }

            // Print the highest scorer and their score
            System.out.printf("Highest Scorer: %s with a score of %.2f%n", highestScorer, highestScore);

        } catch (IOException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing numbers: " + e.getMessage());
        }
    }

    // Calculate the final score based on the rules
    public static double getScore(double[] scores, int degreeOfDifficulty) {
        double min = scores[0];
        double max = scores[0];
        double sum = 0;

        // Find the min, max, and sum of the scores
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        // Remove the min and max, then multiply by degree of difficulty
        return (sum - min - max) * degreeOfDifficulty;
    }
}
