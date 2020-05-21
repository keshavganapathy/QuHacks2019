import java.util.*;
public class Problem_8 {
	public static void main(String[] args) {
		int lastVal = 1;
		int currentVal = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("input: ");
		int num = (int)(input.nextDouble());
		for (int i = 0; i < num; i++) {
			if (i == 0 || i == 1) {
				System.out.print(1);
			} else {
				int print = currentVal + lastVal;
				System.out.print(print);
				lastVal = currentVal;
				currentVal = print;
			}
			if (i < num - 1) {
				System.out.print(", ");
			}
		}
	}
}
