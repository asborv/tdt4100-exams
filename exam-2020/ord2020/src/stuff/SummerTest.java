package stuff;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SummerTest {

	@Test
	public void testSum1() {
		Assert.assertEquals(6, Summer.sum(List.of(1, 2, 3)));
	}

	@Test
	public void testSumMistake() {
		// Doesn't check for empty list. Uncaught exception
		List<Integer> emptyList = new ArrayList<>();
		Assert.assertEquals(0, Summer.sum(emptyList));
	}

	@Test
	public void testSumMistakeIterator() {
		// Doesn't check for empty list. Uncaught exception
		Iterable<Integer> emptyList = new ArrayList<>();
		Assert.assertEquals(0, (new Summer()).sum(emptyList));
	}

	@Test
	public void testDifference1() {
		Assert.assertEquals(0, Summer.difference(List.of(6, 1, 2, 3)));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDifferenceMistake() {
		int diff = Summer.difference(new ArrayList<Integer>());
	}
}
