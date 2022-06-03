# Del 5 - Observatør-Observert. 

Ta utgangspunkt i [LoyaltyUser](LoyaltyUser.java)-klassen. 
**LoyaltyUser** er en klasse som implementerer en bruker som kan samle statuspoeng, og som kan gå opp og ned i status basert på dette. 

Lojalitetsprogrammet samarbeider med andre og det er derfor ønskelig at andre kan lytte på statusen til en bruker. Grensesnittet for dette er definert i [StatusListener](StatusListener.java).

Oppgave A) 
Fyll ut nødvendige metoder og felt for å støtte lytting i [LoyaltyUser](LoyaltyUser.java) klassen, for å gjøre det mulig å lytte på endring i statusen til et brukernavn.

Viktig:
- En lytter vil kun være interessert i en status, og dersom lytteren registreres på nytt er det en ny status den skal lytte på. 
- Selv om lytteren kun er interessert i en status, vil den være interessert i både når brukeren oppnår denne statusen og når den mister den.

Følgende metoder skal endres/implementeres:
- *checkForStatusUpgrade()* - sjekker om brukeren kvalifiserer seg til en endring i statusnivå. Dersom statusen endres bør den si ifra til alle lytterne. 
- *addListener(StatusListener listener, String status)* - Registrerer en lytter som lytter på *status*.
- *removeListener(StatusListener listener)* - fjerner lytteren.
- *fireStatusChanged(String oldStatus, String newStatus)* - Sier ifra til alle lytterne som lytter på enten *oldStatus* eller *newStatus* om at statusen er endret. 

Oppgave B) 
Implementer [RentalCarListener](RentalCarListener.java). 
**RentalCarListener** lytter på endringer i status til LoyaltyUser i **LoyaltyUser** for å kunne gi gullmedlemmer rabatt. 

- *statusChanged(String username, String oldStatus, String newStatus)* - Registerer endringen i status for et gitt brukernavn. 
- *getDiscount(String username*) Returnerer rabatten til et brukernavn. Skal være 100 hvis brukeren innehar gullnivå, ellers 0. 


# Del 6 - Arv og Debugging

Ta utgangspunkt i den abstrakte klassen [LoyaltyAward](LoyaltyAward.java) og klassen [CarRentalAwards](CarRentalAwards.java). Disse klassene implementerer metoder for å tildele poeng til en bruker ut ifra hvilket bilmerke den har leid. 

Under implementasjonen av disse klassene har det kommet inn to feil som eksponeres ved kjøring av main-metoden i [CarRentalAwards](CarRentalAwards.java). 

Rett opp feilene (dette vil innebære både at koden ikke krasjer og at riktig logikk utføres). 

Følgende metoder finnes i **LoyaltyAward**:

- *LoyaltyAward(String awardName)* - Oppretter et **LoyaltyAward** objekt med det gitte navnet.
- *setAwardName(String awardName)* - Oppdaterer navnet på prisen. 
- *awardPoints(int points, LoyaltyUser loyaltyUser)* Gir antall poeng til den gitte brukeren. 

Følgende metoder finnes i **CarRentalAwards**:

- *CarRentalAwards(String awardName* Oppretter et **CarRentalAwards** objekt med det gitte navnet.
- *setAwardName(String awardName)* - Oppdaterer navnet på prisen dersom det er gyldig. 
- *awardPoints(int carBrand, LoyaltyUser loyaltyUser)* - Gir et visst antall poeng til den gitte brukeren. Antall poeng er beregnet ut ifra hvilket bilmerke brukeren har leid. 