import java.util.Scanner; // Import the Scanner class
public class Problem_6 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.print("Enter your first Number: ");
		double num1 = myObj.nextDouble();
		System.out.print("Enter your Second Number: ");
		double num2 = myObj.nextDouble();
		myObj.nextLine();
		System.out.print("Enter your Operator: ");
		String operator = myObj.nextLine();
		while(!(isOperator(operator))) {
			System.out.println("Invalid Entry!");
			System.out.println("Enter an Operator: ");
			operator = myObj.nextLine();
		}
		char oper = operator.charAt(0);
		if (oper == 42) {
			System.out.print(num1 * num2);
		} else if (oper == 43) {
			System.out.print(num1 + num2);
		} else if (oper == 45) {
			System.out.print(num1 - num2);
		} else if (oper == 47) {
			System.out.print(num1 / num2);

		}
	}
	public static boolean isOperator(String n) {
		if(n.length()>1) {
			return false;
		}
		if((!n.equals("*"))&&(!n.equals("+"))&&(!n.equals("-"))&&(!n.equals("/"))) {
			return false;
		}
		return true;
	}
}
