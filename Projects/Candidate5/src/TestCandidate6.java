import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
/*
 * Devin Spears
 * 4/1/2022
 * this program inserts a new Candidate in the arraylist
 */
public class TestCandidate6 {


	private static int total;
	public static void main(String[] args) {
		List <Candidate6> election = new ArrayList<>();
		
		election.add( new Candidate6("John Smith", 5000));
		election.add( new Candidate6("Mary Miller", 4000));
		election.add( new Candidate6("Michael Duffy", 6000));
		election.add( new Candidate6("Tim Robinson", 2500));
		election.add( new Candidate6("Joe Ashtony", 1800));
		election.add( new Candidate6("Mickey Jones", 3000));
		election.add( new Candidate6("Rebecca Morgan", 2000));
		election.add( new Candidate6("Kathleen Turner", 8000));
		election.add( new Candidate6("Tory Parker", 500));
		election.add( new Candidate6("Ashton Davis", 10000));

		System.out.println("Original Results:");
        System.out.println();    
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
        System.out.println();

        /*replaceName(election, "Michael Duffy", "John Elmos");
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
        */
        insertPostion(election, 5, "Mickey Duck", 14000);
        System.out.println("Added Mickey Duck, 14000 votes:");
        System.out.println();
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
        System.out.println();
        
        insertPostion(election, 8, "Donald Mouse", 2500);
        System.out.println("Added Donald Mouse, 2500 votes:");
        System.out.println();
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
        System.out.println();
	}

	public static void getTotal(List<Candidate6> Election) {
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
	
	public static void replaceName(List<Candidate6> Election, String find, String replace) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find))
	        	  Election.get(i).setName(replace);
	}
	
	public static void replaceVotes(List<Candidate6> Election, String find, int replace) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find))
	        	  Election.get(i).setVotes(replace);
	}
	
	public static void replaceCandidate(List<Candidate6> Election, String find, String replace, int vote) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find)) {
	        	  Election.get(i).setName(replace);
	        	  Election.get(i).setVotes(vote);
	          }
	}
	
	public static void insertPostion(List<Candidate6> Election, int find, String n, int v) {
		Election.add(find, new Candidate6(n, v));
	}
	public static void insertCandidate(List<Candidate6> Election, int find, String n, int v) {
		 int location = 0;
	        
	        // find location of item you want to insert before
	        for(int index = 0; index < Election.size(); index++)
	          if (Election.get(index).getName().equals(find))
	               location = index;
	               
	       // insert item into ArrayList
	        Election.add(find, new Candidate6(n, v));
	}

}
