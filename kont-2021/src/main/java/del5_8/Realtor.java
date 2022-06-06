package del5_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Realtor implements Iterable<Property> {

	private String name;
	private double commission;
	private Collection<Property> properties = new ArrayList<>();
	
	/**
	 * Creates a Realtor object
	 * 
	 * @param name       the name of the realtor
	 * @param commission the commission the realtor takes for a sale
	 */
	public Realtor(String name, double commission) {
		if (name == null || name.isBlank()) throw new IllegalArgumentException("Name must be non-empty string");
		
		this.name = name;
		this.commission = commission;
	}

	/**
	 * 
	 * @return the name of the realtor
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param commission the new commission of the realtor
	 * 
	 * @throws IllegalArgumentException if the commission not between (excluding) 0
	 *                                  and (including) 100.
	 */
	public void setCommission(double commission) {
		if (commission <= 0 || commission > 100) throw new IllegalArgumentException("Commission must be in range (0, 100]");
	
		this.commission = commission;
	}

	/**
	 * Adds a property to the realtor's sale collection
	 * 
	 * @param property a property
	 */
	public void addProperty(Property property) {
		properties.add(property);
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
		int bidSum = properties.stream()
												 	 .map(Property::getHighestBid)
													 .reduce(0, Integer::sum);

		return bidSum * commission / 100;
	}

	@Override
	public Iterator<Property> iterator() {
		return properties.iterator();
	}

	/**
	 * 
	 * @return an iterator to be able to iterate through all the properties of this
	 *         realtor
	 */
	public Iterator<Property> iterable() {
		return properties.iterator();	
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
