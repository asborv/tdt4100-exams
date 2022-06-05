package stuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianComputer {

	public static double compute(List<Double> nums) {

		if (nums.size() == 0) throw new IllegalArgumentException();

		nums = new ArrayList<>(nums);
		Collections.sort(nums);
		int len = nums.size();
		
		if (len % 2 == 1) {
			return nums.get((len - 1) / 2);
		} else {
			int i = len / 2;
			double lower = nums.get(i - 1);
			double upper = nums.get(i);

			return ( lower + upper ) / 2;
		}
	}

	public static void main(String[] args) {

	}
}
