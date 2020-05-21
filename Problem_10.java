import java.util.Random;
import java.util.Scanner;

public class Problem_10 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		boolean gameOver = true;
		String player;
		do {
			gameOver = true;
			System.out.print("Rock, Paper, or Scissors: ");
			player = myObj.nextLine();
			player = player.toLowerCase();
			if (player.equals("rock") || player.equals("scissors") || player.equals("paper"))
				gameOver = play(player);
			else {
				System.out.println("Invalid Input");
				gameOver = false;
			}
		} while (!gameOver);

	}

	public static boolean play(String playerChoice) {
		Random rand = new Random();
		int compChoice = rand.nextInt(3);
		// 0 rock
		// 1 scissor
		// 2 paper
		System.out.print("Computer chooses ");
		if (playerChoice.equals("rock")) {
			if (compChoice == 0) {
				System.out.println("Rock");
				System.out.println("Tie");
				return false;
			} else if (compChoice == 1) {
				System.out.println("Scissor");
				System.out.println("Player Win");
			} else if (compChoice == 2) {
				System.out.println("Paper");
				System.out.println("Computer Win");
			}

		} else if (playerChoice.equals("scissors")) {
			if (compChoice == 0) {
				System.out.println("Rock");
				System.out.println("Computer Win");
			} else if (compChoice == 1) {
				System.out.println("Scissor");
				System.out.println("Tie");
				return false;
			} else if (compChoice == 2) {
				System.out.println("Paper");
				System.out.println("Player Win");
			}
		} else if (playerChoice.equals("paper")) {
			if (compChoice == 0) {
				System.out.println("Rock");
				System.out.println("PlayerWin");
			} else if (compChoice == 1) {
				System.out.println("Scissor");
				System.out.println("Computer Win");
			} else if (compChoice == 2) {
				System.out.println("Paper");
				System.out.println("Tie");
				return false;
			}
		}
		return true;
	}

}