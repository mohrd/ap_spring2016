package hw3;

import java.util.Date;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P9_3 {
	public static void main(String[] args) {
		Date date = new Date();
		long elapsedTime = 10000;
		for (int i = 0; i < 8; i++) {
			date.setTime(elapsedTime);
			System.out.println(date);
			elapsedTime *= 10;
		}
	}
}
