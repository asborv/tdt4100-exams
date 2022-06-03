package del7_og_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class UniversityHandbookUtils {

	/**
	 * Get all courses that matches the given predicate
	 * 
	 * @param courses The list of courses to check for
	 * @param p       The predicate that should be matched on
	 *
	 * @return A collection of courses that satisfy the predicate.
	 */
	public static Collection<Course> getCoursesWithPredicate(Collection<Course> courses, Predicate<Course> p) {
		// TODO
		return new ArrayList<>();
	}

	/**
	 * Get all courses that does not have any prerequisites
	 * 
	 * @param courses The list of courses to check for
	 * @return A collection of course without any prerequisites
	 */
	public static Collection<Course> getNonPrequisiteCourses(Collection<Course> courses) {
		// TODO
		return new ArrayList<>();

	}
	
	/**
	 * Returns whether the handbook contains an impossible course. A course is
	 * deemed impossible if any of the prerequisite of the course has the current
	 * course as a prerequisite. Only direct dependencies need to be checked. You
	 * do not need to worry about transitive dependencies. That means if TDT4100 has
	 * a dependency on TDT4110 and TDT4110 has a dependency on TDT4100 it is impossible.
	 * 
	 * A transitive dependency that does not need to be checked is if TDT4100 has a
	 * dependency on TDT4110, TDT4110 has dependency on TDT4200 and TDT4200 has a
	 * dependency on TDT4100.
	 * 
	 * @param courses The list of courses to check for
	 * @return whether the courses contains an impossible course
	 */
	public static boolean containsImpossibleCourse(Collection<Course> courses) {
		// TODO
		return false;
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
		List<Course> coursesWithImpossible = Arrays.asList(tdt4109, tdt4100, tdt4120, tdt1337, tdt3713);
		List<Course> nonImpossibleCourses = Arrays.asList(tdt4109, tdt4100, tdt4120);
		
		System.out.println(UniversityHandbookUtils.getCoursesWithPredicate(coursesWithImpossible, c -> c.getCourseName().contains("TDT")));
		System.out.println(UniversityHandbookUtils.getNonPrequisiteCourses(coursesWithImpossible));
		System.out.println(UniversityHandbookUtils.containsImpossibleCourse(coursesWithImpossible));
		System.out.println(UniversityHandbookUtils.containsImpossibleCourse(nonImpossibleCourses));


		

	} 

}
