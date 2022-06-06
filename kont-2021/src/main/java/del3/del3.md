# Del 3 - Delegering

Følgende vedlagte klasser/interfaces brukes, men skal ikke endres i denne klassen. Du trenger ikke forstå hvordan metodene er implementert, 
bare benytte deg direkte av dem. 
- [CalculationsImpl](CalculationsImpl.java) - Implementasjon av **Calculations**
- [Calculations](Calculations.java) - Grensesnitt som implementeres i både **CalculationsImpl** og **CachingCalculations**


Du skal fylle ut [CachingCalculations](CachingCalculations.java) og metodene/konstruktør i denne klassen. 

**CachingCalculations** skal delegere til en delegate, som skal utføre arbeidet og deretter *memoisere* resultatet. memoisere betyr her at hvis metoden får et argument den tidligere har sett skal den heller returnere det tidligere kalkulerte resultatet, enn å be delegate gjøre beregningen på nytt.  Denne teknikken brukes gjerne når beregninger er kostbare å utføre.

- *CachingCalculations(Calculations delegate)* - Oppretter et CachingCalculations objekt
- *getCalculation1(int number)* - Gjør beregning 1
- *getCalculation2(int number)* - Gjør beregning 2. 


