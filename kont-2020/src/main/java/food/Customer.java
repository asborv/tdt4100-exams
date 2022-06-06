package food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import food.def.ICustomer;

public class Customer implements ICustomer {

	private String name;
	private List<MealOrder> orders = new ArrayList<>();
	
	/**
	 * Create a new customer
	 * 
	 * @param name The name of the customer
	 */
	public Customer(String name) {
		if (name == null || name.isBlank()) throw new IllegalArgumentException("Name must be non-empty string");
		this.name = name;
	}
	
	
	/**
	 * 
	 * @return A list containing all meals bought by this customer
	 */
	public Collection<MealOrder> getMealsOrdered() {
		return new ArrayList<>(orders);
	}

	/**
	 * Add a bought meal to this customer
	 * 
	 * @param meal The name of the meal
	 * @param price The price the customer paid for the meal
	 */
	@Override
	public void buyMeal(String meal, double price) {
		MealOrder order = new MealOrder(meal, price);
		orders.add(order);
	}
	
	/**
	 * @return The number of meals ordered by this customer
	 */
	@Override
	public int getNumberOfOrderedMeals() {
		return orders.size();
	}
	
	/**
	 * @return The name of this customer
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @return A String on the form "<name>: <number of meals ordered>"
	 */
	@Override
	public String toString() {
		return String.format("%s: %d", name, getNumberOfOrderedMeals());
	}

	/**
	 * @return The most recent meal bought by this customer
	 * If no meal is ordered, return null.
	 */
	@Override
	public MealOrder getLastOrderedMeal() {
		return getNumberOfOrderedMeals() == 0
			? null
			: orders.get(getNumberOfOrderedMeals() - 1);
	}
	
	/**
	 * Get the number of times the customer has eaten the given meal
	 * 
	 * @param meal The name of the meal
	 * 
	 * @return The number of times this customer has eaten the given meal
	 */
	@Override
	public int timesEaten(String meal) {
		// Assume safe cast of obvious reasons
		return (int) orders.stream()
								 			 .filter(order -> order.getName().equals(meal))
								 			 .count();
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer("Frank");
		customer.buyMeal("pancakes", 100);
		customer.buyMeal("pancakes", 75);
		System.out.println("Skal være 2 kjøp: " + customer.getMealsOrdered().size());
		System.out.println("Skal være pris 75: " + customer.getLastOrderedMeal().getPrice()); // Som definert i README.
	}
}
