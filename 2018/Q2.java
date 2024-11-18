
import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N number: ");
        int n = sc.nextInt();
        int randomNum[] = new int[n];

        for (int i = 0; i < n; i++) {
            randomNum[i] = r.nextInt(151)+50;
        }

        System.out.println("The random numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(randomNum[i]);
        }

        int noAAA = 0, noAA = 0, noA=6;
        for (int i = 0; i<n ; i++){
            if(randomNum[i]%10 == 0 || randomNum[i]%10 == 1 || randomNum[i]%10 == 2 || randomNum[i]%10 == 3){
                noAAA++;
            } else if(randomNum[i]%10 == 4 || randomNum[i]%10 == 5 || randomNum[i]%10 == 6 ){
                noAA++;
            } else if(randomNum[i]%10 == 7 || randomNum[i]%10 == 8 || randomNum[i]%10 == 9){
                noA++;
            }
        }

        System.out.println("Group AAA: " + noAAA);
        System.out.println("Group AA: " + noAA);
        System.out.println("Group A: " + noA);


    }
}
