package hw3;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P5_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two positive integers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int d = 1;
		for (d = n1 < n2 ? n1 : n2; d > 1 && (n1 % d != 0 || n2 % d != 0); d--);
		System.out.println("GCD is " + d);
	}
}
