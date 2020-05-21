import java.util.*;
public class Problem_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double LCM;
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.print("Enter your first Number: ");
		double num1 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter your Second Number: ");
		double num2 = Double.parseDouble(myObj.nextLine());
		LCM = findLCM(num1, num2);
		System.out.print("The LCM is: " + LCM);
	}

	public static double findLCM(double num1, double num2) {
		boolean found = false;
		double LCM;
		if (num1 >= num2) {
			LCM = num1;
		} else {
			LCM = num2;
		}
		while (!found) {
			if (LCM % num1 == 0 && LCM % num2 == 0) {
				found = true;
			} else {
				LCM++;
			}
		}
		return LCM;
	}
	public static boolean isDouble(String n) {
		try {
			Double.parseDouble(n);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
