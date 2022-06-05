package stuff;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;


public class MedianComputerTest {

	// use as third argument to Assert.assertEquals(double, double, double) method for handling round-off errors
	// e.q. Assert.assertEquals(6.0, MedianComputer.compute(...), roundErrorDelta);
	double delta = 0.00000001;

	@Test(expected = IllegalArgumentException.class)
	public void testEmpty() {
		MedianComputer.compute(new ArrayList<Double>());
	}

	@Test
	public void testComputeOdd() {
		List<Double> l = List.of(3., 2., 1.);
		Assert.assertEquals(2, MedianComputer.compute(l), delta);
	}

	@Test
	public void testComputeEven() {
		List<Double> l = List.of(4., 3.);
		Assert.assertEquals(3.5, MedianComputer.compute(l), delta);
	}
	
	@Test
	public void testMutable() {
		List<Double> before = List.of(2., 3., 1.);
		List<Double> l = new ArrayList<>(before);
		MedianComputer.compute(l);
		
		// Order should stay unchanged
		assertEquals(before, l);

	}
}
