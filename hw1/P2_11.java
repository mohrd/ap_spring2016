package hw1;

import java.util.Scanner;

public class P2_11 {
	public static void main(String[] args) {
		final long CURRENT_POPULATION = 312032486L;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = scanner.nextInt();
		long seconds = years * 365 * 24 * 60 * 60;
		long estimatedPopulation = CURRENT_POPULATION;
		estimatedPopulation += seconds / 7 + seconds / 45;
		estimatedPopulation -= seconds / 13;
		System.out.printf("The population in %d years is %d\n", years, estimatedPopulation);
	}
}