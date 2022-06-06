package del4;

public class DelegatingTemperature {

	// Add any needed fields
	/**
	 * 
	 * @param delegate - the Temperature to get degree from
	 * @param scale    a character declaring the scale of this temperature object
	 * 
	 * @throws IllegalArgumentException if scale is not 'C' or 'F'
	 */
	public DelegatingTemperature(Temperature delegate, char scale) {
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
	 * @return the current degree from the delegate, converted to the correct scale
	 */
	public double getDegrees() {
		// TODO
		return 0;
	}

	/**
	 * 
	 * @return this temperature object, with scale converted to Celsius if the
	 *         current scale of this delegatingTemperature object is in Fahrenheit,
	 *         and value in Fahrenheit if this delegatingTemperature object is in
	 *         Celsius
	 */
	public DelegatingTemperature toOther() {
		// TODO
		return null;
	}

	/**
	 * 
	 * @return a new DelegatingTemperature object, with the same delegate, with
	 *         scale converted to Celsius if the current scale of this
	 *         delegatingTemperature object is Fahrenheit, and value in Fahrenheit
	 *         if this delegatingTemperature object is Celsius
	 */
	public DelegatingTemperature inOther() {
		// TODO
		return null;

	}

	public static void main(String[] args) {
		Temperature t = new Temperature(10, 'C');
		DelegatingTemperature dt = new DelegatingTemperature(t, 'F');
		// Should now print 10
		System.out.println(t.getDegrees());
		// Should now print 50
		System.out.println(dt.getDegrees());
		dt.toOther();
		// Should now print 10
		System.out.println(dt.getDegrees());
		// Should now print 10
		System.out.println(t.getDegrees());
	}
}
