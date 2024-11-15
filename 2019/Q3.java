import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Prompt user for genome string input
            System.out.print("Enter genome string [quit to stop]: ");
            String genome = sc.nextLine();

            // Check if the user wants to quit
            if (genome.equals("quit")) {
                break;
            }

            String initialTriplet = "ATG";
            String[] endingTriplets = {"TAA", "TAG", "TGA"};

            // Find genes in the genome
            int startIndex = 0;
            boolean foundGene = false;

            while (startIndex < genome.length()) {
                // Find the first occurrence of "ATG" which marks the start of a gene
                // Start searching from the last found gene's end position
                // If no gene was found yet, start from the beginning
                // If no "ATG" is found, there are no more genes
                int startPos = genome.indexOf(initialTriplet, startIndex);
                if (startPos == -1) {
                    break; 
                }

                // Find the first occurrence of any of the ending triplets
                // Start searching from the position after "ATG"
                // If no gene was found yet, start from the beginning
                // If no ending triplet is found, there are no more genes
                // If multiple ending triplets are found, choose the one that appears first
                int endPos = -1;
                for (String endTriplet : endingTriplets) {
                    int tempEndPos = genome.indexOf(endTriplet, startPos + 3); // Skip past "ATG"
                    if (tempEndPos != -1 && (endPos == -1 || tempEndPos < endPos)) {
                        endPos = tempEndPos;
                    }
                }

                // If an end triplet was found
                // Extract the gene substring (it must be a multiple of 3 in length)
                // Print the gene and set foundGene to true
                // Move the startIndex to the position after the end of the current gene
                if (endPos != -1) {
                    // Extract the gene substring (it must be a multiple of 3 in length)
                    String gene = genome.substring(startPos + 3, endPos);
                    if (gene.length() % 3 == 0) {
                        System.out.println(gene);
                        foundGene = true;
                    }
                    startIndex = endPos + 3; 
                } else {
                    break; 
                }
            }

            if (!foundGene) {
                System.out.println("No gene is found");
            }
        }

        sc.close();
    }
}
