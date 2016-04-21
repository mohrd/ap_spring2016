package hw3;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P6_22 {
	public static final double PRECISION = 0.0001;
	public static double sqrt(long n) {
		double lastGuess = 1, nextGuess = 1;
		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		} while (Math.abs(nextGuess - lastGuess) > PRECISION);
		return nextGuess;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n = scanner.nextLong();
		System.out.println("SQRT is " + sqrt(n));
	}
}
