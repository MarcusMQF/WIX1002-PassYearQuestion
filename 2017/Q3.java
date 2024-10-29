import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        // Generate random character array
        char[] arr = generateRandomChars(6);
        System.out.println("Original Array: " + new String(arr));

        // Write the generated characters to data.txt
        writeToFile("data.txt", arr);

        // Ascending sort
        char[] ascending = arr.clone();
        bubbleSort(ascending, '>');
        System.out.println("Ascending Order: " + new String(ascending));

        // Descending sort
        char[] descending = arr.clone();
        bubbleSort(descending, '<');
        System.out.println("Descending Order: " + new String(descending));

        // Read and display the original string from data.txt
        System.out.print("Original String from File: ");
        readFromFile("data.txt");
    }

    
    public static char[] generateRandomChars(int length) {
        Random rand = new Random();
        char[] arr = new char[length];

        for (int i = 0; i < length; i++) {
            int asciiCode;
            if (rand.nextBoolean()) {
                asciiCode = 65 + rand.nextInt(26); 
            } else {
                asciiCode = 97 + rand.nextInt(26); 
            }
            arr[i] = (char) asciiCode;
        }
        return arr;
    }

    
    public static void writeToFile(String filename, char[] arr) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(arr);
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    // Reads and displays content from a file
    public static void readFromFile(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }

    // Bubble sort for char array
    public static void bubbleSort(char[] arr, char mode) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((mode == '>' && arr[j] > arr[j + 1]) || (mode == '<' && arr[j] < arr[j + 1])) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
