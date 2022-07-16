package stuff;

import static org.junit.Assert.assertEquals;

public class Movie {

	private String title;
	private int timesWatched;
	private Integer rating;

	Movie(String title, int rating) {
		this(title);
		setRating(rating);
	}

	Movie(String title) {
		if (title == null || title.isBlank()) throw new IllegalArgumentException("Title must be non-empty string");
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public int getTimesWatched() {
		return timesWatched;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(int rating) {
		if (rating < 1 || rating > 6) throw new IllegalArgumentException("Rating must be in range [1, 6");
		this.rating = rating;
	}

	public void watch() {
		timesWatched++;
	}

	public static void main(String[] args) {

		Movie db = new Movie("Das Boot");
		assertEquals(0, db.getTimesWatched());
		assertEquals("Das Boot", db.getTitle());
		
		db.watch();
		assertEquals(1, db.getTimesWatched());
		
		assertEquals(null, db.getRating());
		db.setRating(4);
		assertEquals(4, (int)db.getRating());
	}
}
