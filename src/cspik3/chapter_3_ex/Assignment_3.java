package cspik3.chapter_3_ex;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * @author chloe.spilker
 * 9/28/18
 * assignment 3
 */

public class Assignment_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// CODING SECTION
		out.println("CODING SECTION");
		out.println();
		
		// 1.
		out.println("Program 1");
		out.println("---------");
		
			// takes celcius input and calculates farenheit, displays farenheit output
		out.println("Enter the Celsius value:");
		double cel = input.nextDouble();
		double far = cel * 1.8 + 32;
		out.println();
		out.println(cel + " Celsius is equal to " + far + " Farenheit.");
		
		out.println();
		out.println();
		
		
		// 2.
		out.println("Program 2");
		out.println("---------");
		
			// takes input from user
		out.println("Enter the radius of the cylinder:");
		double cyl_rad = input.nextDouble();
		out.println("Enter the length of the cylinder:");
		double cyl_len = input.nextDouble();
		out.println();
		
			// calculates area and volume
		double PI = 3.1415926;
		double area = PI * cyl_rad * cyl_len;
		double volume = area * cyl_len;
		
			// displays calculation output
		out.println("The area is: " + area);
		out.println("The volume is: " + volume);
		
		out.println();
		out.println();
		
		
		// 3.
		out.println("Program 3");
		out.println("---------");
		
			// user input
		out.println("Enter the amount of feet:");
		double feet = input.nextDouble();
		
			// calculate meters
		double meters = feet * 0.305;
		
			// display meters
		out.println();
		out.println(feet + " feet is equal to " + meters + " meters.");
		
		out.println();
		out.println();
		
		
		// 4.
		out.println("Program 4");
		out.println("---------");
		
			// user input
		out.println("Enter the weight in pounds:");
		double lbs = input.nextDouble();
		
			// calculate kilos
		double kilos = lbs * 0.454;
		
			// display kilos
		out.println();
		out.println(lbs + " pounds is equal to " + kilos + "kilograms.");
		
		out.println();
		out.println();
		
		
		
		// GROUP SECTION
		out.println();
		out.println("GROUP SECTION");
		out.println();
		
		// 5.
		out.println("Program 5");
		out.println("---------");
		
			// user input
		out.println("Enter the starting velocity:");
		double v0 = input.nextDouble();
		out.println("Enter the ending velocity:");
		double v1 = input.nextDouble();
		out.println("Enter the timespan in seconds:");
		double time = input.nextDouble();
		
			// calculate acceleration
		double accel = (v1 - v0) / time;
		
			// display acceleration
		out.println();
		out.println("The average acceleration is " + accel);
		
		// 7.
		out.println("Program 7");
		out.println("---------");
		
			// user input
		out.println("Enter the subtotal:");
		double subtotal = input.nextDouble();
		out.println("Enter the gratuity rate:");
		double grat_rate = input.nextDouble();
		
		out.printf("%.2f", subtotal);
		out.print(subtotal);
		
		
		
		
	}

}
