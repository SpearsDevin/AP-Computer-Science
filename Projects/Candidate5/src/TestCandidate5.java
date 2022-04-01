/*
 * Devin Spears
 * 4/1/2022
 * this program inserts a new Candidate in the array
 */
public class TestCandidate5 {


	private static int total;
	public static void main(String[] args) {
		Candidate5[] election = new Candidate5[10];
		
		election[0] = new Candidate5("John Smith", 5000);
		election[1] = new Candidate5("Mary Miller", 4000);
		election[2] = new Candidate5("Michael Duffy", 6000);
		election[3] = new Candidate5("Tim Robinson", 2500);
		election[4] = new Candidate5("Joe Ashtony", 1800);
		election[5] = new Candidate5("Mickey Jones", 3000);
		election[6] = new Candidate5("Rebecca Morgan", 2000);
		election[7] = new Candidate5("Kathleen Turner", 8000);
		election[8] = new Candidate5("Tory Parker", 500);
		election[9] = new Candidate5("Ashton Davis", 10000);

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

	public static void getTotal(Candidate5[] list) {
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
	
	public static void replaceName(Candidate5[] list, String find, String replace) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find))
	               list[i].setName(replace);
	}
	
	public static void replaceVotes(Candidate5[] list, String find, int replace) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find))
	               list[i].setVotes(replace);
	}
	
	public static void replaceCandidate(Candidate5[] list, String find, String replace, int vote) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find)) {
	               list[i].setName(replace);
         			list[i].setVotes(vote);
	          }
	}
	public static void insertPostion(Candidate5[] list, int find, String n, int v) {
		for(int i = list.length - 1; i > find; i--)
	           list[i] = list[i-1];
		list[find] = new Candidate5(n, v);
		insertCandidate(list, find, n, v);
	
	}
	public static void insertCandidate(Candidate5[] list, int find, String n, int v) {
		int location = 0;
        
        // find location of item you want to insert before
        for(int i = 0; i < list.length; i++)
          if (list[i].getName().equals(find))
               location = i;
               
       //move items down in the array - last item is lost
       for(int index = list.length - 1; index > location; index--)
           list[index] = list[index-1];
       
       list[location] = new Candidate5(n, v);
	}

}
