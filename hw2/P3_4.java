package hw2;

import java.util.Random;

/**
 * Created with ♥ by Mohammad-Reza on 31/Mar/2016.
 */
public class P3_4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int month = rand.nextInt(12) + 1;
		String out = "";
		switch (month) {
			case 1:
				out = "January";
				break;
			case 2:
				out = "February";
				break;
			case 3:
				out = "March";
				break;
			case 4:
				out = "April";
				break;
			case 5:
				out = "May";
				break;
			case 6:
				out = "June";
				break;
			case 7:
				out = "July";
				break;
			case 8:
				out = "August";
				break;
			case 9:
				out = "September";
				break;
			case 10:
				out = "October";
				break;
			case 11:
				out = "November";
				break;
			case 12:
				out = "December";
		}
		System.out.printf("Month %d is %s", month, out);
	}
}
