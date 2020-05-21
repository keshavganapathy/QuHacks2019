import java.util.*;

public class Problem_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean found = false;
		int low = 0, high = 100000, turns = 0, generate;
		boolean limit = false, entered = true;
		String user;
		while(!found) {
			turns++;
			do {
				generate = guess(low, high);
			} while(generate==low || generate==high);
			entered = true;
			do {
				if(!entered) {
					System.out.println("Invalid answer ");
				}
				System.out.print(generate+": ");
				user = input.nextLine();
				if(user.toLowerCase().equals("higher")) {
					if(limit) {
						low = generate;
					} else {
						low = generate;
						high += 20;
					}
					entered = true;
				} else if(user.toLowerCase().equals("lower")) {
					high = generate;
					limit = true;
					entered = true;
				} else if(user.toLowerCase().equals("correct")){
					found = true;
					entered = true;
				} else {
					entered = false;
				}
			} while(!entered);
		}
		System.out.print("It took the computer "+turns+" tries");
	}
	public static int guess(int low, int high) {
		return (int)(Math.random()*(high-low))+low;
	}
}


