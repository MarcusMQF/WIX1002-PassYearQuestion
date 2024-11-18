import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for font size
        System.out.print("Enter font size: ");
        int fontSize = input.nextInt();

        // Prompt user for font type (the character(s) used to display the "8")
        System.out.print("Enter font type: ");
        String fontType = input.next();

        // Prompt user for format (1 for vertical, 2 for horizontal representation)
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = input.nextInt();

        // Decide which format to display based on user input
        if (format == 1) {
            // Call the method to generate the vertical representation
            vertical(fontSize, fontType);
        } else if (format == 2) {
            // Call the method to generate the horizontal representation
            horizontal(fontSize, fontType);
        } else {
            // Handle invalid input for format
            System.out.println("Invalid format. Please choose 1 or 2.");
        }
    }

    /**
     * Generates and displays the "8" in vertical format.
     * @param fontSize The size of the font.
     * @param fontType The character(s) used to display the "8".
     */
    public static void vertical(int fontSize, String fontType) {
        StringBuilder output = new StringBuilder();

        // Generate the top solid line
        output.append(createLine(fontSize, fontType));

        // Generate the top hollow section (edges filled, middle spaces)
        output.append(createHollowSection(fontSize, fontType));

        // Generate the middle solid line
        output.append(createLine(fontSize, fontType));

        // Generate the bottom hollow section (similar to top hollow)
        output.append(createHollowSection(fontSize, fontType));

        // Generate the bottom solid line
        output.append(createLine(fontSize, fontType));

        // Display the final output
        System.out.println(output.toString());
    }

    /**
     * Generates and displays the "8" in horizontal format.
     * @param fontSize The size of the font.
     * @param fontType The character(s) used to display the "8".
     */
    public static void horizontal(int fontSize, String fontType) {
        StringBuilder output = new StringBuilder();

        // Generate the top solid line
        output.append(createLine(fontSize * 2, fontType));

        // Generate the middle hollow section (alternates between filled and spaces)
        output.append(createHorizontalHollow(fontSize, fontType));

        // Generate the bottom solid line
        output.append(createLine(fontSize * 2, fontType));

        // Display the final output
        System.out.println(output.toString());
    }

    /**
     * Creates a solid line of characters.
     * @param fontSize The size of the line (number of characters).
     * @param fontType The character(s) used to create the line.
     * @return A string representing the solid line.
     */
    public static String createLine(int fontSize, String fontType) {
        StringBuilder line = new StringBuilder();

        // Start with the first character
        line.append(fontType);

        // Add repeated characters based on fontSize
        for (int i = 0; i < fontSize; i++) {
            line.append(fontType);
        }

        // Add the last character and a newline
        line.append(fontType).append("\n");
        return line.toString();
    }

    /**
     * Creates a hollow section where edges are filled and middle is empty.
     * @param fontSize The size of the section (number of rows and spaces).
     * @param fontType The character(s) used to create the edges.
     * @return A string representing the hollow section.
     */
    public static String createHollowSection(int fontSize, String fontType) {
        StringBuilder hollow = new StringBuilder();

        // Create rows for the hollow section
        for (int j = 0; j < fontSize; j++) {
            hollow.append(fontType); // Left edge
            for (int i = 0; i < fontSize; i++) { // Middle spaces
                hollow.append(" ");
            }
            hollow.append(fontType).append("\n"); // Right edge
        }

        return hollow.toString();
    }

    /**
     * Creates a horizontal hollow section where there are spaces between characters.
     * @param fontSize The size of the hollow section (number of rows and spaces).
     * @param fontType The character(s) used to create the edges.
     * @return A string representing the horizontal hollow section.
     */
    public static String createHorizontalHollow(int fontSize, String fontType) {
        StringBuilder hollow = new StringBuilder();

        // Create rows for the horizontal hollow section
        for (int j = 0; j < fontSize; j++) {
            hollow.append(fontType); // Left edge
            for (int i = 0; i < fontSize; i++) { // Middle spaces
                hollow.append(" ");
            }
            hollow.append(fontType); // Middle character
            for (int i = 0; i < fontSize; i++) { // Middle spaces
                hollow.append(" ");
            }
            hollow.append(fontType).append("\n"); // Right edge
        }

        return hollow.toString();
    }
}
