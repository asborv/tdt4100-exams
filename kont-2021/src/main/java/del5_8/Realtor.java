package del5_8;

import java.util.Iterator;

public class Realtor implements Iterable<Property> {

	/**
	 * Creates a Realtor object
	 * 
	 * @param name       the name of the realtor
	 * @param commission the commission the realtor takes for a sale
	 */
	public Realtor(String name, double commission) {
		// TODO
	}

	/**
	 * 
	 * @return the name of the realtor
	 */
	public String getName() {
		// TODO
		return null;
	}

	/**
	 * 
	 * @param commission the new commission of the realtor
	 * 
	 * @throws IllegalArgumentException if the commission not between (excluding) 0
	 *                                  and (including) 100.
	 */
	public void setCommission(double commission) {
		// TODO
	}

	/**
	 * Adds a property to the realtor's sale collection
	 * 
	 * @param property a property
	 */
	public void addProperty(Property property) {
		// TODO
	}

	/**
	 * The total commission is calculated as the sum of the highest bid of each sold
	 * property times the commission rate. The commission rate is calculated based
	 * on the realtor's current commission rate and does not need to consider
	 * historical commission rates
	 * 
	 * A realtor with commission of 10 %, and two sold properties sold at 1000 each,
	 * would have a total commission value of 200
	 * 
	 * @return the calculated commission of the realtor
	 */
	public double calculateTotalCommission() {
		// TODO
		return 0;
	}

	@Override
	public Iterator<Property> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @return an iterator to be able to iterate through all the properties of this
	 *         realtor
	 */
	public Iterator<Property> iterable() {
		return null;
	}

	public static void main(String[] args) {
		Realtor realtor = new Realtor("test", 10);
		// The following will only work if BusinessProperty and Property has the correct
		// implementation
		Property p = new Property("name", 1500);
		p.bidReceived("BIDDER", 2000);
		p.setIsSold();
		realtor.addProperty(p);
		// Should be 200
		System.out.println(realtor.calculateTotalCommission());
	}

}
