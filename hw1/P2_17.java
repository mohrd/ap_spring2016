package hw1;

import java.util.Scanner;

public class P2_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double ta = scanner.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double v = scanner.nextDouble();
		double v0 = Math.pow(v, 0.16);

		double result = 35.74 + 0.6215 * ta - 35.75 * v0 + 0.4275 * ta * v0;
		System.out.printf("The wind chill index is %.5f", result);
	}
}