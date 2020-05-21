import java.util.*;
public class Problem_Bonus_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("number of ducks: ");
		int numOfDucks = Integer.parseInt(input.nextLine());
		System.out.print("duck order: ");
		String[] duckStrings = input.nextLine().split(" ");
		int[] duckNumbers = new int[numOfDucks];
		for (int i = 0; i < duckNumbers.length; i++) {
			duckNumbers[i] = Integer.parseInt(duckStrings[i]);
		}
		
		int startOfSorted = 0;
		int previous = -1;
		for (int i = 0; i < numOfDucks; i++) {
			if (duckNumbers[i] < previous) {
				startOfSorted = i;
			}
			previous = duckNumbers[i];
		}
		
		System.out.println(startOfSorted);
	}
}


