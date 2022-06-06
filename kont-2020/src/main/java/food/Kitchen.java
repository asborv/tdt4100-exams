package food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import food.def.IKitchen;
import food.def.KitchenObserver;
import food.def.PriceProvider;

// Important: There is no similarity between Kitchen in the exam v2020 and this one.
public class Kitchen implements IKitchen {

	private Set<Customer> customers = new HashSet<>();
	private Collection<String> recipes = new ArrayList<>();
	private Collection<MealOrder> orders = new ArrayList<>();
	private Collection<PriceProvider> providers = new ArrayList<>();
	public static int sales = 0;
	
	public Kitchen() {
		super();
	}
	
	
	/**
	 * Add a customer
	 * @param customer The customer to add
	 * 
	 * @throws IllegalArgumentException if the customer is already registered
	 */
	@Override
	public void addCustomer(Customer customer) {
		if (customers.contains(customer)) throw new IllegalArgumentException("Customer already registered");
		customers.add(customer);
	}

	/**
	 * Add a recipe
	 * @param recipe The recipe to add
	 */
	@Override
	public void addRecipe(String recipe) {
		recipes.add(recipe);
	}
	
	/**
	 * @return The turnover of this kitchen - price of all sold meals added together
	 * If the restaurant has sold for 50, 75 and 100, the turnover is 225.
	 * (Norsk: omsetning)
	 */
	@Override
	public double getTurnover() {
		return orders.stream()
								 .mapToDouble(MealOrder::getPrice)
								 .sum();
	}

	
	/**
	 * @return A collection of this kitchen's recipes
	 */
	@Override
	public Collection<String> getRecipes() {
		return new ArrayList<>(recipes);
	}
	
	/**
	 * @param name The name of the customer to get
	 * 
	 * @return The customer with the given name, or null if no such customer is registered
	 */
	public Customer getCustomer(String name) {
		return customers.stream()
										.filter(customer -> customer.getName().equals(name))
										.findFirst()
										.orElse(null);
	}

	/**
	 * Make a meal, with a given (standard)price and to a given customer.
	 * 
	 * This method needs to check that the kitchen knows the given recipe
	 * and has the given customer registered.
	 * (Task 2.3): rebates need to be considered
	 * Finally, data about the sale must be registered in all appropriate places.
	 * 
	 * @param meal The name of the meal to make
	 * @param price The standard price of the meal
	 * @param customerName The name of the customer that buys the meal
	 * 
	 * @throws IllegalStateException if a meal is not successfully made (somehow)
	 */
	@Override
	public void provideMeal(String meal, double price, String customerName) {
		Customer customer = getCustomer(customerName);
		if (customer == null || !recipes.contains(meal)) {
			throw new IllegalStateException("Meal could not be made");
		}

		double scale = computeActualPrice(meal, price, getCustomer(customerName));
		customer.buyMeal(meal, price * scale);
		orders.add(customer.getLastOrderedMeal());
		sales++;
	}
		
	/**
	 * Exercise 2.3 - Delegation
	 * Calculate the total rebate of the given meal, using the priceDelegates of this Kitchen
	 * If more than one rebate exist, each of them applies. See README for example.
	 * 
	 * @param meal The name of the meal
	 * @param price The standard price of the meal
	 * @param customer The customer buying the meal
	 * @return The resulting price after all rebates have been considered.
	 */
	double computeActualPrice(String meal, double price, Customer customer) {
		double scale = providers.stream()
														.map(pp -> pp.providePrice(meal, price, customer))
														.reduce(1.0, (prev, curr) -> prev * curr);

		return scale;
	}
	
	// Exercise 2.3 - Delegation - these may not be all methods you need to create!
	@Override
	public void addPriceProvider(PriceProvider pp) {
		providers.add(pp);
	}

	// Exercise 2.4 - Observerer - these may not be all methods you need to create!
	@Override
	public void addObserver(KitchenObserver ko) {
	}

	
	public static void main(String[] args) {
		Kitchen k = new Kitchen();
		PriceProvider pp1 = (meal, price, customer) -> .5;
		PriceProvider pp2 = (meal, price, customer) -> .2;
		k.addPriceProvider(pp1);
		k.addPriceProvider(pp2);
		k.addRecipe("pancakes");
		k.addRecipe("waffles");
		k.addRecipe("taco");
		k.addRecipe("spam");
		Customer per = new Customer("per");
		k.addCustomer(per);
		// k.addCustomer(per); // IllegalArgumentException
		k.addCustomer(new Customer("ida"));
		k.provideMeal("pancakes", 99.50, "per");
		System.out.println(k.getTurnover());
		k.provideMeal("pancakes", 50, "ida");
		System.out.println(k.getTurnover());
	}
}
