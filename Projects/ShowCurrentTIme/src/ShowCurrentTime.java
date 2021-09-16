public class ShowCurrentTime {
	public static void main(String[ ] args) {

	//Obtain the total milliseconds since midnight, Jan 1, 1970long 
	long totalMilliseconds=System.currentTimeMillis();
	//Obtain the total seconds since midnight, Jan 1, 1970long 
	long totalSeconds=totalMilliseconds/1000; 
	//Compute the current second in the minute in the hourlong 
	long currentSecond=totalSeconds % 60; 
	//Obtain the total minuteslong 
	long totalMinutes=totalSeconds/60; 
	//Compute the current minute in the hourlong 
	long currentMinute=totalMinutes % 60; 
	//Obtain the total hourslong 
	long totalHours=totalMinutes/60; 
	//Compute the current hourlong 
	long currentHour=totalHours % 24; 
	//Display 
	System.out.println( "Current time is " + currentHour +":"+ currentMinute +":"+ currentSecond);
	
	System.out.println(10/3.0F);
	} 

}