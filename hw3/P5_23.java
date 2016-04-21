package hw3;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P5_23 {
	public static final int N = 50000;
	public static void main(String[] args) {
		double fromRight = 0;
		double fromLeft = 0;
		for (int i = 1; i <= N; i++) {
			fromLeft += 1.0 / i;
			fromRight += 1.0 / (N + 1 - i);
		}
		System.out.println("From Left to Right: " + fromLeft);
		System.out.println("From Right to Left: " + fromRight);
	}
}
