# Del 7 - Filhåndtering


Ta utgangspunkt i den vedlagte [Course](Course.java)-klassem. Denne klassen trengs ikke å endres for oppgaven. Course-klassen har oversikt over:

- Et navn.
- Gjennomsnittskarakter.
- Andre emner som er forkunnskapskrav til dette emnet.

Du skal fylle ut [UniversityHandbook](UniversityHandbook.java) -klassen sine metoder for å kunne lese emner fra fil og holde oversikt over disse emenene. Det vil bli gitt poeng etter følgende oppnåelse, så dersom du ikke får til hele oppgaven vil du få uttelling for delvis løsning.  

1. Lese inn emners navn og gjennomsnittskarakter fra fil. 
2. Støtte å legge til forkunnskapskrav om emner som har vært tidligere i filen. 
3. Støtte å legge til forkunnskapskrav om emner som kommer senere i filen. 

Følgende metoder skal fullføres/implementeres:
- *readFromInputStream(InputStream stream)* - Leser inn emner fra en gitt inputStream. (Se eksempelfilen i src/main/resources/del7_og_8/courses.txt for hvordan disse kan se ut.)
- *getCourse(String courseName)* - Returnerer emnet med det gitte navnet.


# Del 8 - Funksjonelle grensesnitt og listehåndteringer 

Fyll ut [UniversityHandbookUtils](UniversityHandbookUtils.java) sine metoder for operasjoner på en liste med [Course](Course.java)-objekter.

Følgende metoder skal implementeres: 

- *getCoursesWithPredicate(Collection<Course> courses, Predicate<Course> p)* - Returnerer alle emner i samlingen som tilfredstiller predikatet. 
- *getNonPrequisiteCourses(Collection<Course> courses)* - Returnerer alle emner i samlingen som ikke har noen forkunnskapskrav. 
- *containsImpossibleCourse(Collection<Course> courses)* - Returnerer hvorvidt samlingen av emner inneholder et emne som er umulig. 
    Et umulig emne er definert som et emne X som har et forkunnskaps krav, som har emnet X som forkunnskapskrav.