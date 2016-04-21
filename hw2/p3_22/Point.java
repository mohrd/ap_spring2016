package hw2.p3_22;

/**
 * Created with ♥ by Mohammad-Reza on 31/Mar/2016.
 */

class Point {
	private double x, y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
	}
}
