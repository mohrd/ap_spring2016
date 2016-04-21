package hw3;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P6_26 {
	public static int reverse(int number) {
		int result = 0;
		int length = (int) Math.log10(number);
		int ten = (int) Math.pow(10, length);
		while (number > 0) {
			result += number % 10 * ten;
			number /= 10;
			ten /= 10;
		}
		return result;
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int c = 0, n = 2, t = 0;
		while (c < 100) {
			if (isPrime(n) && isPalindrome(n)) {
				System.out.print(n + " ");
				c++;
				t++;
				if (t == 10) {
					System.out.println();
					t = 0;
				}
			}
			n++;
		}
	}
}
