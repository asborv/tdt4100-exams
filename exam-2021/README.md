# Eksamen Vår 2021

Oppgaven består av følgende deler, som ligger inne i hver sin pakke. (Noen deler har samme pakke da de benytter seg av samme klasser) 

- [Del 1](src/main/java/del1/del1.md): VaccineTrial og VaccineTrialVolunteer (15 %)
- [Del 2](src/main/java/del2/del2.md): Innkapsling og objektstrukturer (5 %)
- [Del 3](src/main/java/del3/del3.md): Delegering (10 %)
- [Del 4](src/main/java/del4/del4.md): Interfaces og Comparators (15 %)
- [Del 5](src/main/java/del5_og_6/del5_og_6.md): Observatør-Observert (20 %)
- [Del 6](src/main/java/del5_og_6/del5_og_6.md): Arv og Debugging (10 %)
- [Del 7](src/main/java/del7_og_8/del7_og_8.md): Filhåndtering (15 %)
- [Del 8](src/main/java/del7_og_8/del7_og_8.md): Funksjonelle grensesnitt og lister (10 %)

Ignorerer testeksamen pakken, (den er ikke fjernet for å unngå konflikter, og kan slettes av dere hvis den føles i veien). 

## Oppgave format

Oppgavebeskrivelsene finner dere under hver del. Det vil si src/main/java/del1/del1.md inneholder oppgavebeskrivelsen for del 1. Oppgavene har en tekstbeskrivelse, men denne er ikke alltid utfyllende. De mest utfyllende kravene til en metode står i dens javadoc-beskrivelse, altså en kommentar som står før metoden selv i kildekoden. I utgangspunktet trenger dere kunne å bruke .md-filene for å navigere til riktige klasser som faktisk skal implementeres, alt av krav til metoder står i selve Java-docen. Det er likevel i mange oppgaver spesifisert hvilke metoder som skal implementeres, og hva disse skal gjøre, men dette står da og i Java-docen, og kun Java-docen inneholder informasjon om f.eks Exceptions som skal utløses. Dersom du mener at Java-docs og oppgavebeskrivelse inneholder motstridende informasjon, ta først og fremst hensyn til det som står i Java-docen.  

Et web-view av Java-docen kan og bli sett av å apne doc/index.html filen i prosjektet. 

Hvis du ikke skulle klare å implementere en metode i en del kan du selvfølgelig bruke denne videre som om den virket (som i tidligere 'papireksamener'). Merk at metoden bør fortsatt kompilere, alle metoder kompilerer ved hjelp av *dummy* return verdier. 

Alle klasser som vurderes for karakterering må kompilere. Dette betyr at du ikke skal ha noen "unresolved compilation problem" -feil eller røde linjer i Eclipse for en gitt klasse. 
Unntak i koden som NullPointerException er ikke kompileringsproblemer (men vil selvfølgelig ikke få full poengsum). Dere bør teste deres egen kode slik at dere vet at denne kjører. For å hjelpe med dette har de fleste deler main-metode som inneholder noe kode for å teste implementeringen. Disse main-metodene tester ikke nødvendigvis alle tilfeller så du oppfordres til å utvide med dine egne metoder. Denne koden bør fortsatt kompilere, men trenger ikke fjernes ved levering. 

## Navigering

Oppgave beskrivelsene kan brukes som hjelp til å navigere til riktige filer. Når du har åpent en .md-fil kan du trykke på **Preview**-fanen i Eclipse for å få dette på en mer leselig måte. 

Alle metodene dere skal fylle inn er og markert med //TODO. Du kan få opp alle steder hvor dette står med å apne **Tasks**-viewet i Eclipse. Dette finner du ved **Window > Show View > Other** og søke på *tasks*. 

## Besvarelse

*Oppgaveteksten* finnes i  **del1.md**-filer og andre md-filer i prosjektet og kan leses både på gitlab og i IDE-en. Versjoner på nynorsk og engelsk finnes i egne filer. Eclipse-editoren for md-filer har en  **Preview**-fane som gjør det lett å lese og navigere.

Oppgaven  *besvares* ved å bygge videre på kode-filene som er der, og fylle inn evt antakelser du gjør, i en separat md-fil (oppgavekommentarer.md)


## Nedlasting og import

*Nedlasting* og  *import* skjer enten ved å laste ned en zip-fil fra repo-sida på gitlab eller Inspera, eller ved å klone git-repoet. Samme zip-fil ligger også som element her på Bb. 

Ved  *import av zip-fil*, så skal veiviseren  **Import > Maven > Existing Maven Projects** brukes. Naviger til den nedlastede zip-filen (husk og åpne zip-filen først) og velg mappen som gjør at pom.xml filen ligger inne i denne. Ved import av zip-fil bør du og bytte navn på prosjektet hvis du laster det ned på forhånd, så du ikke får konflikt med navngivning når du skal laste ned selve eksamen. 

*Import med kloning* skjer med en annen veiviser, som  beskrevet på følgende wiki-side:  <https://www.ntnu.no/wiki/display/tdt4100/Importere+kode+fra+git> . 


Dersom det blir konflikter når dere puller kan dere høyreklikke og *Replace with > Head Revision * på prosjektet. 

## Levering
Når eksamen skal leveres kan du gjøre dette på denne måten:

**Zippe i Windows**

- Høyreklikk på prosjektikonet i 'Package Explorer' helt til venstre i Eclipse.
- Velg 'Show in' -> click 'System Explorer'.
- Du skal nå få opp et utforskervindu (ikke i Eclipse, men i Windows) som står åpent i en folder som sannsynligvis slutter på git. For meg er det _'C:\Users\borgeha\git'_ Denne folderen inneholder prosjektfolderen vi skal komprimere.
- Høyreklikk prosjektfolderen, den skal hete exam2021 -> meny 'Send til' -> 'Komprimert (zippet) mappe'. 
- Windows komprimerer nå prosjektfolderen exam2021, og spør deg hva den skal kalles La den hete det som foreslås.
- Denne zipfilen er filen dere skal laste opp til Inspera til slutt.
- Dere finner et par bilder av prosessen til slutt i denne filen.

**Zippe i OS X**

- Følg instruksjonene som for Windows overfor, men ting har andre navn.
- Høyreklikk prosjektet i Eclipse -> 'Åpne i Finder'
- Høyreklikk prosjektfolderen og velg 'Komprimer'
- Filen du får er den som skal lastes opp til Inspera.

**System Explorer**

<img src="System_Explorer.png" alt="drawing" width="600"/>

**Compress**

<img src="Compress.png" alt="drawing" width="600"/>
