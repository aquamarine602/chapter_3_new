package cspik3.chapter_3_ex;
import java.util.Scanner;

/**
 * @author chloe.spilker
 * 9/14
 * calculate average
 */
public class Compute_average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double period1;
		double period2;
		double period3;
		double period4;
		double period5;
		double period6;
		double period7;
		double period8;
		double period9;
		double sum;
		double avg;
		
		//user prompt
		System.out.print("Enter your grades:");
		
		// get the user's scores
		period1 = input.nextDouble();
		period2 = input.nextDouble();
		period3 = input.nextDouble();
		period4 = input.nextDouble();
		period5 = input.nextDouble();
		period6 = input.nextDouble();
		period7 = input.nextDouble();
		period8 = input.nextDouble();
		period9 = input.nextDouble();
		
		
		// sum all scores
		sum = period1 + period2 +  period3 + period4 + period4 + period5 + period6 + period7 + period8 + period9;
		
		// divide by total
		avg = sum/10;
		
		// display output
		System.out.println(avg);

	}

}
