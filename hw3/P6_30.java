package hw3;

import java.util.Random;

/**
 * Created by Zahra Zolfaghari.
 */
public class P6_30 {
	public static Random random = new Random();
	public static int roll() {
		return random.nextInt(6) + 1;
	}

	public static void main(String[] args) {
		int dice1, dice2, sum, point;

		dice1 = roll();
		dice2 = roll();
		sum = dice1 + dice2;
		if (sum == 7 || sum == 11) {
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum + "\nYou win.");
		} else if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum + "\nYou lose.");
		} else {
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum + "\npoint is " + sum);
			point = sum;

			while (true) {
				dice1 = roll();
				dice2 = roll();
				sum = dice1 + dice2;
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
				if (sum == point) {
					System.out.println("You win.");
					break;
				} else if (sum == 7) {
					System.out.println("You lose.");
					break;
				}
			}
		}

	}
}