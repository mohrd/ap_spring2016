package hw2;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 31/Mar/2016.
 */
public class P3_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, random;
		System.out.println("0: Heads OR 1: Tails?");
		input = scanner.nextInt();
		random = (int) (Math.random() * 2);
		if (random == input) {
			System.out.println("CORRECT :))");
		} else {
			System.out.println("INCORRECT :(");
		}
	}
}
