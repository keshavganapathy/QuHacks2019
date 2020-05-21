import java.util.*;

public class Problem_Bonus_1 {
	public static void main(String[] args) {
		String[][] board = new String[3][3];
		Scanner input = new Scanner(System.in);
		System.out.print("line 1: ");
		String col1 = input.nextLine();
		System.out.print("line 2: ");
		String col2 = input.nextLine();
		System.out.print("line 3: ");
		String col3 = input.nextLine();
		for (int i = 0; i < 3; i++) {
			board[0][i] = col1.substring(i, i + 1);
		}
		for (int i = 0; i < 3; i++) {
			board[1][i] = col2.substring(i, i + 1);
		}
		for (int i = 0; i < 3; i++) {
			board[2][i] = col3.substring(i, i + 1);
		}
		int singleWinners = 0;
		int teamWinners = 0;
		// horizontal
		String[] initials;
		String[] seen = new String[0];
		initials = new String[3];
		for (int row = 0; row < 3; row++) {
			seen = new String[0];
			initials = new String[3];
			for (int col = 0; col < 3; col++) {

				initials[col] = board[row][col];
			}

			int numOfLetters = 0;
			for (int i = 0; i < 3; i++) {
				if (!inArray(seen, initials[i])) {
					numOfLetters++;
					seen = appendArray(seen, initials[i]);
				}
			}
			if (numOfLetters == 1) {
				singleWinners++;
			}
			if (numOfLetters == 2) {
				teamWinners++;
			}
		}

		// vertical
		for (int col = 0; col < 3; col++) {
			seen = new String[0];
			initials = new String[3];
			for (int row = 0; row < 3; row++) {

				initials[row] = board[row][col];
			}

			int numOfLetters = 0;
			for (int i = 0; i < 3; i++) {
				if (!inArray(seen, initials[i])) {
					numOfLetters++;
					seen = appendArray(seen, initials[i]);
				}
			}
			if (numOfLetters == 1) {
				singleWinners++;
			}
			if (numOfLetters == 2) {
				teamWinners++;
			}
		}
		// diagonal

		for (int k = 0; k <= 1; k++) {
			seen = new String[0];
			initials = new String[3];
			if (k == 0) {
				initials[0] = board[0][0];
				initials[1] = board[1][1];
				initials[2] = board[2][2];
			} else {
				initials[0] = board[2][0];
				initials[1] = board[1][1];
				initials[2] = board[0][2];
			}

			int numOfLetters = 0;
			for (int i = 0; i < 3; i++) {
				if (!inArray(seen, initials[i])) {
					numOfLetters++;
					seen = appendArray(seen, initials[i]);
				}
			}
			if (numOfLetters == 1) {
				singleWinners++;
			}
			if (numOfLetters == 2) {
				teamWinners++;
			}
		}

		System.out.println("Single winners: " + singleWinners);
		System.out.println("Team winners: " + teamWinners);
	}

	public static boolean inArray(String[] arr, String check) {
		boolean returnBoolean = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(check)) {
				returnBoolean = true;
			}
		}
		return returnBoolean;
	}

	public static String[] appendArray(String[] arr, String addition) {
		String[] returnArray = new String[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			returnArray[i] = arr[i];
		}
		returnArray[returnArray.length - 1] = addition;

		return returnArray;
	}
}
