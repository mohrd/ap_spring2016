package hw2;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 31/Mar/2016.
 */
public class P3_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int input = scanner.nextInt();
		int digit = 0, sum = 0, isbn = input;
		for (int i = 9; i > 0; i--) {
			digit = input % 10;
			sum += digit * i;
			input /= 10;
		}
		int checksum = sum % 11;
		System.out.printf("The ISBN-10 number is %09d%c", isbn, (checksum == 10 ? 'X' : '0' + checksum));
	}
}
