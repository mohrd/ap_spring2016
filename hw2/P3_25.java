package hw2;

import java.util.Scanner;

public class P3_25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1, y1, x2, y2, x3, y3, x4, y4;
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		x4 = scanner.nextDouble();
		y4 = scanner.nextDouble();
		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		// NOTE: DIVISION BY ZERO IEEE 754, INFINITY
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		if (a * d == b * c) {
			System.out.println("The two lines are parallel");
		} else {
			System.out.printf("The intersecting point is at (%.5f, %.5f)", x, y);
		}
	}
}
