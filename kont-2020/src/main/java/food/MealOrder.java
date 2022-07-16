package food;

/**
 * A wrapper class for keeping track of a bought meal.
 *
 * The class needs to store the name of meal, as well as the price
 * it was sold for. And a way of providing these to external users.
 * 
 */
public class MealOrder {
	
	private String name;
	private double price;

	MealOrder(String name, double price) {
		if (name == null || name.isBlank()) throw new IllegalArgumentException("Name must be non-empty string");
		if (price < 0) throw new IllegalArgumentException("Price must be positive");

		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
