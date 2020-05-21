import java.util.Scanner;

public class Problem_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num1 = (int)input.nextDouble();
		if(isPrime(num1)) {
			System.out.println(num1 + " is prime.");
		}else {
			System.out.println(num1 + " is not prime.");
		}
	}
	public static boolean isPrime(int n) {
		if(n == 1) { 
			return false;
		}else if(n == 0) {
			return false;
		}
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}




