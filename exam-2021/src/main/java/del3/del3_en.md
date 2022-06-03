# Part 3 - Delegation

The following attached classes/interfaces are used but should not be changed in this exercise. You do not need to understand how the methods are implemented, just take advantage of them directly.
- [SomeServiceImpl](SomeServiceImpl.java) - Implementation of **SomeService**.
- [SomeService](SomeService.java) - Interfaces implemented in both **SomeServiceImpl** and **LoggingSomeService**.
- [Logger](Logger.java) - A helper class for logging results.


You must fill in [LoggingSomeService](LoggingSomeService.java) and the methods/constructor in this class.
**LoggingSomeService** shall delegate the calculation to a delegate, and thereafter log the result before returning it.

- *LoggingSomeService(SomeService delegate, Logger logger)* - Creates an object of **LoggingSomeService** with a delegate and a logger.
- *getAMagicString()* - Returns a magic string. It is the delegate's job to calculate the String and it should be logged before it is returned. 
- *getAMagicNumber()* - Returns a magic number. It is the delegate's job to calculate the number and it should be logged before it is returned. 
