package del10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestableClassTest {

	@Test
	public void testIsMyStringEqualsToYieldsWrongResult() {
		TestableClass tc = new TestableClass(0, "hello");
		assertTrue(() -> tc.isMyStringEqualTo("HELLO".toLowerCase()));
	}

	@Test
	public void testIncrementIntegerHandlesEdgeCases() {
		TestableClass tc = new TestableClass((Integer.MAX_VALUE), "");
		Long maxPlusOne = Long.valueOf(Integer.MAX_VALUE) + 1;
		assertEquals(maxPlusOne, tc.getMyIntegerIncrement());
	}
}
