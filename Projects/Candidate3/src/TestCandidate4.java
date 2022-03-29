import java.util.ArrayList;
import java.util.List;
/*
 * Devin Spears
 * 3/29/2022
 * This program replaces elements in an arraylist
 */
public class TestCandidate4 {
	private static int total;
	public static void main(String[] args) {
		
		List <Candidate4> election = new ArrayList<>();
		election.add( new Candidate4("John Smith", 5000));
		election.add( new Candidate4("Mary Miller", 4000));
		election.add( new Candidate4("Michael Duffy", 6000));
		election.add( new Candidate4("Tim Robinson", 2500));
		election.add( new Candidate4("Joe Ashtony", 1800));
		election.add( new Candidate4("Mickey Jones", 3000));
		election.add( new Candidate4("Rebecca Morgan", 2000));
		election.add( new Candidate4("Kathleen Turner", 8000));
		election.add( new Candidate4("Tory Parker", 500));
		election.add( new Candidate4("Ashton Davis", 10000))
		;
		System.out.println("Original Results:");
        System.out.println();    
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
        System.out.println();

        replaceName(election, "Michael Duffy", "John Elmos");
        System.out.println("Changing Michael Duffy to John Elmos:");
        System.out.println();
        getTotal(election);
        System.out.println();    

        replaceVotes(election, "Mickey Jones", 2500);
        System.out.println("Changing Michael Jones votes to 2500:");
        System.out.println();
        getTotal(election);
        System.out.println();    

        replaceCandidate(election, "Kathleen Turner","John Kennedy", 8500);
        System.out.println("Replacing Kathleen Turner with John Kennedy:");
        System.out.println();
        getTotal(election);
	}

	public static void getTotal(List<Candidate4> Election) {
		total = 0;
		for(int i = 0; i < Election.size(); i++) {
	           total += Election.get(i).votes();
		}
		for(int i = 0; i < Election.size(); i++) {
			float test = (float)Election.get(i).votes() / total;
	        System.out.println(Election.get(i).getName()+"\t\t"+Election.get(i).votes()+"\t\t\t"+ (int)(test*100));
		}
        System.out.println("\nTotal number of votes in election: "+ total);
	}
	
	public static void replaceName(List<Candidate4> Election, String find, String replace) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find))
	        	  Election.get(i).setName(replace);
	}
	
	public static void replaceVotes(List<Candidate4> Election, String find, int replace) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find))
	        	  Election.get(i).setVotes(replace);
	}
	
	public static void replaceCandidate(List<Candidate4> Election, String find, String replace, int vote) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find)) {
	        	  Election.get(i).setName(replace);
	        	  Election.get(i).setVotes(vote);
	          }
	}
}
