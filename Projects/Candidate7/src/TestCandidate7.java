/*
 * Devin Spears
 * 4/4/2022
 * this program deletes a location in the array or deletes by a specefic name
 * 
 */
public class TestCandidate7 {



	private static int total;
	public static void main(String[] args) {
		Candidate7[] election = new Candidate7[10];
		
		election[0] = new Candidate7("John Smith", 5000);
		election[1] = new Candidate7("Mary Miller", 4000);
		election[2] = new Candidate7("Michael Duffy", 6000);
		election[3] = new Candidate7("Tim Robinson", 2500);
		election[4] = new Candidate7("Joe Ashtony", 1800);
		election[5] = new Candidate7("Mickey Jones", 3000);
		election[6] = new Candidate7("Rebecca Morgan", 2000);
		election[7] = new Candidate7("Kathleen Turner", 8000);
		election[8] = new Candidate7("Tory Parker", 500);
		election[9] = new Candidate7("Ashton Davis", 10000);

		System.out.println("Original Results:");
        System.out.println();    
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election, 0);
        System.out.println();

        deleteByLoc(election, 6);
        System.out.println("Deleted location 6:");
        System.out.println();
        System.out.println();
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election, 1);
        System.out.println();
        deleteByName(election, "Kathleen Turner");
        System.out.println("Deleted Kathleen Turner:");
        System.out.println();
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        getTotal(election, 2);
        System.out.println();
	}

	public static void getTotal(Candidate7[] list,int  n) {
		total = 0;
		
		for(int i = 0; i < list.length - n; i++) {
	           total += list[i].votes();
		}
		for(int i = 0; i < list.length - n; i++) {
			float test = (float)list[i].votes() / total;
	        System.out.println(list[i].getName()+"\t\t"+list[i].votes()+"\t\t\t"+ (int)(test*100));
		}
        System.out.println("\nTotal number of votes in election: "+ total);
        
	}
	
	public static void replaceName(Candidate7[] list, String find, String replace) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find))
	               list[i].setName(replace);
	}
	
	public static void replaceVotes(Candidate7[] list, String find, int replace) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find))
	               list[i].setVotes(replace);
	}
	
	public static void replaceCandidate(Candidate7[] list, String find, String replace, int vote) {
		 for(int i = 0; i < list.length; i++)
	          if (list[i].getName().equals(find)) {
	               list[i].setName(replace);
         			list[i].setVotes(vote);
	          }
	}
	public static void insertPostion(Candidate7[] list, int find, String n, int v) {
		for(int i = list.length - 1; i > find; i--)
	           list[i] = list[i-1];
		list[find] = new Candidate7(n, v);
		insertCandidate(list, find, n, v);
	
	}
	public static void insertCandidate(Candidate7[] list, int find, String n, int v) {
		int location = 0;
        
        // find location of item you want to insert before
        for(int i = 0; i < list.length; i++)
          if (list[i].getName().equals(find))
               location = i;
               
       //move items down in the array - last item is lost
       for(int index = list.length - 1; index > location; index--)
           list[index] = list[index-1];
       
       list[location] = new Candidate7(n, v);
	}
	public static void  deleteByLoc(Candidate7[] list, int l) {
       if ((l > 0) && (l < list.length))
          {
              for(int i = l; i < list.length -1; i++)
                  list[i] = list[i + 1];
       
              list[list.length-1] = null;
          }
		
	}
	public static void deleteByName(Candidate7[] list, String find){
		int location = 0;
        int index;
        
        for(index = 0; index < list.length; index++)
          if ((list[index] != null) && (list[index].getName().equals(find)))
               { 
                   location = index;
                   break;
                }
          else if (list[index] == null)
                {
                    location = -1;
                    break;
                }
          
       if ((index != list.length) && (location >= 0))       
        { //move items up in the array 
          for(index = location; index < list.length -1; index++)
             list[index] = list[index + 1];
       
           list[list.length-1] = null;
        }
	}  

}
