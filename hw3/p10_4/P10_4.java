package hw3.p10_4;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P10_4 {
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		System.out.println("Distance: " + point1.distance(point2));
	}
}
