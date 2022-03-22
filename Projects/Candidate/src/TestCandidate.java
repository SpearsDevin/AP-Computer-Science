
public class TestCandidate {
	private static int total;
	public static void main(String[] args) {
		
		Candidate[] election = new Candidate[5];
		
		election[0] = new Candidate("John Smith", 5000);
		election[1] = new Candidate("Mary Miller", 4000);
		election[2] = new Candidate("Michael Duffy", 6000);
		election[3] = new Candidate("Tim Robinson", 2500);
		election[4] = new Candidate("Joe Ashtony", 1800);

		System.out.println("Results per candidate");
        System.out.println("______________________________");
        System.out.println();
        printVotes(election);
        System.out.println();
        
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election);
	}
	public static void printVotes(Candidate[] list) {
		for(int i = 0; i < list.length; i++) {
	           System.out.println(list[i]);
		}
	}
	public static void getTotal(Candidate[] list) {
		for(int i = 0; i < list.length; i++) {
	           total += list[i].votes();
		}
		for(int i = 0; i < list.length; i++) {
			float test = (float)list[i].votes() / total;
	        System.out.println(list[i].getName()+"\t\t"+list[i].votes()+"\t\t\t"+ (int)(test*100));
		}
        System.out.println("\nTotal number of votes in election: "+ total);
	}
	
}
