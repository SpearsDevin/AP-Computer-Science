
public class Candidate2 {
	private int numVotes;
	private String names;
	public Candidate2(String n, int i) {
		numVotes = i;
		names = n;
	}
	public String getName() {
		return names;
	}
	public int votes() {
		return numVotes;
	}
	public String toString() {
		return names + " received " + numVotes+ " votes.";
	}
}
