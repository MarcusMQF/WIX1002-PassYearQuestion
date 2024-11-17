import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        String inputFile = "oaiset.csv";
        OAIRecord[] data = new OAIRecord[50];
        
        // Load records into data array
        System.out.println("Loading Dataset...");
        loadRecord(inputFile, data);
        
        // Clean records to remove any with status "Deleted"
        OAIRecord[] cleanedData = cleanRecord(data);
        
        // Print formatted record details
        System.out.println("The curated record is as follows:");
        printRecord(cleanedData);
        
        // Print summary report of publication counts for each researcher
        System.out.println("\nThe summary report is as follows:");
        reportData(cleanedData);
    }

    public static void loadRecord(String inputFile, OAIRecord[] data) {
        try {
            Scanner sc = new Scanner(new FileInputStream(inputFile));
            sc.nextLine();  // Skip header line
            int i = 0;
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                data[i] = new OAIRecord(line[0], line[1], line[2], Arrays.copyOfRange(line, 3, line.length - 2), line[line.length - 2], line[line.length - 1]);
                i++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static OAIRecord[] cleanRecord(OAIRecord[] records) {
        OAIRecord[] cleanedRecords = new OAIRecord[records.length];
        int count = 0;
        for (OAIRecord record : records) {
            if (record != null && !"Deleted".equalsIgnoreCase(record.getStatus())) {
                cleanedRecords[count++] = record;
            }
        }
        return Arrays.copyOf(cleanedRecords, count);
    }

    public static void printRecord(OAIRecord[] records) {
        int recordNumber = 1;
        for (OAIRecord record : records) {
            System.out.println("Record #" + recordNumber + " " + record);
            recordNumber++;
        }
    }

    public static void reportData(OAIRecord[] records) {
        String[] authors = new String[100];  // Array to store unique author names
        int[] publicationCounts = new int[100];  // Array to store corresponding publication counts
        int uniqueAuthorCount = 0;

        for (OAIRecord record : records) {
            String[] recordAuthors = record.getAuthors();
            for (String author : recordAuthors) {
                if (author == null || author.isEmpty()) continue;
                
                // Check if the author is already in the authors array
                int index = -1;
                for (int i = 0; i < uniqueAuthorCount; i++) {
                    if (authors[i].equals(author)) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {  // New author
                    authors[uniqueAuthorCount] = author;
                    publicationCounts[uniqueAuthorCount] = 1;
                    uniqueAuthorCount++;
                } else {  // Existing author
                    publicationCounts[index]++;
                }
            }
        }

        // Sort authors alphabetically along with their publication counts
        for (int i = 0; i < uniqueAuthorCount - 1; i++) {
            for (int j = i + 1; j < uniqueAuthorCount; j++) {
                if (authors[i].compareTo(authors[j]) > 0) {
                    // Swap authors
                    String tempAuthor = authors[i];
                    authors[i] = authors[j];
                    authors[j] = tempAuthor;

                    // Swap publication counts
                    int tempCount = publicationCounts[i];
                    publicationCounts[i] = publicationCounts[j];
                    publicationCounts[j] = tempCount;
                }
            }
        }

        // Print the summary report
        System.out.println("Summary Report:");
        for (int i = 0; i < uniqueAuthorCount; i++) {
            System.out.println(authors[i] + ": " + publicationCounts[i] + " publications");
        }
    }
}

// Assuming an OAIRecord class like this:
class OAIRecord {
    private String doi;
    private String title;
    private String subject;
    private String[] authors;
    private String keyword;
    private String status;

    public OAIRecord(String doi, String title, String subject, String[] authors, String keyword, String status) {
        this.doi = doi;
        this.title = title;
        this.subject = subject;
        this.authors = authors;
        this.keyword = keyword;
        this.status = status;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return doi + " \"" + title + "\" " + subject + " {" + String.join(", ", authors) + "} " + keyword + " " + status;
    }
}
