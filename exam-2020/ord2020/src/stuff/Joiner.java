package stuff;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Joiner {

	private final String mainSeparator;
	private final String lastSeparator;

	/**
	 * Initialises this Joiner with the provided separators.
	 * @param mainSeparator the separator to use between all but the last two elements
	 * @param lastSeparator the separator to use between the last two elements
	 */
	public Joiner(final String mainSeparator, final String lastSeparator) {
		this.mainSeparator = mainSeparator;
		this.lastSeparator = lastSeparator;
	}
	
	/**
	 * Initialises this Joiner with the provided separator.
	 * @param separator the separator to use between all elements
	 */
	public Joiner(final String separator) {
		this(separator, separator);
	}

	/**
	 * Joins the strings together, where all elements but the two last are separated by mainSeparator, and
	 * the two last are separated by lastSeparator. If lastSeparator is null, mainSeparator is used between all elements.
	 * E.g. if you join the strings "one", "two", "three" with mainSeparator as ", " and lastSeparator as " and ",
	 * you should get "one, to and three".
	 * If strings contains only one element, that element is returned, if it contains no elements, the empty string is returned.
	 * @param strings the strings to join
	 * @param mainSeparator the separator used between all but the two last elements
	 * @param lastSeparator the separator used between the last two elements
	 * @return strings joined with the provided separators
	 */
	public static String join(final Iterator<String> strings, final String mainSeparator, final String lastSeparator) {
		StringBuilder result = new StringBuilder("");
		if (!strings.hasNext()) return result.toString();

		// Safe because of check above, and ensures result doesn't start with separator
		result.append(strings.next());

		while (strings.hasNext()) {
			String string = strings.next();
			String separator = strings.hasNext() ? mainSeparator : lastSeparator;
			result.append(separator + string);
		}

		return result.toString();
	}

	/**
	 * Joins strings with the provided mainSeparator and lastSeparator
	 * @param strings the strings to join
	 * @return the joined strings
	 */
	public String join(final Iterator<String> strings) {
		return join(strings, mainSeparator, lastSeparator);
	}

	/**
	 * Joins strings with the provided mainSeparator and lastSeparator
	 * @param strings the strings to join
	 * @return the joined strings
	 */
	public String join(final Iterable<String> strings) {
		return join(strings.iterator(), mainSeparator, lastSeparator);
	}

	/**
	 * Joins strings with the provided mainSeparator and lastSeparator
	 * @param strings the strings to join
	 * @return the joined strings
	 */
	public String join(final String... strings) {
		return join(Arrays.stream(strings).iterator(), mainSeparator, lastSeparator);
	}

	public static void main(String[] args) {
		Joiner j = new Joiner(", ", " and ");
		Iterator<String> strings = List.of("one", "two", "three", "four").iterator();

		System.out.println(j.join(strings));
		System.out.println(j.join("we", "are", "the", "champions"));
	}
}
