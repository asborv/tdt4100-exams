# Del 8 - Funksjonelle grensesnitt og listehåndteringer 

Fyll ut [UniversityHandbookUtils](UniversityHandbookUtils.java) sine metoder for operasjoner på en liste med [Course](Course.java)-objekter.

- *getCourseNames(List<Course> courses)* - Returnerer en liste med navnene til alle emnene
- *getCourseProperties(List<Course> courses, Function<Course, String> function)* - Returnerer alle emner transformerte ved hjelp av funksjonen
- *calculateGradesSummary(List<Course> courses, BinaryOperator<Double> operator)* - Returnerer resultatet av å kjøre operatoren på alle karaktersnittene til emnene
- *getCoursesYouCanTake(List<Course> courses, List<Course> takenCourses)* - Returnerer alle emnene hvor du tilfredstiller alle forkunnskapskravene (takenCourses representerer her emnene du tidligere har tatt) 