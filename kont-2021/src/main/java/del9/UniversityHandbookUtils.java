package del9;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class UniversityHandbookUtils {

	/**
	 * 
	 * @param courses List of course objects
	 * @return a list of course names
	 */
	public static Collection<String> getCourseNames(Collection<Course> courses) {
		// TODO
		return Arrays.asList();
	}

	/**
	 * 
	 * @param courses List of course objects
	 * @return a list of a course objects transformed by the function
	 */
	public static Collection<String> getCourseProperties(Collection<Course> courses,
			Function<Course, String> function) {
		// TODO
		return Arrays.asList();
	}

	/**
	 * 
	 * @param courses  a list of course objects
	 * @param operator a binary operator
	 * @return the result of applying the operator across all average grades
	 */
	public static double calculateGradesSummary(Collection<Course> courses, BinaryOperator<Double> operator) {
		// TODO
		return 0;
	}

	/**
	 * 
	 * @param courses      List of course objects
	 * @param takenCourses List of course objects
	 * @return a list of courses where takenCourses contains all prerequisites
	 *         needed to enroll in the course
	 */
	public static Collection<Course> getCoursesYouCanTake(Collection<Course> courses, Collection<Course> takenCourses) {
		// TODO
		return Arrays.asList();
	}

	public static void main(String[] args) {
		Course tdt4109 = new Course("TDT4109", 3.23);
		Course tdt4100 = new Course("TDT4100", 3.23);
		Course tdt4120 = new Course("TDT4120", 3.23);
		Course tdt1337 = new Course("TDT1337", 3.23);
		Course tdt3713 = new Course("TDT3713", 3.23);

		tdt4100.addPrequisite(tdt4109);
		tdt4120.addPrequisite(tdt4109);
		tdt4120.addPrequisite(tdt4100);
		tdt1337.addPrequisite(tdt3713);
		tdt3713.addPrequisite(tdt1337);
		List<Course> courses = Arrays.asList(tdt4109, tdt4100, tdt4120, tdt1337, tdt3713);

		// These two lines should print the same list of course names
		System.out.println(getCourseNames(courses));
		System.out.println(getCourseProperties(courses, c -> c.getCourseName()));

		// Should print 16.15
		System.out.println(calculateGradesSummary(courses, (prevGrade, currentGrade) -> prevGrade + currentGrade));

		// Should print tdt4109, tdt4100 (order does not matter)
		System.out.println(getCoursesYouCanTake(courses, Arrays.asList(tdt4109)));

	}

}
