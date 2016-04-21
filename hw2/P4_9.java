package hw2;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 31/Mar/2016.
 */
public class P4_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		int input = scanner.next().charAt(0);
		System.out.printf("The Unicode for the character %c is %d", input, input);
	}
}
