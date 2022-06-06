package stuff;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class MovieRegister {

	private Collection<Movie> movies = new HashSet<>();
	
	/**
	 * Add movie to register
	 * @param movie
	 */
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
		
	/**
	 * 
	 * @param title
	 * @return the movie with matching title, or null if no such movie exists.
	 */
	Movie findMovie(String title) {
		return filterMovies(movie -> 
			movie.getTitle().equals(title))
			.stream()
			.findAny()
			.orElse(null);
	}
	
	/**
	 * Filter all registered movies based on a Predicate, and return them as a Collection.
	 * @param pred is the filter for which movies to watch
	 * @return A collection of movies testing true to pred.
	 */
	Collection<Movie> filterMovies(Predicate<Movie> pred) {
		return movies.stream()
								 .filter(pred)
								 .toList();
	}
	
	/**
	 * Watch movie 'title'.
	 * @param title
	 * @throws IllegalStateException if the title does not exist.
	 */
	public void watch(String title) {
		Movie movie = findMovie(title);
		if (movie == null) throw new IllegalStateException("Movie does not exist");
		
		movie.watch();
	}
	
	/**
	 * Small example of use of the class. Does NOT necessarily cover all uses of methods specified in assignment. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		MovieRegister cb = new MovieRegister();
		cb.addMovie(new Movie("Das Boot"));
		cb.watch("Das Boot");
		System.out.println("Should be 1: " + cb.findMovie("Das Boot").getTimesWatched());
		
	}

}
