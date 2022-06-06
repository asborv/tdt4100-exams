# Del 4 - Temperature - objektstrukturar


## A) Objektstrukturar (12 %)
Fyll inn vedlagde [Temperature](Temperature.java). Temperature har oversyn over ein temperatur som enten er i Fahrenheit eller i Celsius. 

Temperature har følgjande metodar:

- *Temperature(double degrees, char scale)* - Opprettar eit **Temperature*-objekt med ein skala (Fahrenheit/Celsius) og eit tal grader
- *getScale()* - Returnerer om temperaturen er i Fahrenheit eller Celsius.
- *getDegrees()* - Returnerer temperaturen i antal grader. 
- *toOther()* - Gjer om dette Temperature-objektet til motsatt skala og returnerer det. 
- *inOther()* - Lagar eit nytt Temperature-objekt til motsatt skala og returner det. 
- *lower(double amount)* -  Senkar temperaturen med eit tal gradar.

## B Delegering (8 %) 
Fyll og inn [DelegatingTemperature](DelegatingTemperature.java). **DelegatingTemperature** skal delegere til eit underliggande Temperature-objekt og ha følgjande metodar: Du kan gå ut ifrå at alle metodane til delegaten fungerer slik dei skal.

- *Temperature(Temperature delegate, char scale)* - Opprettar eit **DelegatingTemperature*-objekt med ein skala (Fahrenheit/Celsisus) og eit tal grader representert i delegaten.
- *getScale()* - Returnerer om temperaturen er i Fahrenheit eller Celsius.
- *getDegrees()* - Returnerer temperaturen i antal grader.
- *toOther()* - Gjer om dette DelegatingTemperature-objektet til motsatt skala og returnerer det. 
- *inOther()* - Lagar eit nytt DelegatingTemperature-objekt til motsatt skala og returner det. 
