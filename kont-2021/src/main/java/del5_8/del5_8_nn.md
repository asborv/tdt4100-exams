# Informasjon

Delene i denne oppgåva bygger på kvarandre, men kan løysast uavhengig av kvarandre sjølv om main-metodene då ikkje nødvendigvis vil gi rett resultat. Det vil ofte krevja at du har forstått kva metodane skal gjera, men du kan gå ut ifrå at implementasjonen er rett sjølv om du ikkje har fått til ein metode.

# Del 5 - Observatør-Observert. 

Ta utgangspunkt i [Property](Property.java)-klassen. 
**Property** er ein klasse som implementerer ein eigedom som kan motta bod for bli kjøpt. 

Interessentar i eigedommen er interessert i å kunna lytta på nye bod [Bid](Bid.java) på eigedommen. 

Fyll ut nødvendige metodar og felt for å støtta lytting i [Property](Property.java)-klassen, for å gjera det mogleg å lytta på nye bod på eigedommen. Følgjande metodar skal implementerast: 

- *setIsSold()* - Markerer eigedommen som selt
- *addListener(BidListeners listener)* - Registrerer ein lyttar
- *emoveListener(BidListeners listener)* - Fjernar ein lyttar
- *bidReceived(String bidder, int bid)* - Opprettar eit nytt **Bid** og registrerer dette, og seier ifrå til alle lyttarane om eit nytt bod har komme
- *notifyListeners(Bid bid)* - Seier ifrå til alle lyttarane om det nye bodet
- - *addListenerForHighestBids(BidListener listener)* - Registrerer ein lyttar som berre skal lytta på bod som er det høgaste bodet til no
- *getHighestBid* - Returnererer det høgaste bodet 


# Del 6 - Arv 

BusinessProperty [BusinessProperty](BusinessProperty.java) arvar frå Property men har noko ulik åtferd. 

**BusinessProperty** tar imot bod på same måte, men skal registrerast som selt med ein gang eit bod som er over prisen på eigedommen er sett. 

Gjer nødvendige endringar for å få til dette i **BusinessProperty**. 

 
#Del 7 - Realtor

Implementer metodane i [Realtor](Realtor.java)

- *Realtor(double comission)* opprettar eit **Realtor** objekt med ein gitt provisjon
- *setCommission(double comission)* Oppdaterer provisjonen til meklaren
- *addProperty(Property property)* Legg til ein eigedom i porteføljen til meklaren
- *calculateTotalCommission()* - Reknar ut det samla talet provisjon lønn basert på alle selde bustader meklaren har
- *iterator()* - Returnerer ein iterator for å iterera gjennom alle eigedommane til meklaren
	
# Del 8 - Comparator og Interfaces

Implementer metoden i [RealtorComparator](RealtorComparator.java) 

- *sortRealtorsByHighestBidReceived* - Returnerer ein **Comparator** som sorterer ei liste med **Realtor*-objekt. Desse skal sorterast etter kva meklar som har oppnådd det høgaste bodet basert på alle eigedommane fra høgast til lavest. 