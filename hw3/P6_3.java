package hw3;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P6_3 {
	public static int reverse(int number) {
		int result = 0;
		int length = (int) Math.log10(number);
		int ten = (int) Math.pow(10, length);
		while (number > 0) {
			result += number % 10 * ten;
			number /= 10;
			ten /= 10;
		}
		return result;
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if (isPalindrome(number)) {
			System.out.println("is Palindrome");
		} else {
			System.out.println("is NOT Palindrome");
		}
	}
}
