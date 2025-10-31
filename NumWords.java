// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		int n = Integer.parseInt(args[0]);

		int hundreds = n/100; // חילוק במאה 
		int tens = n/10%10; // חילוק בעשר ואז שארית החלוקה היא ספרת העשיריות
		int ones = n%10; //ספרת היחידות היא שארית החלוקה בעשר

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
