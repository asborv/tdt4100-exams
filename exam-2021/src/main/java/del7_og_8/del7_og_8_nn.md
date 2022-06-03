# Del 7 - Filhåndtering


Ta utgangspunkt i den vedlagde [Course](Course.java)-klassen. Denne klassen trengst ikkje bli endra for oppgåva. Course-klassen har oversyn over:

- Eit namn.
- Gjennomsnittskarakter.
- Andre emner som er forkunnskapskrav til dette emnet.


Du skal fylla ut [UniversityHandbook](UniversityHandbook.java) -klassen sine metodar for å kunna lesa emner frå fil. Det vil bli gitt poeng etter følgjande oppnåelse, så dersom du ikkje får til heile oppgåva vil du få uttelling for delvis løysing.  

1. Lesa inn namnet og gjennomsnittskarakteren til emner frå fil. 
2. Trygd å legga til forkunnskapskrav om emner som har vore tidlegare i fila. 
3. Trygd å legga til forkunnskapskrav om emner som kjem seinare i fila. 

Følgjande metodar skal fullførast/implementerast:
- *readFromInputStream(InputStream stream)* - Les inn nye filer frå ein gitt inputStream. (Sjå eksempelfilen i src/main/resources/del7_og_8/courses.txt.)
-  *getCourse(String courseName)* - Returnerer emnet med det gitte namnet

# Del 8 - Funksjonelle grensesnitt og listehandteringar 

Fyll ut [UniversityHandbookUtils](UniversityHandbookUtils.java) sine metodar for operasjonar på ei liste med [Course](Course.java)-objekt.

Følgjande metodar skal implementerast: 

- *getCoursesWithPredicate(Collection<Course> courses, Predicate<Course> p)* - Returnerer alle emner i samlinga som tilfredstiller predikatet. 
- *getNonPrequisiteCourses(Collection<Course> courses)* - Returnerer alle emner i samlinga som ikkje har nokon forkunnskapskrav. 
- *containsImpossibleCourse(Collection<Course> courses)* - Returnerer i kva grad samlinga av emner inneheld eit emne som er umogleg. 
    Eit umogleg emne er definerte som eit emne X som har eit forkunnskaps krav, som har emna X som forkunnskapskrav.