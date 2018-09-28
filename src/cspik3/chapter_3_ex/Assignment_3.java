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
		

	}

}
