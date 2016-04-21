package hw2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created with ♥ by Mohammad-Reza on 01/Apr/2016.
 */
public class P4_23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = scanner.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = scanner.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = scanner.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federal = scanner.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double state = scanner.nextDouble();

		double gross = hours * payRate;
		double federalDeduction = gross * federal;
		double stateDeduction = gross * state;

		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + currencyFormat.format(payRate));
		System.out.println("Gross Pay: " + currencyFormat.format(gross));
		System.out.println("Deductions:");
		System.out.println("\tFederal Withholding (" + federal * 100 + "): " + currencyFormat.format(federalDeduction));
		System.out.println("\tState Withholding (" + state * 100 + "): " + currencyFormat.format(stateDeduction));
		System.out.println("\tTotal Deduction: " + currencyFormat.format(stateDeduction + federalDeduction));
		System.out.println("Net Pay: " + currencyFormat.format(gross - stateDeduction - federalDeduction));
	}
}
