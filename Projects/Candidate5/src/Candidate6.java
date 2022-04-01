
public class Candidate6 {
	private int numVotes;
	private String names;
	public Candidate6(String n, int i) {
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
	public void setName(String n)
    {
        names = n;
    } 
	public void setVotes(int num)
    {
		numVotes = num;
    }
}
