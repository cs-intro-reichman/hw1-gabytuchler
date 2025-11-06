// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		int currentvalue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
        double ratepercent = rate / 100.0;
		int years = Integer.parseInt(args[2]);

		double futurevalueDouble = (currentvalue * (Math.pow((1.0 + ratepercent), years)));
		
		int futurevalueInt = (int) futurevalueDouble;
		
		System.out.println("After " + years + " years, $" + currentvalue + 
                           " saved at " + String.format("%.1f", rate) + "% will yield $" + 
                           futurevalueInt);

		
	}
}