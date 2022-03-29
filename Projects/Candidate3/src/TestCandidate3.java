/*
 * Devin Spears
 * 3/29/2022
 * This program replaces elements in an array
 */
public class TestCandidate3 {

	private static int total;
	public static void main(String[] args) {
		Candidate3[] election = new Candidate3[10];
		
		election[0] = new Candidate3("John Smith", 5000);
		election[1] = new Candidate3("Mary Miller", 4000);
		election[2] = new Candidate3("Michael Duffy", 6000);
		election[3] = new Candidate3("Tim Robinson", 2500);
		election[4] = new Candidate3("Joe Ashtony", 1800);
		election[5] = new Candidate3("Mickey Jones", 3000);
		election[6] = new Candidate3("Rebecca Morgan", 2000);
		election[7] = new Candidate3("Kathleen Turner", 8000);
		election[8] = new Candidate3("Tory Parker", 500);
		election[9] = new Candidate3("Ashton Davis", 10000);

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

	public static void getTotal(Candidate3[] list) {
		total = 0;
		for(int i = 0; i < list.length; i++) {
	           total += list[i].votes();
		}
		for(int i = 0; i < list.length; i++) {
			float test = (float)list[i].votes() / total;
	        System.out.println(list[i].getName()+"\t\t"+list[i].votes()+"\t\t\t"+ (int)(test*100));
		}
        System.out.println("\nTotal number of votes in election: "+ total);
	}
	
	public static void replaceName(Candidate3[] list, String find, String replace) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find))
	               list[i].setName(replace);
	}
	
	public static void replaceVotes(Candidate3[] list, String find, int replace) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find))
	               list[i].setVotes(replace);
	}
	
	public static void replaceCandidate(Candidate3[] list, String find, String replace, int vote) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find)) {
	               list[i].setName(replace);
         			list[i].setVotes(vote);
	          }
	}

}
