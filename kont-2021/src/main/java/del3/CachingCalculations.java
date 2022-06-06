package del3;

public class CachingCalculations implements Calculations {

	public CachingCalculations(Calculations delegate) {
		// TODO
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
		// TODO
		return 0;
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
		// TODO
		return 0;

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
