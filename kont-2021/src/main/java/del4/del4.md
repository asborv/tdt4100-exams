# Del 4 - Temperature - objektstrukturer


## A) Objektstrukturer (12 %)
Fyll inn vedlagte [Temperature](Temperature.java). Temperature har oversikt over en temperatur som enten er i Fahrenheit eller i Celsius. 

Temperature har følgende metoder

- *Temperature(double degrees, char scale)* - Initialiserer et **Temperature**-objekt med en skala (Fahrenheit/Celsius) og et antall grader
- *getScale()* - Returnerer om temperaturen er i Fahrenheit eller Celsius.
- *getDegrees()* - Returnerer temperaturen i antall grader.
- *toOther()* - Gjør om dette temperatur-objektet til den andre skalaen og returnerer det.
- *inOther()* - Lager et nytt temperatur-objekt i den den andre skalaen og returnerer det. 
- *lower(double amount)* -  Senker temperaturen med et antall grader.


## B( Delegering (8 %)

Fyll inn [DelegatingTemperature](DelegatingTemperature.java). DelegatingTemperature skal delegere til et underliggende Temperature-objekt og ha metodene beskrevet under. Du kan gå ut ifra at alle metodene til delegaten fungerer slik de skal. 

- *DelegatingTemperature(Temperature delegate, char scale)* - Oppretter et **DelegatingTemperature**-objekt med en skala (Fahrenheit/Celsisus) og et antall grader som er representert i delegaten.
- *getScale()* - Returnerer om temperaturen er i Fahrenheit eller Celsius.
- *getDegrees()* - Returnerer temperaturen i antall grader. 
- *toOther()* - Gjør om dette temperatur-objektet til den andre skalaen og returnerer det.
- *inOther()* - Lager et nytt temperatur-objekt i den den andre skalaen og returnerer det. 