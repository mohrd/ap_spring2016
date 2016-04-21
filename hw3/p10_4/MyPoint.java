package hw3.p10_4;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
class MyPoint {
	private double x = 0;
	private double y = 0;

	public MyPoint() {}
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}

	public double distance(MyPoint point) {
		return distance(point.getX(), point.getY());
	}
}
