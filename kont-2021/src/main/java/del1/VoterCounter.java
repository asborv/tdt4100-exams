package del1;

public class VoterCounter {

	// Add any needed fields here
	public static final String TIE_RESULT = "TIE";

	/**
	 * Register a candidate to the poll
	 * 
	 * @param candidate the new candidate to add
	 */
	public void addCandidate(String candidate) {
		// TODO
	}

	/**
	 * Vote on a given candidate
	 * 
	 * @param candidate the candidate to vote on
	 * 
	 * @throws IllegalArgumentException if the candidate is not registered
	 */
	public void castVote(String candidate) {
		// TODO
	}

	/**
	 * Prints all the results in an arbitrary order. The results should be on the
	 * format {candidate name}-{number of votes for the candidate} with each
	 * candidate on a new line
	 * 
	 * Example output with two candidates, "Candidate1" with 7 votes, and
	 * "Candidate2" with 6 votes
	 * 
	 * Candidate1-7 
	 * Candidate2-6
	 */
	public String getFormattedResults() {
		// TODO
		return null;
	}

	/**
	 * Returns the number of votes a candidate has received
	 * 
	 * @param candidate the candidate to get number of votes for
	 * @return the number of votes the candidate has received. Returns null if the
	 *         candidate is not registered
	 */
	public Integer getNumberOfVotes(String candidate) {
		// TODO
		return 0;
	}

	/**
	 *
	 * @return the name of the candidate who won the election. If two or more
	 *         candidates got the same number of maximum votes, return the
	 *         TIE_RESULT field. Return null if there are no candidates.
	 */
	public String getWinner() {
		// TODO
		return null;
	}

	public static void main(String[] args) {
		String candidate1 = "CANDIDATE1";
		String candidate2 = "CANDIDATE2";
		VoterCounter counter = new VoterCounter();
		counter.addCandidate(candidate1);
		counter.addCandidate(candidate2);
		// Should print 0
		System.out.println(counter.getNumberOfVotes(candidate1));
		counter.castVote(candidate1);
		// Should print 1;
		System.out.println(counter.getNumberOfVotes(candidate1));
		// Should print CANDIDATE 1
		System.out.println(counter.getWinner());
		counter.castVote(candidate2);
		// Should print TIE
		System.out.println(counter.getWinner());
	}
}
