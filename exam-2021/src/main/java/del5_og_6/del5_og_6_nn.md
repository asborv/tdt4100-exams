# Del 5 - Observatør-Observert. 

Ta utgangspunkt i [LoyaltyUser](LoyaltyUser.java)-klassen. 
**LoyaltyUser** er ein klasse som implementerer ein brukar som kan samla statuspoeng, og gå opp og ned i status basert på dette. 

Lojalitetsprogrammet samarbeider med andre og det er derfor ønskeleg at andre kan lytta på statusen til ein brukar. Grensesnittet for dette er definert i [StatusListener](StatusListener.java).

Oppgåve A) 
Fyll ut nødvendige metodar og felt for å støtta lytting i [LoyaltyUser](LoyaltyUser.java) klassen, for å gjera det mogleg å lytta på endring i status for eit brukarnamn.

Viktig:
- Ein lyttar vil berre vera interessert i ein status, og dersom lyttaren blir registrert på nytt er det den nye status han skal lytta på. 
- Sjølv om lyttaren berre er interessert i ein status, vil han vera interessert både i når brukaren oppnår denne statusen og når den mistar den.

Følgjande metodar skal endrast/implementerast:
- *checkForStatusUpgrade()* - sjekkar om brukaren kvalifiserer seg til ei endring i statusnivå. Dersom statusen blir endra bør den si ifrå til alle lyttarane. 
- *addListener(StatusListener listener, String status)* - Registrerer ein lyttar som lyttar på status.
- *removeListener(StatusListener listener)* - fjernar lyttaren.
- *fireStatusChanged(String oldStatus, String newStatus)* - Seier ifrå til alle lyttarane som lyttar på enten *oldStatus* eller *newStatus* om at statusen er endra.


Oppgåve B) 
Implementer [RentalCarListener](RentalCarListener.java). 
**RentalCarListener** lyttar på endringar i status til gull-medlemmer i **LoyaltyUser** for å kunna gi gullmedlemmer rabatt. 

- *statusChanged(String username, String oldStatus, String newStatus)* - Registerer endringa i status for eit gitt brukarnamn. 
- *getDiscount(String username) Returnerer rabatten til eit brukarnamn. Skal vera 100 viss brukaren innehar gullnivå, elles 0.

# Del 6 - Arv og Debugging

Ta utgangspunkt i den abstrakte klassen [LoyaltyAward](LoyaltyAward.java) og klassen [CarRentalAwards](CarRentalAwards.java)

Under implementasjonen av desse klassene har det kome inn to feil som blir eksponerte ved køyring av main-metoden i [CarRentalAwards](CarRentalAwards.java). 

Rett opp feila (dette vil innebera både at koden ikkje krasjar og at riktig logikk blir utført).

Følgjande metodar finst i **LoyaltyAward*:

- *LoyaltyAward(String awardName)* - Opprettar eit **LoyaltyAward** objekt med det gitte namnet.
- *setAwardName(String awardName)* - Oppdaterer namnet på prisen. 
- *awardPoints(int points, LoyaltyUser loyaltyUser)* - Gir ein viss mengde poeng til den gitte brukaren. 

Følgjande metodar finst i **CarRentalAwards*:

- *CarRentalAwards(String awardName* Oppretter eit **CarRentalAwards** objekt med det gitte namnet.
- *setAwardName(String awardName)* - Oppdaterer namnet på prisen dersom det er gyldig. 
- *awardPoints(int carBrand, LoyaltyUser loyaltyUser)* - Gir ein viss mengde poeng til den gitte brukaren. Mengden poeng er berekna ut ifrå kva bilmerke brukaren har leigd.