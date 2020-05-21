import java.util.*;

public class Problem_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int key, vals;
		String[] words;
		System.out.print("Enter the key: ");
		key = (int)input.nextDouble();
		System.out.print("Enter the number of values: ");
		vals = (int)input.nextDouble();
		input.nextLine();
		words = new String[vals];
		for (int i = 0; i < vals; i++) {
			System.out.print("Enter word " + (i + 1) + ": ");
			words[i] = input.nextLine();
		}
		for (int i = 0; i < vals; i++) {
			System.out.println(convert(key, words[i]));
		}

	}

	public static String convert(int key, String word) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		word = word.toUpperCase();
		String returnVal = "";
		for (int i = 0; i < word.length(); i++) {
			char add = alphabet.charAt((key + alphabet.indexOf(word.charAt(i))) % 26);
			returnVal += add;
		}
		return returnVal;
	}
}
