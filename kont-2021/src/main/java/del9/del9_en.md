# Part 8 – Functional interfaces and list management 

Fill in [UniversityHandbookUtils](UniversityHandbookUtils.java) methods for operations on a list of [Course](Course.java) objects.


- *getCourseNames(List<Course> courses)* - Returns a list of the names of all topics
- *getCourseProperties(List<Course> courses, Function<Course, String> function)* - Returns all course objects transformed by the function
- *calculateGradesSummary(List<Course> courses, BinaryOperator<Double> operator)* - Returns the result of applying the operator across all average grades 
- *getCoursesYouCanTake(List<Course> courses, List<Course> takenCourses)* - Returns all subjects where you meet all the prerequisites (takenCourses represents here the topics you have previously taken) 