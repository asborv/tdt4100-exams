# Part 4 - Comparator and Interface

Fill in [AthleteComparators](AthleteComparators.java) and the two methods there.
You should use [Athlete](Athlete.java) and [Medal](Medal.java), that are attached, as a base for your work but you do not need to change them.

It is allowed to add methods to these classes if you think they are helper methods that will be helpful.
No additional methods you add should change the state of the object.

The following methods must be implemented:
- *getSimpleComparator()* - Returns a **comparator** to be used to compare **Athletes** based on their name alphabetically.
     That is, Ane comes before Berit, who comes before Daniel.
- *getAdvancedComparator()* Return a **comparator** to be used to compare **Athletes** based on the number of medals they have.
     An athlete who has two gold medals will come before an athlete who has a gold medal and a silver medal. If they have the same number of medals of a type, one goes on to the next type of medal,
     and if they have the same number of medals of all types, one should compare based on the name as in *getSimpleComparator*.