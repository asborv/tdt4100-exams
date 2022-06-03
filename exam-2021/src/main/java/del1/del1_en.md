# Part 1: VaccineTrial and VaccineTrialVolunteer.

*The links in this file does not work correctly on Githab, but does in Eclipse Preview*

The assignment is about keeping track of an ongoing vaccine study.

Exercise A) Complete the class [VaccineTrialVolunteer](VaccineTrialVolunteer.Java). Add your own required fields. 

- *VaccineTrialVolunteer(String id, boolean placebo)* - Creates a new volunteer, with the given ID and whether the participant received the placebo or the actual vaccine.
- *getId()* - Retrieves the ID of the participant.
- *isPlacebo()* - Return whether the participant received a placebo or vaccine.
- *gotSick()* - Return whether the participant became ill during the study.
- *setGotSick(boolean gotSick)* - Updates if the participant became ill during the study.

Exercise B) Fill in the class [VaccineTrial](VaccineTrial.Java), and all the methods in this class. Add required fields.

- *addVolunteer(String id, boolean placebo)* - Adds a participant to the study.
- *isMoreEffectiveThanLimit(double limit)* - Return whether the vaccine was more effective than the provided limit. 
- *setSick(String id)* - Updates the volunteer with the given ID to have gotten sick during the study. 
- *VaccineTrialVolunteer getVolunteer(String id)* - Returns the volunteer with the given ID. 