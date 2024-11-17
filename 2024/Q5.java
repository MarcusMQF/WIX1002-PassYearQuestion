import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream("participant.txt"))) {
            // Count the number of participants
            int participantCount = 0;
            while (sc.hasNextLine()) {
                sc.nextLine();
                participantCount++;
            }

            // Rewind the scanner to the start of the file
            sc.close();
            Scanner sc2 = new Scanner(new FileInputStream("participant.txt"));

            String[][] participants = new String[participantCount][4];
            int index = 0;

            // Read the participant data into the 2D array
            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 4) {
                    participants[index][0] = parts[0];  
                    participants[index][1] = parts[1];  
                    participants[index][2] = parts[2];  
                    participants[index][3] = parts[3];  
                    index++;
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }

            // Store pairs
            String[][] pairs = new String[participantCount / 2][2];  // Two participants per pair
            int pairIndex = 0;

            // Compare addresses and form pairs
            for (int i = 0; i < participants.length; i++) {
                String address1 = normalizeAddress(participants[i][3]);
                for (int j = i + 1; j < participants.length; j++) {
                    String address2 = normalizeAddress(participants[j][3]);
                    if (address1.equals(address2)) {
                        pairs[pairIndex][0] = participants[i][0] + ", " + participants[i][2] + " years old";
                        pairs[pairIndex][1] = participants[j][0] + ", " + participants[j][2] + " years old";
                        pairIndex++;
                        break;  // No need to compare with other participants once pair is found
                    }
                }
            }

            // Check if pairs have been fully assigned
            if (pairIndex != participantCount / 2) {
                System.out.println("Warning: Some participants could not be paired.");
            }

            // Write the seating arrangement to the file
            try (FileWriter writer = new FileWriter("grouping.txt")) {
                // Fill Seat A and B with the first pair
                if (pairIndex > 0) {
                    writer.write("Seat A: " + pairs[0][0] + "\n");
                    writer.write("Seat B: " + pairs[0][1] + "\n");
                }

                // Fill Seat C and D with the second pair, if available
                if (pairIndex > 1) {
                    writer.write("Seat C: " + pairs[1][0] + "\n");
                    writer.write("Seat D: " + pairs[1][1] + "\n");
                }

                // Output to the console for verification
                System.out.println("Seating arrangement has been written to 'grouping.txt'");

            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Normalize the address by removing spaces, punctuation, and converting to lowercase
    public static String normalizeAddress(String address) {
        address = address.trim().toLowerCase().replaceAll("\\s+", "").replaceAll("[^a-z0-9]", "");
        return address;
    }
}
