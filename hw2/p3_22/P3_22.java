package hw2.p3_22;
import java.util.Scanner;

public class P3_22 {
	public static final double RADIUS = 10;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		Point input = new Point(x, y);
		Point center = new Point(0, 0);
		if (input.distanceTo(center) <= RADIUS) {
			System.out.printf("Point (%.1f, %.1f) is in the circle", input.getX(), input.getY());
		} else {
			System.out.printf("Point (%.1f, %.1f) is not in the circle", input.getX(), input.getY());
		}
	}
}
