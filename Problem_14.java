import java.util.Scanner;
public class Problem_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of Pizza, Chips, and Coffee: ");
		double pizza = input.nextDouble();
		double chips = input.nextDouble();
		double coffee = input.nextDouble();
		System.out.print((2.5 * pizza) + (chips) + (1.5 * coffee));
	}
}
