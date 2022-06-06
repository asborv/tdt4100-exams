# Part 3 – Delegation

The following attached classes/interfaces are used, but should not be changed in this class. You do not need to understand how the methods are implemented, 
only make use of them directly. 
- [CalculationsImpl](CalculationsImpl.java) - Implementation of **Calculations**
- [Calculations](Calculations.java) - Interfaces implemented in both **CalculationsImpl** and **CachingCalculations**

You must populate [CachingCalculations](CachingCalculations.java) and the methods/constructors of this class. 

**CachingCalculations** shall delegate to a delegate, who will perform the work and then *memorize* the result. Memorizing means that if the method gets an argument it has previously seen, it should return the previously calculated result rather than ask the delegate to do the calculation again. This is a commonly used technique when calculations can be costly to execute. 

- *CachingCalculations(Calculations delegate)* - Creates a CachingCalculations object
- *getCalculation1(int number)* - Do calculation 1
- *getCalculation2(int number)* - Do calculation 2. 

