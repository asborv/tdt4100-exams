# Informasjon

Delene i denne oppgaven bygger på hverandre, men kan løses uavhengig av hverandre selv om main-metodene da ikke nødvendigvis vil gi rett resultat. Det vil ofte kreve at du har forstått hva metodene skal gjøre, men du kan gå ut ifra at implementasjonen er rett selv om du ikke har fått til en metode. 


# Del 5 - Observatør-Observert. 

Ta utgangspunkt i [Property](Property.java)-klassen. 
**Property** er en klasse som implementerer en eiendom som kan motta bud for å bli kjøpt. 

Interessenter i eiendommen er interessert i å kunne lytte på nye bud [Bid](Bid.java) på eiendommen. 

Fyll ut nødvendige metoder og felt for å støtte lytting i [Property](Property.java)-klassen, for å gjøre det mulig å lytte på nye bud på eiendommen. Følgende metoder skal implementeres: 

- *setIsSold()* - Markerer eiendommen som solgt
- *addListener(BidListener listener)* - Registrerer en lytter
- *emoveListener(BidListener listener)* - Fjerner en lytter
- *bidReceived(String bidder, int bid)* - Oppretter et nytt **Bid** og registrerer dette, og sier ifra registrerte lyttere avhengig om budet er det høyeste til nå eller ikke
- *addListenerForHighestBids(BidListener listener)* - Registrerer en lytter som kun skal lytte på bud som er det høyeste budet til nå
- *notifyListeners(Bid bid)* - Sier ifra til alle lytterne om det nye budet
- *getHighestBid* - Returnererer det høyeste budet 


# Del 6 - Arv 

BusinessProperty [BusinessProperty](BusinessProperty.java) arver fra Property men har noe ulik oppførsel. 

**BusinessProperty** tar imot bud på samme måte, men skal registreres som solgt med en gang et bud som er over prisen på eiendommen er satt. 

Gjør nødvendige endringer for å få til dette i **BusinessProperty**. 

 
# Del 7 - Realtor

Implementer metodene i [Realtor](Realtor.java)

- *Realtor(double comission)* oppretter et **Realtor** objekt med en gitt provisjon
- *setCommission(double comission)* Oppdaterer provisjonen til megleren
- *addProperty(Property property)* Legger til en eiendom i porteføljen til megleren
- *calculateTotalCommission()* - Regner ut total provisjonslønn basert på alle solgte boliger megleren har
- *iterator()* - Returnerer en iterator for å iterere gjennom alle eiendommene til megleren
	
# Del 8 - Comparator og Interfaces

Implementer metoden i [RealtorComparator](RealtorComparator.java) 

- *sortRealtorsByHighestBidReceived* - Returnerer en **Comparator** som sorterer en liste med **Realtor**-objekter. Disse skal sorteres etter hvilken megler som har oppnådd det høyeste budet basert på alle eiendommene fra høyest til lavest. 
 
