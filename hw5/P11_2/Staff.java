package hw5.P11_2;

/**
 * Created with ♥ by Mohammad-Reza on 13/May/2016.
 */
public class Staff extends Employee {
	protected String title;

	@Override
	public String toString() {
		return "Staff: " + this.name;
	}
}
