import java.util.Random;

public class Q4a {

    // Initializes the seating plan with random values (0 or 1) representing unoccupied or occupied seats.
    public static void initializeSeatingPlan(int[][] seatingPlan) {
        Random rand = new Random();
        
        // Loop through each row and column in the seatingPlan
        for (int i = 0; i < seatingPlan.length; i++) {
            for (int j = 0; j < seatingPlan[i].length; j++) {
                seatingPlan[i][j] = rand.nextInt(2);  // Randomly assign 0 or 1 to represent unoccupied or occupied seats
            }
        }
    }

    // Analyzes the seating plan around a specific seat (row, col)
    public static int analyzeSeating(int[][] seatingPlan, int row, int col) {
        int occupiedSeats = 0;

        // Loop through all seats surrounding the given seat (including diagonals)
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                // Skip out-of-bounds indices
                if (i >= 0 && i < seatingPlan.length && j >= 0 && j < seatingPlan[i].length) {
                    // Skip the seat itself (we are analyzing neighbors)
                    if (i == row && j == col) {
                        continue;
                    }
                    // If the adjacent seat is occupied, increment the count
                    if (seatingPlan[i][j] == 1) {
                        occupiedSeats++;
                    }
                }
            }
        }
        return occupiedSeats;
    }

    // Analyzes the entire seating plan to find the row with the most occupied seats
    public static int findRowWithMostOccupiedSeats(int[][] seatingPlan) {
        int maxOccupied = 0;
        int rowWithMostOccupied = -1;

        for (int i = 0; i < seatingPlan.length; i++) {
            int occupiedInRow = 0;
            for (int j = 0; j < seatingPlan[i].length; j++) {
                if (seatingPlan[i][j] == 1) {
                    occupiedInRow++;
                }
            }
            if (occupiedInRow > maxOccupied) {
                maxOccupied = occupiedInRow;
                rowWithMostOccupied = i;
            }
        }
        return rowWithMostOccupied;
    }

    // Prints the seating plan in a readable format
    public static void printSeatingPlan(int[][] seatingPlan) {
        for (int i = 0; i < seatingPlan.length; i++) {
            for (int j = 0; j < seatingPlan[i].length; j++) {
                System.out.print(seatingPlan[i][j] + " ");  // Print each seat value (0 or 1)
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    // Main method: Entry point to the program
    public static void main(String[] args) {
        int[][] seatingPlan = new int[5][5];  // Create a 5x5 seating plan (5 rows and 5 columns)
        
        // Initialize the seating plan with random values
        initializeSeatingPlan(seatingPlan);
        
        // Print the seating plan
        System.out.println("Seating Plan:");
        printSeatingPlan(seatingPlan);

        // Calculate the total number of occupied seats in the seating plan
        int totalOccupiedSeats = 0;
        for (int i = 0; i < seatingPlan.length; i++) {
            for (int j = 0; j < seatingPlan[i].length; j++) {
                if (seatingPlan[i][j] == 1) {
                    totalOccupiedSeats++;
                }
            }
        }

        // Output the total number of occupied seats
        System.out.println("Total occupied seats: " + totalOccupiedSeats);

        // Find and display the row with the most occupied seats
        int rowWithMostOccupied = findRowWithMostOccupiedSeats(seatingPlan);
        System.out.println("Row with most occupied seats: " + rowWithMostOccupied);
    }
}
