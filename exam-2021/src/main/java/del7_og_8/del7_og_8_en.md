# Part 7 - File Management


Take as a starting point the attached [Course](Course.java) class. This class does not need to be changed for the assignment. The course class has the following state:

- A name.
- An average grade.
- Other courses that are prerequisites to this course.

You should complete the [UniversityHandbook](UniversityHandbook.java) class's methods for being able to read
courses from file. Points will be awarded after the following achievement, so if you do not manage to do the whole task
you will get points for a partial solution.

1. Read the course name and average grade from the file.
2. Support adding prerequisite courses for courses that have been previously in the file.
3. Support adding prerequisite courses for courses that come later in the file.

Complete/implement the following methods:
- *readFromInputStream(InputStream stream)* - Reads a list of courses from a given inputstream (See the example file in src/main/java/resources/del7_og_8/courses.txt) for the structure of this input stream.)
-  *getCourse(String courseName)* - Returns the course with the given name. 


# Part 8 - Functional Interfaces and List Handling

Fill in the [UniversityHandbookUtils](UniversityHandbookUtils.java) methods of operating on a list of [Course](Course.java) objects.

Implement the following methods:
- *getCoursesWithPredicate(Collection<Course> courses, Predicate<Course> p)* - Returns all courses in the collection satisfying the predicate. 
- *getNonPrequisiteCourses(Collection<Course> courses)* - Returns all courses in the collection that does not have any prerequisites. 
- *containsImpossibleCourse(Collection<Course> courses)* - Returns whether the collection contains an impossible course. 
    An impossible course is defined as a Course X that has a prerequisite course, which has X as a prerequisite. 
