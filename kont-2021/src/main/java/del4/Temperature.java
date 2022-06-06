package del4;

public class Temperature {

	// Add any needed fields
	/**
	 * 
	 * @param degrees an arbitrary number
	 * @param scale   a character declaring the scale
	 * 
	 * @throws IllegalArgumentException if scale is not 'C' or 'F'
	 */
	public Temperature(double degrees, char scale) {
		// TODO

	}

	/**
	 * 
	 * @return The current scale
	 */
	public char getScale() {
		// TODO
		return '0';
	}

	/**
	 * 
	 * @return the current degree of this object
	 */
	public double getDegrees() {
		// TODO
		return 0;
	}

	/**
	 * Converts this temperature object to be the opposite scale of what it
	 * currently is
	 * 
	 * @return this temperature object, converted with value in Celsius if the scale
	 *         of this temperature object is Fahrenheit, and value in Fahrenheit if
	 *         this the scale of this temperature object is Celsius
	 */
	public Temperature toOther() {
		// TODO
		return null;
	}

	/**
	 * Creates a new temperature object with values in the other scale of this
	 * temperature object
	 * 
	 * @return a new Temperature object, with value in Celsius if the scale of this
	 *         temperature object is Fahrenheit, and value in Fahrenheit if the
	 *         scale of this temperature object is Celsius
	 */
	public Temperature inOther() {
		// TODO
		return null;
	}

	/**
	 * Lowers the temperature
	 * 
	 * @param amount the amount to lower by
	 */
	public void lower(double amount) {
		// TODO
	}

	/**
	 * 
	 * @param celsius
	 * @return the temperature in Fahrenheit
	 */
	public static double convertCelsisusToFahrenheit(double celsius) {
		return (celsius * 1.8 + 32.0);
	}

	/**
	 * 
	 * @param fahrenheit
	 * @return the temperature in Celsius
	 */
	public static double convertFahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32.0) / 1.8;
	}

	public static void main(String[] args) {
		Temperature t = new Temperature(20, 'C');
		// Should print 20
		System.out.println(t.getDegrees());
		t.lower(10);
		// Should now print 10
		System.out.println(t.getDegrees());
		t.toOther();
		// Should now print 50
		System.out.println(t.getDegrees());
		t.toOther();

		Temperature t2 = t.inOther();
		// Should be 50;
		System.out.println(t2.getDegrees());

		// Should be 10
		System.out.println(t.getDegrees());
	}

}
