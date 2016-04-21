package hw3;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P5_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int input = 0;
		int positiveNum = 0;
		int negativeNum = 0;
		float sum = 0;
		int count = 0;
		while (true) {
			input = scanner.nextInt();
			if (input > 0)
				positiveNum++;
			else if (input < 0)
				negativeNum++;
			else
				break;

			count++;
			sum += input;
		}
		System.out.println("The number of positives is " + positiveNum);
		System.out.println("The number of negatives is " + negativeNum);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + (sum / count));
	}
}
