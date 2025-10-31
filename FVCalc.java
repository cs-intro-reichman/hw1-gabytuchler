// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		//הקלט
		int currentvalue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
        double ratepercent = rate / 100.0;
		int years = Integer.parseInt(args[2]);

		//חישוב סכום עתידי 
		double futurevalueDouble = (currentvalue * (Math.pow((1.0 + ratepercent), years)));
		
		// העברה של סכום עתידי לשלם
		int futurevalueInt = (int) futurevalueDouble;
		
		//הדפסת פלט
		System.out.println("After " + years + " years, $" + currentvalue + 
                           " saved at " + ratepercent + "% will yield $" + 
                           futurevalueInt);

		
	}
}