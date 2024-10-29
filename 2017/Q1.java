import java.util.Scanner;

// Filename: Q1.java
public class Q1 {  // Fixed class name, removed space in "GraphsTest"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
        int inputNumber;
        int value = 0;
        int counter = 1;  
        
        
        while (counter <= 5) {  
            System.out.print("Enter number: ");
            inputNumber = input.nextInt();

            
            if (inputNumber >= 1 && inputNumber <= 30) {
                switch (counter) {  
                    case 1: number1 = inputNumber; break;
                    case 2: number2 = inputNumber; break;
                    case 3: number3 = inputNumber; break;
                    case 4: number4 = inputNumber; break;
                    case 5: number5 = inputNumber; break;
                }
                counter++;
            } else {
                System.out.println("Invalid Input. Number should be between 1 and 30");
            }
        }
        
        // Print histograms
        for (counter = 1; counter <= 5; counter++) {  
            switch (counter) {
                case 1: value = number1; break;
                case 2: value = number2; break;
                case 3: value = number3; break;
                case 4: value = number4; break;
                case 5: value = number5; break;
            }
            
            for (int j = 1; j <= value; j++) {  
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();  
    }
}
