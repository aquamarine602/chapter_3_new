package cspik3.chapter_3_ex;

/**
 * @author chloe.spilker
 * 9/18/18
 * variables
 */

public class Example_variables {
	
	// classes always capitcal letter
	// constants in all captical letters
	// variables in all lowercase letters

	public static void main(String[] args) {
		
		// datatype variable_name;   <-how to delare a variable
		int num1;			// whole numbers							32 bits
		double num2;		// number fractions							64 bits
		char char1;			// single character (in apostrophes)		8 bits
		boolean boo1;		// true-false statements					64 bits
		
		//whole numbers
		byte x1;	// -128 to 127										8 bits
		short x2;	// -32768 to 32767									16 bits
		int num3;	// -2147483648 to 2147483647						32 bits
		long x3;	// -9223372036854775808 to 9223372036854775808		64 bits
		
		//real numbers
		double num4;	// -1.7976931348623157E +308 to -409e-324		64 bits
		float x4;		// -3.4028235E +38 to -1.4E -45					32 bits
		
		String x5;	// not primative data type							64 bits
		
		// giving the variables values
		num1 = 10;
		num2 = 3.754;
		char1 = 'f';
		boo1 = true;
		
		// mathmatical functions
		num1 = num1 + num1;
		num1 = (6*5)*9*(5+4);
		
		// declaring variables in the same line
		int x, y, j, k;
		x = y = j = k = 5;
		
		int z = 50;
		
		System.out.println(x = 7);
		
		
		
		// operators
		
		// augmented operator
		int count;
		count = 1;
		count = count + 1;
		count += 1;
		
		// incriment operator
		count ++;	// increases by one
		count --;	// decreases by one
		// post incriment
		++ count;
		-- count;
		
		x = count ++;
		System.out.println(x);
		x = count ++;
		System.out.println(x);
		
	}

}
