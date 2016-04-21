package hw3;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P6_8 {
	public static String repeat(char c, int length) {
		return new String(new char[length]).replace('\0', c);
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

	public static void main(String[] args) {
		final int F_LEN = 15;
		final int C_LEN = 10;
		final String splitter = "    |    ";
		String line = repeat('-', 95);

		System.out.println(line);
		System.out.printf("| %-20s %-20s%s%-20s %-20s |\n", "Celsius", "Fahrenheit", splitter, "Fahrenheit", "Celsius");
		System.out.println(line);
		for (double c = 40, f = 120; c >= 31; c--, f -= 10) {
			System.out.printf("| %-20.2f %-20.2f", c, celsiusToFahrenheit(c));
			System.out.print(splitter);
			System.out.printf("%-20.2f %-20.2f |\n", f, fahrenheitToCelsius(f));
		}
		System.out.println(line);
	}
}
