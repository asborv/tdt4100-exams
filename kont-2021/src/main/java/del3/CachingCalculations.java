package del3;

import java.util.HashMap;
import java.util.Map;

public class CachingCalculations implements Calculations {

	private Calculations delegate;
	private Map<Integer, Integer> memos1 = new HashMap<>();
	private Map<Integer, Integer> memos2 = new HashMap<>();

	public CachingCalculations(Calculations delegate) {
		this.delegate = delegate;
	}

	@Override
	/**
	 * Delegates the job of calculating the square root to the delegate If the
	 * argument has been previously seen, the delegate should not be used and a
	 * local cached version of the result should be returned
	 * 
	 * @returns the calculation applied to the argument
	 */
	public int getCalculation1(int number) {
		return memos1.computeIfAbsent(number, n -> delegate.getCalculation1(n));
	}

	@Override
	/**
	 * Delegates the job of calculating the square to the delegate If the argument
	 * has been previously seen, the delegate should not be used and a local cached
	 * version of the result should be returned
	 * 
	 * @returns the calculation applied to the argument
	 */
	public int getCalculation2(int number) {
		return memos2.computeIfAbsent(number, n -> delegate.getCalculation2(n));

	}

	public static void main(String[] args) {
		CachingCalculations calc = new CachingCalculations(new CalculationsImpl());
		// Should print 81
		System.out.println(calc.getCalculation2(9));
		// Should print 81 again, should not use the delegate
		System.out.println(calc.getCalculation2(9));
		// Should print 3
		System.out.println(calc.getCalculation1(9));
	}

}
