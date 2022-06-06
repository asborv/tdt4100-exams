# Information

The parts of this task are based on each other, but can be solved independently, even if the main methods will not necessarily give the right result. It will often require you to understand what the methods should do, but you can assume that the implementation is correct even if you have not been able to achieve a method. 


# Part 5 – Observer-Observed. 

Start from the [Property](Property.java) class. 
**Property** is a class that implements a property that can receive bids and get bought. 

Stakeholders in the property are interested in being able to listen to new bids [Bid.java) on the property. 

Fill in the necessary methods and fields to support listening in the [Property.java) class, to enable and listen to new bids for the property. The following methods should be implemented: 

- *setIsSold()* - Marks the property as sold
- *addListener(BidListeners listener)* - Registers a listener
- *emoveListener(BidListeners listener)* - Removes a listener
- *bidReceived(String bidder, int bid)* - Creates a new **Bid**, registers this and notifies listeners about the new bid dependent on whether it's the highest bid or not
- * notifyListeners(Bid bid)* - Lets all listeners know about the new bid
- *addListenerForHighestBids(BidListener listener)* - Registers a listener to listen only on bids that are the highest bid so far
- *getHighestBid* - Returns the highest bid 


# Part 6 – Inheritance 

BusinessProperty [BusinessProperty](BusinessProperty.java) inherits from Property but has somewhat different behavior. 

**BusinessProperty** accepts bids in the same way, but must be registered as sold as soon as a bid exceeding the price of the property is set. 

Implement the necessary overrides in **BusinessProperty**. 


# Part 8 - Realtor

Implement the methods in [Realtor](Realtor.java)

- *Realtor(double comission)* creates a **Realtor** object with a given commission
- *setCommission(double comission)* Updates the broker's process
- *addProperty(Property property)* Adds a property to the broker's portfolio
- *calculateTotalCommission()* - Calculates the total commission salary based on all homes sold by the broker
	
# Part 8 – Comparator and Interfaces

Implement method in [RealtorComparator](RealtorComparator.java) 

- *sortRealtorsByHighestBidReceived* - Returns a **Comparator** that sorts a list of **Realtor** objects. These should be sorted according to which realtor has achieved the highest bid based on all the properties from highest to lowest.  
 
