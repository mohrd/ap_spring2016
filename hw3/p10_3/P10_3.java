package hw3.p10_3;

/**
 * By 9411355, 9412430559, 9412430548
 */
public class P10_3 {
	public static void main(String[] args) {
		MyInteger x = new MyInteger(10);
		MyInteger y = new MyInteger(13);
		String s = "1234";
		char[] a = {'2', '3'};
		System.out.println("x: " + x.getValue()); // 10
		System.out.println("x.isEven: " + x.isEven()); // true
		System.out.println("x.isOdd: " + x.isOdd()); // false
		System.out.println(MyInteger.parseInt(s)); // 1234
		System.out.println(MyInteger.parseInt(a)); // 23
		System.out.println(MyInteger.isPrime(17)); // true
		System.out.println(x.equals(y)); // false
		System.out.println(x.equals(10)); // true
		System.out.println(MyInteger.isEven(x)); // true
	}
}
