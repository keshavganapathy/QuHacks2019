import java.util.*;

public class Problem_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			names[i] = input.nextLine();
		}
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello, " + names[i] + "!");
		}
	}
}
