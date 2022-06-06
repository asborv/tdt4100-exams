# Del 3 - Delegering

Følgende vedlagde klassar/interfaces blir brukt, men skal ikkje endrast i denne klassen. Du treng ikkje forstå korleis metodane er implementerte, 
berre nytta deg direkte av dei. 
- [CalculationsImpl](CalculationsImpl.java) - Implementasjon av **Calculations**
- [Calculations](Calculations.java) - Grensesnitt som implementers i både **CalculationsImpl** og **CachingCalculations*


Du skal fylla ut [CachingCalculations](CachingCalculations.java) og metodane/konstruktør i denne klassen. 

**CachingCalculations** skal delegera vidare til ein delegate, som skal utføra arbeidet og deretter *memoisere* resultatet. memoisere betyr at viss metoden får eit argument han tidlegare har sett skal han heller returnera det tidlegare kalkulerte resultatet, enn å be delegate gjera utrekninga på nytt. Denne teknikken blir gjerne brukt når utrekningar er kostbar å utføra.

- *CachingCalculations(Calculations delegate)* - Opprettar eit CachingCalculations objekt
- *getCalculation1(int number)* - Gjer utrekning 1
- *getCalculation2(int number)* - Gjer utrekning 2
