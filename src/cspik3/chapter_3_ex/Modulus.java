package cspik3.chapter_3_ex;
import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author chloe.spilker
 * 9/20/18
 */

public class Modulus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		int total;
		int whats_left;
		boolean gre_than_four;
		
		out.println("Enter the total amount of change: ");
		total = input.nextInt();
		out.println("");
		
		quarters = total / 25;
		whats_left = total % 25;
		
		dimes = whats_left / 10;
		whats_left = whats_left % 10;
		
		nickels = whats_left / 5;
		whats_left = whats_left % 5;
		
		pennies = whats_left;
		
		out.println("From your total of " + total + " cents, you have:");
		out.println(quarters + " quarters");
		out.println(dimes + " dimes");
		out.println(nickels + " nickels");
		out.println(pennies + " pennies");
		out.println("");
		
		out.println("True/False - You have enough quarters to make a dollar:");
		gre_than_four = quarters >= 4;
		out.println(gre_than_four);
		

	}

}
