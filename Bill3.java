// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2]; 
		Double bill = Double.parseDouble(args[3]);
		
		Double splitbill = (bill/(3.0));
		
		Double splitbillround = Math.ceil(splitbill);
		
		System.out.println("Dear" +" "+ name3 + " , " + name2 + " , " + name1 +" "+ "pay" + " " +splitbillround +" "+ "Shekels each.");

	}
}
