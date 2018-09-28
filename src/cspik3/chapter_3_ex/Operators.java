package cspik3.chapter_3_ex;

import java.util.Scanner;

/**
 * @author chloe.spilker
 * 9/20/18
 * operators
 */

public class Operators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		System.out.println(i);
		
		// where the pluses and minuses go matter
		// pre incriment adds a one before its called, post adds one after
		int x = ++i;
		System.out.println(x);
		System.out.println("");
		System.out.println("");
		
		// casting = usually a byte + byte != a byte
		// declares that the answer WILL be a byte
		// if not then overflow error (when variable > a byte)
		System.out.println("Enter a value that will fit in a byte: ");
		byte user_byte = input.nextByte();
		byte add_byte = (byte) (user_byte + user_byte);
		System.out.println(add_byte);
		byte minus_byte = (byte) (user_byte - user_byte);
		System.out.println(minus_byte);
		int mult_byte = user_byte * user_byte;
		System.out.println(mult_byte);
		System.out.println("");
		System.out.println("");
		
		//int's will trunkate decimals
		// if there is an equation that ends in a decimal, int won't round, just remove decimal numbers
		System.out.println("Enter a value that will fit in a double: ");
		double user_double = input.nextDouble();
		
		System.out.println("Enter a value that will fit in an int: ");
		int user_int = input.nextInt();
		System.out.println("");
		
		int dev_int = (user_int + 54) / user_int;
		System.out.println(dev_int);
		
		double dev_doub = (user_double) % user_int;
		System.out.println(dev_doub);

	}

}
