package hw2;

import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 31/Mar/2016.
 */
public class P3_17 {
	public static String decode(int number) {
		return (number == 2) ? "paper" : (number == 1) ? "rock" : "scissor";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, random;
		System.out.print("scissor (0), rock (1), paper (2): ");
		input = scanner.nextInt();
		random = (int) (Math.random() * 3);
		if (random == input) {
			System.out.printf("The computer is %s. You are %s too. It is a draw\n", decode(random), decode(input));
		} else {
			System.out.printf("The computer is %s. You are %s.", decode(random), decode(input));
			switch (input - random) {
				case -2:
				case 1:
					System.out.println(" You won");
					break;
				case 2:
				case -1:
					System.out.println(" You lost");
			}
		}
	}
}
