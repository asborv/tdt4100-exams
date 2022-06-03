# Del 3 - Delegering

Følgende vedlagte klasser/interfaces brukes, men skal ikke endres i denne oppgaven. Du trenger ikke forstå hvordan metodene er implementert, 
bare benytte deg direkte av de. 
- [SomeServiceImpl](SomeServiceImpl.java) - Implementasjon av **SomeService**.
- [SomeService](SomeService.java) - Grensesnitt som implementers i både **SomeServiceImpl** og **LoggingSomeService**.
- [Logger](Logger.java) - En hjelpeklasse for å logge resultater. 


Du skal fylle ut [LoggingSomeService](LoggingSomeService.java) og metodene/konstruktør i denne klassen. 
**LoggingSomeService** skal delegere videre til en delegat, som skal utføre arbeidet, og deretter logge resultatet før det returneres. Følgende metoder skal implementeres:

- *LoggingSomeService(SomeService delegate, Logger logger)* - Oppretter et objekt av **LoggingSomeService** med en delegat og en logger. 
- *getAMagicString()* - Returnerer en magisk String. Det er den delegertes oppgave å hente ut Stringen, og den skal logges før det returneres.
- *getAMagicNumber()* - Returnerer et magisk tall. Det er den delegertes oppgave å hente ut tallet, og det skal logges før det returneres.