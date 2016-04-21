package hw2;

/**
 * Created by Kimia Hemmati Rad, Rozhan Omidvar.
 */
public class P4_6 {
	static double radius = (double) (40);

	public static void printPoint(double ax, double ay, String s) {
		double x = ax, y = ay;
		System.out.println("point #" + s + " : ");
		System.out.println("	x : " + x);
		System.out.println("	y : " + y);
	}

	public static void main(String[] args) {
		double a1 = Math.random() * 2 * Math.PI;
		double a2 = Math.random() * 2 * Math.PI;
		double a3 = Math.random() * 2 * Math.PI;
		double a1x = radius * Math.cos(a1), a1y = radius * Math.sin(a1);
		double a2x = radius * Math.cos(a2), a2y = radius * Math.sin(a2);
		double a3x = radius * Math.cos(a3), a3y = radius * Math.sin(a3);
		printPoint(a1x, a1y, "1");
		printPoint(a2x, a2y, "2");
		printPoint(a3x, a3y, "3");
		double a = Math.pow(Math.pow((a2x - a3x), 2) + Math.pow((a2y - a3y), 2), 0.5);
		double b = Math.pow(Math.pow((a1x - a3x), 2) + Math.pow((a1y - a3y), 2), 0.5);
		double c = Math.pow(Math.pow((a2x - a1x), 2) + Math.pow((a2y - a1y), 2), 0.5);
		double angleA = Math.acos((+a * a - b * b - c * c) / (-2 * b * c));
		double angleB = Math.acos((-a * a + b * b - c * c) / (-2 * a * c));
		double angleC = Math.acos((-a * a - b * b + c * c) / (-2 * b * a));
		angleA = Math.toDegrees(angleA);
		angleB = Math.toDegrees(angleB);
		angleC = Math.toDegrees(angleC);
		System.out.println("And the angles in a triangle formed by these three points are: ");
		System.out.println(angleA + "\n" + angleB + "\n" + angleC);
	}
}