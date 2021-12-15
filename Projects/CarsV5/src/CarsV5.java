
/*
 * Devin Spears
 * 12/15/2021
 * This program takes yours car mileage data and gives you the cost and GPM for the distance traveled. 
 */
public class CarsV5 {
	
	private String model;
	private int sMiles1, eMiles1,  dist1;
	private double gpm1, cost1, gals1, mpg1, price1;
	
	//Default constructor
	CarsV5(String car, int sMiles, int eMiles, double gals, int dist, double mpg, double cost, double gpm, double price ){
		model = car;
		sMiles1 = sMiles;
		eMiles1 = eMiles;
		gals1 = gals;
		dist1 = dist;
		mpg1 = mpg;
		cost1 = cost;
		gpm1 = gpm;
		price1 = price;
		
	}
	
	public static int calcDistance(int sMiles, int eMiles) {
		return eMiles - sMiles;
	}
	public static double calcMPG(int dist, double gals) {
		return dist/gals;
	}
	public static double calcGPM(int dist, double gals) {
		return gals/dist;
	}
	public static double totalCost(double price, double gals) {
		return gals*price;
	}
	
	public static void main(String[] args) {
		
		String car = "04 Volvo S60R";
		double gals = 18.5;
		int sMiles = 97865;
		int eMiles = 98217;
		int dist = calcDistance(sMiles, eMiles);
		double mpg = calcMPG(dist, gals);
		double price = 2.85;
		double cost = totalCost(price, gals);
		double gpm = calcGPM(dist, gals);
		CarsV5 car1 = new CarsV5(car, sMiles, eMiles, gals, dist, mpg, cost, gpm, price);

		 System.out.println("\t\t\t\t\t\tGas Mileage Calculations");
	     System.out.println("Type of Car\tStart Miles\tEnd Miles\tDistance\tGallons\t\tPrice\t\tCost\t\tMiles/Gal\tGal/Mile");
	     System.out.println("================================================================================================================================================");
	     System.out.printf("%10s %8d %15d %14d %15.1f %15.2f %15.2f %15.1f %16.3f", car1.model , car1.sMiles1, car1.eMiles1, car1.dist1, car1.gals1, car1.price1, car1.cost1,  car1.mpg1, car1.gpm1);
		
	}
	
}
