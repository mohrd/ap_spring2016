package hw3;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P6_18 {
	public static boolean hasMinimumLength(int n, String string) {
		return string.length() >= n;
	}

	public static boolean consistsOfOnlyLettersAndDigits(String string) {
		for (char c : string.toCharArray()) {
			if (!Character.isLetterOrDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public static boolean containsAtLeastDigits(int n, String string) {
		int digitsCount = 0;
		for (char c : string.toCharArray()) {
			if (Character.isDigit(c)) {
				digitsCount++;
			}
		}
		return digitsCount >= n;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();
		if (!hasMinimumLength(8, password)) {
			System.out.println("Invalid Password. (min. length)");
		} else if (!consistsOfOnlyLettersAndDigits(password)) {
			System.out.println("Invalid Password. (only digits and letters)");
		} else if (!containsAtLeastDigits(2, password)) {
			System.out.println("Invalid Password. (two digits)");
		} else {
			System.out.println("Valid Password.");
		}
	}
}
