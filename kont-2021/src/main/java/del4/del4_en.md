# Part 4 – Temperature – object structures

## A) Object Structures (12%)
Fill in the enclosed [Temperature](Temperature.java). Temperature has an overview of a temperature that is either in Fahrenheit or in Celsius. 

Temperature has the following methods

- *Temperature(double degrees, char scale)* - Creates a **Temperature** object with a scale (Fahrenheit/Celsius) and a number of degrees.
- *getScale()* - Returns whether the temperature is in Fahrenheit or Celsius.
- *getDegrees()* - Returns the temperature.
- *toOther()* - Turns this temperature object into the other scale and returns it.
- *inOther()* - Creates a new temperature object with the opposite scale of this and return it. 
- *lower(double amount)* - Lowers the temperature by a number of degrees.

## B) Delegatin (8 %) 
Also fill in the [DelegatingTemperature](DelegatingTemperature.java) class. DelegatingTemperature delegates to an underlying Temperature object and has the following methods. You can assume that all the methods of the delegate work correctly. 

- *DelegatingTemperature(Temperature delegate, char scale)* - Creates a **DelegatingTemperature** object with a scale (Fahrenheit/Celsisus) and a number of degrees represented in the delegate. 
- *getScale()* - Returns whether the temperature is in Fahrenheit or Celsius.
- *getDegrees()* - Returns the temperature.
- *toOther()* - Turn this **DelegatingTemperature** object into the other scale and return it.
- *inOther()* - Creates a new **DelegatingTemperature** object with the opposite scale of this and return it. 