package cspik3.chapter_3_ex;

import java.util.Scanner;

/**
 * @author chloe.spilker
 * 9/14
 * mad lib program
 */

public class Mad_lib {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// define variables
		String blank1;
		String blank2;
		String blank3;
		
		// user prompts and user input
		System.out.println("Enter a verb ending in 'ing':	");
		blank1 = input.nextLine();
		
		System.out.println();
		System.out.println("Enter a plural noun:	");
		blank2 = input.nextLine();
		
		System.out.println();
		System.out.println("Enter an adjective:	");
		blank3 = input.nextLine();
		
		// output
		System.out.println();
		System.out.println("There are too many " + blank1 + " " + blank2 + " on this " + blank3 + " plane!");

	}

}
