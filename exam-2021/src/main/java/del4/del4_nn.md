# Del 4 - Comparator og Interface

Fyll inn vedlagde [AthleteComparators](AthleteComparators.java) og dei to metodane der. 
Du skal ta utgangspunkt i, men ikkje trenga å endra [Athlete](Athlete.java) og [Medal](Medal.java) som ligg vedlagt. 

Det er  tilatt å legga til metodar i desse klassene dersom du meiner det er hjelpemetodar som vil vera til hjelp. 
Ingen ekstra metodar du legg til bør endra tilstanden til objekta.

Følgjande metodar skal implementerast:
- *getSimpleComparator()* - Returner ein **comparator** som skal brukast til å samanlikna **Athletes** basert på namnet deira alfabetisk. 
    Det vil seia at Ane kjem før Berit, som igjen kjem før Daniel. 
- *getAdvancedComparator* Returner ein **comparator** som skal brukast til å samanlikna **Athletes** basert på antall medaljar dei har. 
    Ein atlet som har to gullmedaljar, vil komma før ein atlet som har
    ein gullmedalje og ein sølvmedalje. Dersom dei har lik mengde medaljar går ein vidare til neste medaljetype, 
    og viss dei har lik mengde medaljar av alle typar skal ein samanlikna basert på namnet som i *getSimpleComparator*.