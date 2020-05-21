import java.util.Scanner;

public class Problem_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input First List: ");
		String str = input.nextLine();
		String[] one = str.split(", ");
		System.out.print("Input Second List: ");
		str = input.nextLine();
		String[] two = str.split(", ");
		String[] test = doOp(one,two);
		System.out.print(test[0]);
		for(int i = 1; i < test.length; i++)
			System.out.print(", " + test[i]);
	}
	public static String[] doOp(String[] one, String[] two) {
		String[] returnVal = new String[one.length * 2];
		int counter = 0;
		for(int i = 0; i < one.length; i++) {
			returnVal[counter] = one[i];
			counter++;
			returnVal[counter] = two[i];
			counter++;
		}
		return returnVal;
	}
}



