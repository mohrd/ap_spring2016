package hw3.p9_10;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	public double getRoot1() {
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	public double getRoot2() {
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}
}
