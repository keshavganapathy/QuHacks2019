import java.util.*;

public class Problem_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) == '(') {
				words = combineArrayIndices(words, i, i + 1);
			}
		}

		// printArray(words);
		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) == '(') {
				int commaIndex = -1;
				int wordIndex = 0;
				while (commaIndex == -1) {
					if (words[i].charAt(wordIndex) == ',') {
						commaIndex = wordIndex;
					}
					wordIndex++;
				}
				int secondParenIndex = 0;
				char[] tempChars = words[i].toCharArray();
				for (int k = 0; k < tempChars.length; k++) {
					if (tempChars[k] == ')') {
						secondParenIndex = k;
					}

				}
				String verb = words[i].substring(1, commaIndex);
				String subject = words[i].substring(commaIndex + 1, secondParenIndex);
				String punct = words[i].substring(secondParenIndex + 1);
				words[i] = conjugate(verb, subject) + punct;
			}
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}

	public static String[] insertString(String[] arr, String addition, int index) {
		String[] returnArray = new String[arr.length + 1];
		for (int i = 0; i < index; i++) {
			returnArray[i] = arr[i];
		}
		returnArray[index] = addition;
		for (int i = index; i < arr.length; i++) {
			returnArray[i + 1] = arr[i];
		}
		return returnArray;
	}

	public static void printArray(String[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + "| ");
		}
		System.out.println(arr[arr.length - 1] + "}");
	}

	public static String[] combineArrayIndices(String[] arr, int index1, int index2) {
		String[] returnArray = new String[arr.length - 1];
		for (int i = 0; i < index1; i++) {
			returnArray[i] = arr[i];
		}
		returnArray[index1] = arr[index1] + arr[index2];
		for (int i = index2; i < arr.length - 1; i++) {
			returnArray[i] = arr[i + 1];
		}
		return returnArray;
	}

	public static String[] appendArray(String[] arr, String addition) {
		String[] returnArray = new String[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			returnArray[i] = arr[i];
		}

		return returnArray;
	}

	public static String conjugate(String toConjugate, String subject) {
		String root = toConjugate.substring(0, toConjugate.length() - 2);
		String suffix = toConjugate.substring(toConjugate.length() - 2);
		if (suffix.equals("ar")) {
			if (subject.equals("yo")) {
				root += "o";
			} else if (subject.equals("tu")) {
				root += "as";
			} else if (subject.equals("usted") || subject.equals("ella") || subject.equals("el")) {
				root += "a";
			} else if (subject.equals("nosotros")) {
				root += "amos";
			} else if (subject.equals("vosotros")) {
				root += "ais";
			} else if (subject.equals("ustedes") || subject.equals("ellas") || subject.equals("ellos")) {
				root += "an";
			}

		} else if (suffix.equals("er")) {
			if (subject.equals("yo")) {
				root += "o";
			} else if (subject.equals("tu")) {
				root += "es";
			} else if (subject.equals("usted") || subject.equals("ella") || subject.equals("el")) {
				root += "e";
			} else if (subject.equals("nosotros")) {
				root += "emos";
			} else if (subject.equals("vosotros")) {
				root += "eis";
			} else if (subject.equals("ustedes") || subject.equals("ellas") || subject.equals("ellos")) {
				root += "en";
			}

		} else if (suffix.equals("ir")) {
			if (subject.equals("yo")) {
				root += "o";
			} else if (subject.equals("tu")) {
				root += "es";
			} else if (subject.equals("usted") || subject.equals("ella") || subject.equals("el")) {
				root += "e";
			} else if (subject.equals("nosotros")) {
				root += "imos";
			} else if (subject.equals("vosotros")) {
				root += "is";
			} else if (subject.equals("ustedes") || subject.equals("ellas") || subject.equals("ellos")) {
				root += "en";
			}

		}
		return root;
	}
}
