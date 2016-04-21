package hw3;

import java.util.Random;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P9_4 {
	public static void main(String[] args) {
		Random random = new Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.println(random.nextInt(100));
		}
	}
}
