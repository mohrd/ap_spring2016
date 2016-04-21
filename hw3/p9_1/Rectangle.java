package hw3.p9_1;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
class Rectangle {
	public double width = 1;
	public double height = 1;

	public Rectangle() {}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", height=" + height +
				"}: " +
				"\n\tPerimeter: " + getPerimeter() +
				"\n\tArea: " + getArea();
	}
}
