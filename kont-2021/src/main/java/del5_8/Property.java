package del5_8;

public class Property {

	// Add any needed fields here

	/**
	 * 
	 * @param name  the name of the property to be sold
	 * @param price the listing price of the property
	 */
	public Property(String name, int price) {
		// TODO
	}

	/**
	 * 
	 * @return the name of the property
	 */
	public String getName() {
		// TODO
		return null;
	}

	/**
	 * 
	 * @return the price of the property
	 */
	public int getPrice() {
		// TODO
		return 0;
	}

	/**
	 * 
	 * @return whether the property is sold, default value is false
	 */
	public boolean isSold() {
		// TODO
		return false;
	}

	/**
	 * Sets the property as sold
	 * 
	 * @throws IllegalStateException if no bids have been received
	 */
	public void setIsSold() {
		// TODO
	}

	/**
	 * 
	 * @return the number of bids received on this property
	 */
	public int getNumberOfBids() {
		// TODO
		return 0;
	}

	/**
	 * 
	 * @param listener register listener to be notified of any bids to this property
	 */
	public void addListenerForAllBids(BidListener listener) {
		// TODO
	}

	/**
	 * 
	 * @param listener register listener to be notified of only bids that are new
	 *                 highest bids You do not need to handle the case where a
	 *                 listener gets registered both for highest bid and for all
	 *                 bids
	 */
	public void addListenerForHighestBids(BidListener listener) {
		// TODO
	}

	/**
	 * 
	 * @param listener removes listener from this property, registered with any of
	 *                 the above methods
	 */
	public void removeListener(BidListener listener) {
		// TODO
	}

	/**
	 * Creates a new bid object and notifies all listeners that a bid has been given
	 * 
	 * @param bidder the name of the bidder
	 * @param bid    the amount of the bid
	 * 
	 * @throws IllegalStateException - if the property is already sold
	 */
	public void bidReceived(String bidder, int bid) {
		// TODO
	}

	/**
	 * Notifies listeners that a bid has been received. There are currently no
	 * listeners implemented in the main method, but this is used for test purposes
	 * by us after the exam.
	 * 
	 * This is package private for testing purposes
	 * 
	 * @param bid the most recent bid
	 */
	void notifyListeners(Bid bid) {
		// TODO
	}

	/**
	 * 
	 * @return the current highest bid. If the property has no bids, return 0
	 */
	public int getHighestBid() {
		// TODO
		return 0;
	}

	public static void main(String[] args) {
		Property p = new Property("name", 1000);
		p.bidReceived("BIDDER", 500);
		// 500
		System.out.println(p.getHighestBid());
		p.bidReceived("BIDDER2", 1100);
		// 1100
		System.out.println(p.getHighestBid());
		// false
		System.out.println(p.isSold());
		p.setIsSold();
		// true
		System.out.println(p.isSold());

	}
}
