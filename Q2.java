import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int player, computer;
        int score_player = 0, score_computer = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("First to reach 3 wins takes the game!");

        // Game loop continues until one reaches 3 wins
        for (int round = 1; round <= 7; round++) {
            System.out.println("Round " + round);
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
            player = sc.nextInt();
            computer = new Random().nextInt(3);

            if (player == 0 && computer == 1) {
                System.out.println("Computer wins this round!");
                score_computer++;
            } else if (player == 0 && computer == 2) {
                System.out.println("Player wins this round!");
                score_player++;
            } else if (player == 1 && computer == 0) {
                System.out.println("Player wins this round!");
                score_player++;
            } else if (player == 1 && computer == 2) {
                System.out.println("Computer wins this round!");
                score_computer++;
            } else if (player == 2 && computer == 0) {
                System.out.println("Computer wins this round!");
                score_computer++;
            } else if (player == 2 && computer == 1) {
                System.out.println("Player wins this round!");
                score_player++;
            } else {
                System.out.println("It's a draw this round!");
            }

            System.out.println("Current Score - Player: " + score_player + " | Computer: " + score_computer);
            System.out.println();

            // Check if either player has won 3 rounds
            if (score_player == 3) {
                System.out.println("Player wins the game!");
                break;
            } else if (score_computer == 3) {
                System.out.println("Computer wins the game!");
                break;
            }
        }

        sc.close();
    }
}
