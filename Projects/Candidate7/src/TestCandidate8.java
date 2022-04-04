
/*
 * Devin Spears
 * 4/4/2022
 * this program deletes a location in the arraylist or deletes by a specefic name
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class TestCandidate8 {
	private static int total;
	public static void main(String[] args) {
		List <Candidate8> election = new ArrayList<>();
		
		election.add( new Candidate8("John Smith", 5000));
		election.add( new Candidate8("Mary Miller", 4000));
		election.add( new Candidate8("Michael Duffy", 6000));
		election.add( new Candidate8("Tim Robinson", 2500));
		election.add( new Candidate8("Joe Ashtony", 1800));
		election.add( new Candidate8("Mickey Jones", 3000));
		election.add( new Candidate8("Rebecca Morgan", 2000));
		election.add( new Candidate8("Kathleen Turner", 8000));
		election.add( new Candidate8("Tory Parker", 500));
		election.add( new Candidate8("Ashton Davis", 10000));

		System.out.println("Original Results:");
        System.out.println();    
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
        System.out.println();

        deleteByLoc(election, 6);
        System.out.println("Deleted location 6:");
        System.out.println();
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
        System.out.println();
        deleteByName(election, "Kathleen Turner");
        System.out.println("Deleted Kathleen Turner:");
        System.out.println();
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
        System.out.println();
	}

	public static void getTotal(List<Candidate8> Election) {
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
	
	public static void replaceName(List<Candidate8> Election, String find, String replace) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find))
	        	  Election.get(i).setName(replace);
	}
	
	public static void replaceVotes(List<Candidate8> Election, String find, int replace) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find))
	        	  Election.get(i).setVotes(replace);
	}
	
	public static void replaceCandidate(List<Candidate8> Election, String find, String replace, int vote) {
		 for(int i = 0; i < Election.size(); i++)
	          if (Election.get(i).getName().equals(find)) {
	        	  Election.get(i).setName(replace);
	        	  Election.get(i).setVotes(vote);
	          }
	}
	
	public static void insertPostion(List<Candidate8> Election, int find, String n, int v) {
		Election.add(find, new Candidate8(n, v));
	}
	public static void insertCandidate(List<Candidate8> Election, int find, String n, int v) {
		 int location = 0;
	        
	        // find location of item you want to insert before
	        for(int index = 0; index < Election.size(); index++)
	          if (Election.get(index).getName().equals(find))
	               location = index;
	               
	       // insert item into ArrayList
	        Election.add(find, new Candidate8(n, v));
	}
	public static void  deleteByLoc(List<Candidate8> Election, int l) {
		Election.remove(l);	
	}
	public static void deleteByName(List<Candidate8> Election, String find){
		int location = 0;
        int i;
        
        for(i = 0; i < Election.size(); i++)
          if (Election.get(i).getName().equals(find))
               {
                   location = i;
                   break;
                }         
       if (i != Election.size())
    	   Election.remove(location);
	}  

}
