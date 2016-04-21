package hw1;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class P2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		gratuity /= 100;
		double calculatedGratuity = subtotal * gratuity;

		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		numberFormat.setRoundingMode(RoundingMode.CEILING);
		numberFormat.setMaximumFractionDigits(1);

		System.out.printf("The gratuity is %d %.6f ", calculatedGratuity);
		System.out.println("The gratuity is " + numberFormat.format(calculatedGratuity)
				+ " and total is " + numberFormat.format(subtotal + calculatedGratuity));
	}
}