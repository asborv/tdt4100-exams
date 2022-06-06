package food;

import food.def.PriceProvider;

/**
 * A rebate where every thousandth purchase (regardless of meal, price, or customer)
 * is given away for free. Not the first buy!
 */
public class RebateFreeEveryThousandSale implements PriceProvider {

	@Override
	public double providePrice(String meal, double price, Customer customer) {
		return Kitchen.sales % 1000 == 0 && Kitchen.sales != 0
			? 0
			: 1;
	}
}
