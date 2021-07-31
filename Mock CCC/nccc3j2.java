import java.util.Scanner;

public class nccc3j2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		boolean palindrome = false;

		for (int split = 1; split < s.length(); split++) {

			String first = s.substring(0, split);
			boolean palindrome1 = true;
			for (int i = 0; i < first.length(); i++) {
				char a = s.charAt(i);
				char b = s.charAt(first.length() - 1 - i);
				if (a != b) {
					palindrome1 = false;
					break;
				}
			}

			String second = s.substring(split, s.length());
			boolean palindrome2 = true;
			for (int i = 0; i < second.length(); i++) {
				char a = second.charAt(i);
				char b = second.charAt(second.length() - 1 - i);
				if (a != b) {
					palindrome2 = false;
					break;
				}
			}

			if (palindrome1 && palindrome2) {
				palindrome = true;
				break;
			}
		}

		if (palindrome) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}