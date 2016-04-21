package hw3;

import java.util.Scanner;

/**
 * Created by Majeed Askari, Mahdi Khazayi Nezhad, Mohammad Javad Moshiri.
 */
public class P5_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("Enter the number of lines: ");
		a = scan.nextInt();
		scan.close();
		for (int b = 1; b <= a; b++) { // moving on row numbers
			for (int i = b; i < a; i++) {
				System.out.print("\t"); // printing sufficient space
			}
			for (int i = b; i > 0; i--) { // printing numbers from n to 1
				System.out.print(i + "\t");
			}
			for (int i = 2; i < b + 1; i++) { // printing numbers from 1 to n
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}
