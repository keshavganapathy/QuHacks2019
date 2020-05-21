import java.util.*;
public class Problem_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Input: ");
		String a = input.nextLine();
		String[] arr = a.split(" ");
		if(doOp(arr[0],arr[1])) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	public static boolean doOp(String mixed, String right) {
		if(mixed.length() > right.length()) {
			return false;
		}else if(right.length() > mixed.length()) {
			return false;
		}
		
		int val1 = 0;
		int val2 = 0;
		for(int i = 0; i < mixed.length(); i++) {
			val1 += (int)(mixed.charAt(i));
			val2 += (int)(right.charAt(i));
		}
		if(val1==val2) {
			return true;
		}else {
			return false;	
		}
	}
}


