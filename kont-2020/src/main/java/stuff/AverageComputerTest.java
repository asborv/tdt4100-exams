package stuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AverageComputerTest {

  private final static double delta = 0.0001;

  @Test
  public void testComputeAverage() {
    final AverageComputer ac = new AverageComputer(Arrays.asList(3, 4, 5));
    Assert.assertEquals(4.0, ac.computeAverage(), 0.0000001);
  }

  @Test
  public void testDoubles() {
    final AverageComputer ac = new AverageComputer(Arrays.asList(3, 3, 5));
    Assert.assertEquals(3.666, ac.computeAverage(), delta);
  }

  @Test
  public void testArrayListReference() {
    Collection<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    final AverageComputer ac = new AverageComputer(nums);

    nums.add(6);
    Assert.assertEquals(2, ac.computeAverage(), delta);
  }

  public static void main(String[] args) {
    AverageComputerTest act = new AverageComputerTest();

    act.testComputeAverage();
    
    // Fails because missing double cast
    act.testDoubles();

    // Fails because ref. is retained
    act.testArrayListReference();
  }
}
