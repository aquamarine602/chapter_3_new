package cspik3.chapter_3_ex;
import static java.lang.System.out;
import java.util.Scanner;

/**
 * @author chloe.spilker
 * 9/20/18
 */

public class Farenheit_to_Celcius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// which one would the user like to calculate
		out.println("Would you like to find Celsius (1) or Farenheit (2) ?");
		int answer = input.nextInt();
		out.println("");
		
		// if celsius
		if (answer == 1) {
			out.println("Enter the Celsius value:");
			double cel = input.nextDouble();
			double far = cel * 1.8 + 32;
			out.println("");
			out.println(cel + " Celsius is equal to " + far + " Farenheit.");
		}
		
		// if farenheit
		if (answer == 2) {
			out.println("Enter the Farenheit value:");
			double far = input.nextDouble();
			double cel = ((far - 32)*5)/9;
			out.println("");
			out.println(far + " Farenheit is equal to " + cel + " Celcius.");
		}
			
			
		
		

	}

}
