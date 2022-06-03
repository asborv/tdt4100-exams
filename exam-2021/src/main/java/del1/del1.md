# Del 1: VaccineTrial og VaccineTrialVolunteer. 

*Linkene i denne filen fungerer ikke på Gitlab, men vil lede riktig i Eclipse Preview*

Oppgaven handler om å holde oversikt over en pågaende vaksinestudie. 

Oppgave A) Utfyll klassen [VaccineTrialVolunteer](VaccineTrialVolunteer.Java), og alle metodene i denne klassen. Legg til nødvendige felt. **VaccineTrialVolunteer** skal ha følgende metoder: 

- *VaccineTrialVolunteer(String id, boolean placebo)* - Oppretter en ny frivillig deltaker, med den gitte ID-en og hvorvidt deltakeren fikk placebo eller faktiske vaksinen. 
- *getId()* - Henter ut ID-en til deltakeren.
- *isPlacebo()* - Returnere hvorvidt deltakeren fikk placebo eller vaksine. 
- *gotSick()* - Returnere hvorvidt deltakeren ble syk i løpet av studien. 
- *setGotSick(boolean gotSick)* - Oppdaterer om deltakeren ble syk i løpet av studien. 


Oppgave B) Fyll ut klassen [VaccineTrial](VaccineTrial.Java), og alle metodene i denne klassen. Legg til egne nødvendige felt. **VaccineTrial** skal ha følgende metoder: 

- *addVolunteer(String id, boolean placebo)* - Legger til en deltaker i studien. 
- *isMoreEffectiveThanLimit(double limit)* - Hvorvidt vaksinen var mer effektiv enn den oppgitte grensen. 
- *setSick(String id)* - Oppdaterer deltakeren med den gitte ID-en til å ha blitt syk i løpet av studien. 
- *VaccineTrialVolunteer getVolunteer(String id)* - Returnerer deltakeren med den gitte ID-en. 