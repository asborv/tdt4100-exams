# Part 5 - Observer-Observed.

Implement the remaining functionality in the [LoyaltyUser](LoyaltyUser.java) class.
**LoyaltyUser** is a class that implements a user who can collect
status points and achieve status levels based on this. 

The loyalty program collaborates with others and it is therefore desirable that other classes can listen to the status of a user. The interface for this is defined in [StatusListener](StatusListener.java).

Exercise A)
Fill in the required methods and fields to support listening in the [LoyaltyUser](LoyaltyUser.java) class, to enable listening to changes in the status for a given user.

Important:
- A listener will only be interested in one status and if the listener is re-registered, the latest status it was registered to should be used. 
- The listener should be notified both when the user achieves this status and when the status is lost.

The following methods should be changed/implemented:
- *checkForStatusUpgrade()* - Check if the user qualifies for a status level change. If the status is changed, all listeners should be notified. 
- *addListener(StatusListener listener, String status)* - Adds a listener that listens to the provided *status*.
- *removeListener(StatusListener listener)* - Removes the listener.
- *fireStatusChanged(String oldStatus, String newStatus)* - Notifies all listeners listening to either *oldStatus* or *newStatus* that the status has changed. 

Exercise B)
Implement [RentalCarListener](RentalCarListener.java).
**RentalCarListener** listens for changes in status to gold members
in **LoyaltyUser** to be able to give gold members a discount.

- *statusChanged(String username, String oldStatus, String newStatus)* - Registers the change in status for a given username. 
- *getDiscount(String username) - Returns the discount of a username. Should be a 100 if the user currently has gold status, otherwise 0. 

# 6 - Inheritance and Debugging

Look at the abstract class [LoyaltyAward](LoyaltyAward.java) and the class [CarRentalAwards](CarRentalAwards.java)

During the implementation of these classes, the developers have made two mistakes that are exposed when running the main method in[CarRentalAwards](CarRentalAwards.java) and that causes the application to crash. 

Correct the errors (this means that the code should not crash and also that the correct logic is executed).

The following methods exist in  **LoyaltyAward**:

- *LoyaltyAward(String awardName)* - Creates an **LoyaltyAward** object with the provided name.
- *setAwardName(String awardName)* - Updates the name of the award. 
- *awardPoints(int points, LoyaltyUser loyaltyUser)* - Awards the provided number of points to the given user. 

The following methods exists in **CarRentalAwards**:

- *CarRentalAwards(String awardName* Creates an **CarRentalAwards** object with the provided name.
- *setAwardName(String awardName)* - Updates the name of the award if it is valid. 
- *awardPoints(int carBrand, LoyaltyUser loyaltyUser)* - Awards a calculated number of points to the provided user. The number of points is calculating from which car brand the user rented. 