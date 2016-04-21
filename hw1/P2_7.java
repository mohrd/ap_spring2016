package hw1;

import java.util.Scanner;

public class P2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long m = scanner.nextLong();
		int y = 365 * 24 * 60;
		int d = 24 * 60;
		System.out.println(m + " minutes is approximately " + (m / y) + " years and " + ((m % y) / d) + " days");
	}
}