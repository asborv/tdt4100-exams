package food;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import food.def.KitchenObserver;

/**
 * The main point of this implementation of KitchenObserver is to keep track of revenue
 * from all meals sold. Every time a new meal is sold (and mealOrder is called), 
 * information about the meal(s) with the highest revenue is printed to System.out.
 *
 */
public class ObserveToPrintTopRevenue implements KitchenObserver {

	private Map<String, Double> revenues = new HashMap<>();
	
	/**
	 * 
	 * @return A string that contains the string 'meal: price' for all meals that have the highest revenue, 
	 * separated by a newline. If more than one meal they are sorted in alphabetical order.
	 * If no meal has been sold: returns an empty string.
	 */
	public String getTopSellers() {

		StringBuilder sb = new StringBuilder();

		double max = revenues.values()
												 .stream()
												 .max(Comparator.comparing(Double::valueOf))
												 .orElse(0.);
												
		revenues.entrySet()
						.stream()
						.filter(e -> e.getValue() == max)
						.forEach(e -> sb.append(e.getKey() + ": " + e.getValue() + "\n"));

		return sb.toString();
	}
	

	
	/**
	 * When triggered, updates the revenue of 'meal' with 'price'.
	 * Should then print (System.out) the meal(s) with highest revenue (in alphabetical order), see the method 
	 * getTopSellers.
	 */
	@Override
	public void mealOrder(String meal, double price) {
		if (revenues.containsKey(meal)) {
			revenues.compute(meal, (k, v) -> v + price);
		} else {
			revenues.put(meal, price);
		}
		System.out.println(getTopSellers());
	}
	

	// A basic use of the class. No need to use Kitchen to make it work. 
	public static void main(String[] args) {
		ObserveToPrintTopRevenue test = new ObserveToPrintTopRevenue();
		System.out.println("> Only waffles: 50.0");
		test.mealOrder("waffles", 50.0);
		assertEquals("waffles: 50.0", test.getTopSellers().trim());
		System.out.println("> Only waffles: 100.0");
		test.mealOrder("waffles", 50.0);
		System.out.println("> Pancakes and waffles (two lines): 100.0");
		test.mealOrder("pancakes", 100.0);
		System.out.println("> Only waffles: 150.0");
		test.mealOrder("waffles", 50.0);
	}
}
