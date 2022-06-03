# Del 1: VaccineTrial og VaccineTrialVolunteer. 

*Linkane i denne fila fungerer ikkje på Gitlab, men vil leia riktig i Eclipse Preview*

Oppgåva handlar om å halda oversyn over ein pågaende vaksinestudie. 

Oppgåve A) Utfyll klassen [VaccineTrialVolunteer](VaccineTrialVolunteer.Java), og alle metodane i denne klassen. **VaccineTrialVolunteer** skal ha følgjande metodar: 

- *VaccineTrialVolunteer(String id, boolean placebo)* - Opprettar ein ny frivillig deltakar, med den gitte ID-en og i kva grad deltakaren fekk placebo eller faktiske vaksinen 
- *getId()* - Hentar ut ID-en til deltakaren.
- isplacebo()* - Returnera om deltakaren fekk placebo eller vaksine. 
- *gotSick()* - Returnera i kva grad deltakaren vart sjuk i løpet av studien. 
- *setGotSick(boolean gotSick)* - Oppdaterer om deltakaren vart sjuk i løpet av studien. 


Oppgåve B) Fyll ut klassen [VaccineTrial](VaccineTrial.Java), og alle metodane i denne klassen. Legg til eigne nødvendige felt. **VaccineTrial** skal ha følgjande metodar: 

- *addVolunteer(String id, boolean placebo)* - Legg til ein deltakar i studien. 
- *isMoreEffectiveThanLimit(double limit)* - I kva grad vaksinen var meir effektiv enn den oppgitte grensa. 
- *setSick(String id)* - Oppdaterer deltakaren med den gitte ID-en til å ha vorte sjuk i løpet av studien. 
- *VaccineTrialVolunteer getVolunteer(String id)* - Returnerar deltakaren med den gitte ID-en.