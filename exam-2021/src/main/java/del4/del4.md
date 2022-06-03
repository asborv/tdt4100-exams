# Del 4 - Comparator og Interface

Fyll inn vedlagte [AthleteComparators](AthleteComparators.java) og de to metodene der. 
Du skal ta utgangspunkt i, men ikke trenge å endre [Athlete](Athlete.java) og [Medal](Medal.java) som ligger vedlagt. 

Det er tillatt å legge til metoder i disse klassene dersom du mener det er hjelpemetoder som vil være til hjelp. 
Ingen ekstra metoder du legger til bør endre tilstanden til objektene. 

Følgende metoder skal implementeres:
- *getSimpleComparator()* - Returner en **comparator** som skal brukes til å sammenlikne **Athletes** basert på navnet deres alfabetisk. 
    Det vil si at Ane kommer før Berit, som igjen kommer før Daniel. 
- *getAdvancedComparator* Returner en **comparator** som skal brukes til å sammenlikne **Athletes** basert på antall medaljer de har. 
    En atlet som har to gullmedaljer, vil komme før en atlet som har en gullmedalje og en sølvmedalje. Dersom de har likt antall medaljer av en type går man videre til neste medaljetype, og hvis de har likt antall medaljer av alle typer skal man sammenlikne basert på navnet som i *getSimpleComparator*.