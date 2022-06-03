package del4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AthleteComparators {

	/**
	 * @return a comparator that compares athletes based on their name. Using this
	 *          comparator, Ane should come before Berit
	 */
	public static Comparator<Athlete> getSimpleComparator() {
		// TODO
		return null;
	}

	/**
	 * @return A comparator that compares athletes based on the number of medals of
	 *          different valour. The comparator will be used for sorting athletes
	 *          based on putting the athlete with the highest number of medals of the best valour
	 *          first.
	 * 
	 *          If one athlete has more "Gold" medals than the other athlete it
	 *          should come before that one. If they have equal number of "Gold"
	 *          medals they should be compared on the number of "Silver" medals, and
	 *          if that is equal on the number of "Bronze" medals. If they have the
	 *          same number of medals of all valour, they should be compared based
	 *          on the name similar to getSimpleComparator
	 *          
	 *          The spelling and order of the medals can be seen in the list validMetals in the Medal class. 
	 */
	public static Comparator<Athlete> getAdvancedComparator() {
		// TODO
		return null;
	}

	public static void main(String[] args) {
		Medal gold = new Medal("Gold");
		Medal silver = new Medal("Silver");
		Medal bronze = new Medal("Bronze");
		Athlete athlete1 = new Athlete("test", "Athlete", Arrays.asList(gold));
		Athlete athlete2 = new Athlete("test", "Bathlete", Arrays.asList());
		Athlete athlete3 = new Athlete("test", "Cathlete", Arrays.asList(gold, gold));
		Athlete athlete4 = new Athlete("test", "Dathlete", Arrays.asList(gold, silver, silver));
		Athlete athlete5 = new Athlete("test", "Eathlete", Arrays.asList(gold, silver, silver, bronze));
		List<Athlete> athletes = Arrays.asList(athlete1, athlete2, athlete3, athlete4, athlete5);
		// Hint - a more useful toString method of Athletes will yield a more readable
		// output here.
		Collections.sort(athletes, getSimpleComparator());
		System.out.println(athletes);
		Collections.sort(athletes, getAdvancedComparator());
		System.out.println(athletes);

	}

}
