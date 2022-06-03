# Del 3 - Delegering

Følgjande vedlagde klasser/interfaces blir brukt, men skal ikkje endrast i denne oppgaven. Du treng ikkje forstå korleis metodane er implementerte, 
berre nytta deg direkte av dei. 
- [SomeServiceImpl](SomeServiceImpl.java) - Implementasjon av **SomeService**.
- [SomeService](SomeService.java) - Grensesnitt som implementers i både **SomeServiceImpl** og **LoggingSomeService**.
- [Logger](Logger.java) - Ein hjelpeklasse for å logga resultat. 


Du skal fylla ut [LoggingSomeService](LoggingSomeService.java) og metodane/konstruktør i denne klassen. 
**LoggingSomeService** skal delegera vidare til ein delegat, som skal utføra arbeidet, og deretter
logga resultatet før det blir returnert. Følgjande metodar skal implementerast:

- *LoggingSomeService(SomeService delegate, Logger loggar)* - Opprettar eit objekt av **LoggingSomeService** med ein delegat og ein loggar. 
- *getAMagicString()* - Returnerer ein magisk String. Det er den delegertes oppgåve å henta ut Stringen, og han skal loggast før det blir returnert.
- *getAMagicNumber()* - Returnerer eit magisk tal. Det er den delegertes oppgåve å henta ut talet, og det skal loggast før det blir returnert.