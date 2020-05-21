import java.util.*;
public class Problem_13a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("first x: ");
		double x1 = input.nextDouble();
		System.out.println("first y: ");
		double y1 = input.nextDouble();
		System.out.println("second x: ");
		double x2 = input.nextDouble();
		System.out.println("second y: ");
		double y2 = input.nextDouble();
		double slope = (y2 - y1) / (x2 - x1);
		if((x2-x1) == 0) {
			System.out.println("slope: undefined");
		}else {
			System.out.println("slope: " + slope);
		}
	}
}
