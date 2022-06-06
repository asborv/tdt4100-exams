package food;

import java.util.Collection;

public class ScaledIngredients implements Ingredients {

	private final Ingredients ingredients;
	private double scale;
	

	/**
	 * Create a new scaled ingredients, given by an original `Ingredients`-object and a scale
	 * @param ingredients The ingredients to be scaled
	 * @param scale The scale to use
	 */
	public ScaledIngredients(Ingredients ingredients, double scale) {
		if (ingredients == null) throw new IllegalArgumentException("ingredients must be non-null");
		this.ingredients = ingredients;
		this.scale = scale;
	}

	@Override
	public Iterable<String> ingredientNames() {
		return ingredients.ingredientNames();
	}

	@Override
	public Collection<String> getIngredientNames() {
		return ingredients.getIngredientNames();
	}

	@Override
	public double getIngredientAmount(String ingredient) {
		return scaleIngredients(scale).getIngredientAmount(ingredient);
	}

	@Override
	public boolean containsIngredients(Ingredients other) {
		return scaleIngredients(scale).containsIngredients(other);
	}

	@Override
	public Ingredients missingIngredients(Ingredients other) {
		return scaleIngredients(scale).missingIngredients(other);
	}

	@Override
	public Ingredients scaleIngredients(double scale) {
		IngredientContainer scaledIngredients = new IngredientContainer();

		ingredients.getIngredientNames()
							 .stream()
							 .forEach(ingredient -> scaledIngredients.addIngredient(
								 ingredient,
								 ingredients.getIngredientAmount(ingredient) * scale
							 ));

		return scaledIngredients;
	}

	// Examples of SOME use of ScaledIngredients.
	public static void main(String[] args) {

		// ingredients in a recipe could be..
		IngredientContainer ig = new IngredientContainer();
		ig.addIngredient("egg", 4);
		ig.addIngredient("milk", 5);
		ig.addIngredient("flour", 3);
		ig.addIngredient("salt", 1);

		// Scaling IngredientContainer to double the size.
		ScaledIngredients scaledIngredients = new ScaledIngredients(ig, 2); 

		// Should have 8 eggs:
		System.out.println("Eggs: " + scaledIngredients.getIngredientAmount("egg"));

		// Storage contains...
		IngredientContainer storage = new IngredientContainer();
		storage.addIngredient("egg", 3);
		storage.addIngredient("milk", 3);
		storage.addIngredient("flour", 3);
		storage.addIngredient("salt",3);
		
		// Storage should miss 5.0 egg, 3.0 flour and 7.0 milk.
		System.out.println(scaledIngredients.missingIngredients(storage));

		// Should be [salt, egg, flour, milk] (In some order)
		System.out.println(scaledIngredients.getIngredientNames());
		
		// Add more salt to original container
		ig.addIngredient("salt", 3);
		
		// Should now have 8 salt
		System.out.println("Salt: " + scaledIngredients.getIngredientAmount("salt"));
	}
}
