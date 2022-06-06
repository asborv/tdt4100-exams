package food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeReader {

	// regex for column separator
	private final String columnSeparatorRegex = "\\$";
	private final String amountSeparatorRegex = ";";

	/**
	 * Read recipes from an InputStream with the given format:
	 *
	 * name$category$nPortions$ingredient1;ingredient2;...;...$amount1;amount2;...;...
	 * 
	 * As you see from the format, each recipe is a single line, with fields separated by `$` and 
	 * elements in lists separated by `;`.
	 * 
	 * Regarding ingredients and amounts, the two lists are sorted in the same order, so `ingredient1`
	 * should have `amount1`, and so forth. All amounts can be read as doubles, while nPortions is an integer.
	 *
	 * Note that the first line of the stream is the header, and so should not be used.
	 * If a line (i.e. a single recipe) fails to be parsed correctly, that recipe is to be skipped.
	 *
	 * @param input The source to read from
	 * @throws IOException if input (InputStream) throws IOException
	 */
	public List<Recipe> readRecipes(InputStream input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		List<Recipe> recipes = new ArrayList<>();

		reader.lines()
					.skip(1)	// Skip header
					.forEach(line -> {
						String[] fields = line.split(columnSeparatorRegex);
						String[] ingredientNames = fields[3].split(amountSeparatorRegex);
						double[] ingredientAmounts = Arrays.stream(fields[4].split(amountSeparatorRegex))
																							 .mapToDouble(Double::parseDouble)
																							 .toArray();


						String name = fields[0];
						String category = fields[1];
						int nPortions = Integer.parseInt(fields[2]);
						IngredientContainer ingredients = new IngredientContainer();

						for (int i=0; i<ingredientNames.length; i++) {
							ingredients.addIngredient(
								ingredientNames[i],
								ingredientAmounts[i]
							);
						}
						
						Recipe recipe = new Recipe(name, category, nPortions, ingredients);
						recipes.add(recipe);
					});
		
		return recipes;
	}

	public static void main(String[] args) throws IOException {
		// read from sample file
		List<Recipe> recipes = new RecipeReader().readRecipes(RecipeReader.class.getResourceAsStream("sample-recipes.txt"));
		System.out.println(recipes);
	}
}
