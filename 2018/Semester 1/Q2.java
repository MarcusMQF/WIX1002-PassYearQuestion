import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N number: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = GeneratedNum(n);
        GroupAssign(numbers);

        scanner.close();
    }

    public static ArrayList<Integer> GeneratedNum(int n){
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("The random numbers are: ");
        for(int i = 0; i < n; i++){
            int MAX = 151;
            int MIN = 50;
            int GeneratedNum = random.nextInt(MIN, MAX);
            numbers.add(GeneratedNum);
            System.out.print(GeneratedNum + " ");
        }
        System.out.println();

        return numbers;
    }

    public static void GroupAssign(ArrayList<Integer> numbers){
        int group1Count = 0;
        int group2Count = 0;
        int group3Count = 0;

        for(int number: numbers){
            if((number % 10) >= 0 && (number % 10) <= 3){
                group1Count++;
            }else if((number % 10) >= 4 && (number % 10) <= 6){
                group2Count++;
            }else if((number % 10) >= 7 && (number % 10) <= 9){
                group3Count++;
            }
        }

        System.out.println("Group AAA: " + group1Count);
        System.out.println("Group AA: " + group2Count);
        System.out.println("Group A: " + group3Count);
    }
}


