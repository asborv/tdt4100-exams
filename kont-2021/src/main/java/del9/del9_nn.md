# Del 8 - Funksjonelle grensesnitt og listehandteringar 

Fyll ut [UniversityHandbookUtils](UniversityHandbookUtils.java) metodane sine for operasjonar på ei liste med [Course](Course.java)-objekt.


- *getCourseNames(List<Course> courses)* - Returnerer ei liste med namna til alle emna
- *getCourseProperties(List<Course> courses, Function<Course, String> function)* - Returnerer alle emner transformerte ved hjelp av funksjonen
- *calculateGradesSummary(List<Course> courses, BinaryOperator<Double> operator)* - Returnerer resultatet av å køyre operator på alle karaktersnitta til emna
- *getCoursesYouCanTake(List<Course> courses, List<Course> takenCourses)* - Returnerer alle emna der du tilfredstiller alle forkunnskapskrava (takenCourses representerer her emna du tidlegare har tatt)