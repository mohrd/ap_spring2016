package hw3;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
public class P5_15 {
	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();
		char c = '!';
		int i = 0;
		while (c <= '~') {
			i++;
			output.append(c + " ");
			if (i == 10) {
				output.append("\n");
				i = 0;
			}
			c++;
		}
		System.out.println(output);
	}
}
