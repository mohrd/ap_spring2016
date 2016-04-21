package hw2;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 01/Apr/2016.
 */
public class P4_24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String first = scanner.nextLine();
		System.out.print("Enter the second city: ");
		String second = scanner.nextLine();
		System.out.print("Enter the third city: ");
		String third = scanner.nextLine();

		/*
		 if (x > y) swap(x, y);
		 if (y > z) swap(y, z)
		 if (x > y) swap(x, y);
		*/
		String temp;
		if (first.compareToIgnoreCase(second) > 0) {
			temp = first;
			first = second;
			second = temp;
		}
		if (second.compareToIgnoreCase(third) > 0) {
			temp = second;
			second = third;
			third = temp;
		}
		if (first.compareToIgnoreCase(second) > 0) {
			temp = first;
			first = second;
			second = temp;
		}

		System.out.printf("The three cities in alphabetical order are %s %s %s", first, second, third);
	}
}
