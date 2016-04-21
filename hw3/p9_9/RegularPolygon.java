package hw3.p9_9;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public RegularPolygon() {}

	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}

	public double getPerimeter() {
		return n * side;
	}

	public double getArea() {
		return n * side * side * 0.25 * (1 / Math.tan(Math.PI / n));
	}

	@Override
	public String toString() {
		return "RegularPolygon{" +
				"n=" + n +
				", side=" + side +
				", x=" + x +
				", y=" + y +
				"}: " +
				"\n\tPerimeter: " + getPerimeter() +
				"\n\tArea: " + getArea();
	}
}
