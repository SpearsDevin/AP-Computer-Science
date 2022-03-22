import java.util.*;
public class TestCandidate2 {
	private static int total;
	public static void main(String[] args) {
		
		List <Candidate2> election = new ArrayList<>();
		election.add( new Candidate2("John Smith", 5000));
		election.add( new Candidate2("Mary Miller", 4000));
		election.add( new Candidate2("Michael Duffy", 6000));
		election.add( new Candidate2("Tim Robinson", 2500));
		election.add( new Candidate2("Joe Ashtony", 1800));

		System.out.println("Results per candidate");
        System.out.println("______________________________");
        System.out.println();
        printVotes(election);
        System.out.println();
        
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
	}
	public static void printVotes(List<Candidate2> Election) {
		for(int i = 0; i < Election.size(); i++) {
	           System.out.println(Election.get(i));
		}
	}
	public static void getTotal(List<Candidate2> Election) {
		for(int i = 0; i < Election.size(); i++) {
	           total += Election.get(i).votes();
		}
		for(int i = 0; i < Election.size(); i++) {
			float test = (float)Election.get(i).votes() / total;
	        System.out.println(Election.get(i).getName()+"\t\t"+Election.get(i).votes()+"\t\t\t"+ (int)(test*100));
		}
        System.out.println("\nTotal number of votes in election: "+ total);
	}
}
