package hw3.p10_3;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean equals(int n) {
		return value == n;
	}

	public boolean equals(MyInteger integer) {
		return integer.equals(value);
	}

	public boolean isEven() {
		return isEven(value);
	}

	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger integer) {
		return isEven(integer.getValue());
	}

	public static boolean isOdd(MyInteger integer) {
		return isOdd(integer.getValue());
	}

	public static boolean isPrime(MyInteger integer) {
		return isPrime(integer.getValue());
	}

	public static int parseInt(char[] digits) {
		int result = 0;
		for (int i = 0; i < digits.length; i++) {
			result = result * 10 + digits[i] - '0';
		}
		return result;
	}

	public static int parseInt(String number) {
		return parseInt(number.toCharArray());
	}
}
