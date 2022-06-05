package food;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * Generic container of ingredients.
 */
public class IngredientContainer implements Ingredients {

	private final Map<String, Double> ingredients = new HashMap<>();

	/**
	 * Initializes a new, empty IngredientContainer.
	 */
	public IngredientContainer() {}

	/**
	 * Initializes a new IngredientContainer.
	 * @param ingredients Initial ingredients in the container
	 */
	public IngredientContainer(Ingredients ingredients) {
		ingredients.getIngredientNames()
							 .stream()
							 .forEach(ingredient -> addIngredient(ingredient, getIngredientAmount(ingredient)));
	}

	/**
	 * Add `amount` of `ingredient` to the container.
	 *
	 * @param ingredient The name of the ingredient to add
	 * @param amount The amount of the ingredient to add
	 * @throws IllegalargumentException if amount is negative
	 */
	public void addIngredient(String ingredient, double amount) {
		if (amount < 0) throw new IllegalArgumentException("Amount cannot be negaitve");

		if (ingredients.get(ingredient) == null) {
			ingredients.put(ingredient, amount);
		} else {
			ingredients.compute(ingredient, (k, v) -> v + amount);
		}
	}

	/**
	 * Remove `amount` of `ingredient` to the container.
	 *
	 * If the resulting amount of the ingredient is 0, its name should be removed
	 *
	 * @param ingredient The name of the ingredient to add
	 * @param amount The amount of the ingredient to remove
	 * @throws IllegalArgumentException if amount cannot be removed from this
	 */
	public void removeIngredient(String ingredient, double amount) {
		if (amount > getIngredientAmount(ingredient) || !ingredients.containsKey(ingredient)) {
			throw new IllegalArgumentException();
		}

		ingredients.compute(ingredient, (k, v) -> v - amount);
		if (ingredients.get(ingredient) == 0.0) ingredients.remove(ingredient);
	}

	/**
	 * @return An Iterable giving the names of all the ingredients
	 */
	@Override
	public Iterable<String> ingredientNames() {
		return ingredients.keySet();
	}

	/**
	 * @return A collection containing the names of all the ingredients
	 */
	@Override
	public Collection<String> getIngredientNames() {
		return ingredients.keySet();
	}

	/**
	 * @param ingredient The ingredient to get the amount of
	 * If the ingredient does not exist, the double 0.0 should be returned.
	 * @return The amount of ingredient
	 */
	@Override
	public double getIngredientAmount(String ingredient) {
		return ingredients.computeIfAbsent(ingredient, x -> 0.0);
	}

	/**
	 * Get a string containing the ingredients with amounts in the format given below:
	 * Mark that it does not matter in which order the ingredients are listed.
	 *
	 * ingredientName1: amount1
	 * ingredientName2: amount2
	 * ingredientName3: amount3
	 * ...
	 *
	 * @return A string on the format given above
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		ingredients.entrySet()
							 .stream()
							 .forEach(e -> sb.append(e.getKey() + ": " + e.getValue() + "\n"));

	return sb.toString();
	}

	/**
	 * Add all ingredients from another Ingredients object into this.
	 *
	 * @param ingredients the ingredients to add
	 */
	public void addIngredients(Ingredients ingredients) {
		ingredients.getIngredientNames()
							 .stream()
							 .forEach(ingredient -> addIngredient(
								 												ingredient,
																				ingredients.getIngredientAmount(ingredient)
																			));
	}

	/**
	 * Remove all ingredients in other from this.
	 *
	 * @param ingredients the ingredients to remove
	 * @throws IllegalArgumentException if this does not contain enough of any of the ingredients (without changing this)
	 */
	public void removeIngredients(Ingredients ingredients) {
		ingredients.getIngredientNames()
							 .stream()
							 .forEach(ingredient -> removeIngredient(
																				ingredient,
																				ingredients.getIngredientAmount(ingredient)
																			));
	}

	/**
	 * Checks if the all the ingredients in other is contained in this
	 * @param other
	 * @return true of there is at least the same or larger amount of ingredients in this than in other, false otherwise
	 */
	@Override
	public boolean containsIngredients(Ingredients other) {
		return other.getIngredientNames()
								.stream()
								.allMatch(ingredient -> getIngredientAmount(ingredient) >=
																	other.getIngredientAmount(ingredient));
	}

	/**
	 * Returns the ingredients that must be added to other for this to be contained in it
	 * @param other
	 * @return a new Ingredients that if added to other would make it contain this
	 */
	@Override
	public Ingredients missingIngredients(Ingredients other) {
		if (other.containsIngredients(this)) return null;

		IngredientContainer missing = new IngredientContainer();
		
		getIngredientNames().stream()
												.forEach(ingredient -> {
													double diff = getIngredientAmount(ingredient) -
																	other.getIngredientAmount(ingredient);
													
													if (diff > 0) missing.addIngredient(ingredient, diff);
												});

    return missing;
	}

	/**
	 * Returns the ingredients that you get if you scale this by factor 'scale'.
	 * I.e. an IngredientContainer with 4 portions scaled by 2 ends up with 8 portions.
	 * See example in main method.
	 * @param scale
	 * @return a new scaled Ingredients
	 */
	@Override
	public Ingredients scaleIngredients(double scale) {
		IngredientContainer scaled = new IngredientContainer();

		getIngredientNames()
			.stream()
			.forEach(ingredient -> scaled.addIngredient(
				ingredient,
				getIngredientAmount(ingredient) * scale
			));
	
		return scaled;
	}
	
	
	/**
	 * Some helpful code to debug your code. Does not cover everything!
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		final IngredientContainer container = new IngredientContainer();
		container.addIngredient("food1", 12.0);
		container.addIngredient("food2", 6.0);
		container.addIngredient("food2", 2.5);

		// food2 should now be 8.5, with a small delta added for double rounding.
		assertEquals(8.5, container.getIngredientAmount("food2"), 0.0001);
		System.out.println(container);

		// Double the ingredients:
		Ingredients twice = container.scaleIngredients(2);
		assertEquals(17.0, twice.getIngredientAmount("food2"), 0.0001);
		
		// Remove food from the first container:
		container.removeIngredient("food1", 10);
		System.out.println(container);
		assertEquals(2.0, container.getIngredientAmount("food1"), 0.0001);
	}
}
