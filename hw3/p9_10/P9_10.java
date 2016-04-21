package hw3.p9_10;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P9_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		double discriminant = equation.getDiscriminant();
		if (discriminant > 0) {
			System.out.printf("The equation has two roots %f and %f", equation.getRoot1(), equation.getRoot2());
		} else if (discriminant == 0) {
			System.out.printf("The equation has one root %f", equation.getRoot1());
		} else {
			System.out.print("The equation has no roots.");
		}
	}
}
