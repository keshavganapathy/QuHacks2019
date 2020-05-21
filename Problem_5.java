import java.util.Scanner;
public class Problem_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input: ");
		String str = input.nextLine();
		int val = (int)Double.parseDouble(str);
		doOp(val);
	}
	public static void doOp(int max) {
		for(int i = 1; i <= (int)max; i++) {
			if(i%2==0)
				System.out.print(i + " ");
		}
	}
}



