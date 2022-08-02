import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] rps = {"Rock", "Paper", "Scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.println("Please enter your move (Rock, Paper, or Scissors)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                break;
            }
            System.out.println(playerMove + " is not a valid move.");
        }

        System.out.println("computer played: " + computerMove);

        if (playerMove == computerMove) {
            System.out.println("The game was a tie");
        } else if (playerMove.equals("Rock")) {
            if (computerMove.equals("Paper")) {
                System.out.println("You Lose");

            } else if (computerMove.equals("Scissors")) {
                System.out.println("You Win");
            }
        } else if (playerMove.equals("Paper")) {
            if (computerMove.equals("Scissors")) {
                System.out.println("You Lose");

            } else if (computerMove.equals("Rock")) {
                System.out.println("You Win");
            }
        } else if (playerMove.equals("Scissors")) {
            if (computerMove.equals("Rock")) {
                System.out.println("You Lose");

            } else if (computerMove.equals("Paper")) {
                System.out.println("You Win");
            }
        }
    }
}