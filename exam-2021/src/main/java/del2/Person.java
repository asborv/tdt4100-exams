package del2;

public class Person {

	// No other fields should be added to this class
	private Address address;

	
	// You do not need to consider the edge case of passing null into the constructor here
	public Person(Address address) {
		this.address = address;
	}
	
	/**
	 * 
	 * @return the street name of this person
	 */
	public String getStreetName() {
		// TODO 
		return null;
	}

	/**
	 * Updates the street name of this person
	 * 
	 * @param streetName The street name to update
	 */
	public void setStreetName(String streetName) {
		// TODO
	}
	
	
	public int getStreetNumber() {
		// TODO 
		return 0;
	}

	/**
	 * Updates the street number of this person
	 * 
	 * @param streetNumber A positive integer.
	 * 
	 * @throws IllegalArgumentException If number is not larger than 0.
	 */
	public void setStreetNumber(int streetNumber) {
		// TODO
	}

	public static void main(String[] args) {
		Person person = new Person(new Address("Test", 2));
		person.setStreetName("Test2");
		System.out.println(person.getStreetName());
	}
}
