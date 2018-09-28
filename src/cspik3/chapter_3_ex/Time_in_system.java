package cspik3.chapter_3_ex;
import static java.lang.System.out;

/**
 * @author chloe.spilker
 * 9/28/18
 * shows time
 */

public class Time_in_system {

	public static void main(String[] args) {
		//current time in milliseconds
		long total_milliseconds = System.currentTimeMillis();
		
		//finds seconds from milliseconds
		long total_seconds = total_milliseconds / 1000;
		long current_second = total_seconds % 60;
		
		//finds minutes from seconds
		long total_minutes = total_seconds / 60;
		long current_minute = total_minutes % 60;
		
		//finds hours from minutes
		long total_hours = total_minutes / 60;
		long current_hour = total_hours % 24;
		
		//displays information
		out.println("TIME STUFF");
		out.println("----------");
		out.println();
		
		out.println("The total milliseconds are: " + total_milliseconds);
		out.println();
		
		out.println("The total seconds are: " + total_seconds);
		out.println("The current second is: " + current_second);
		out.println();
		
		out.println("The total minutes are: " + total_minutes);
		out.println("The current minute is: " + current_minute);
		out.println();
		
		out.println("The total hours are: " + total_hours);
		out.println("The current hour is: " + current_hour);
		out.println();

		out.println("The time somewhere else is:");
		out.println(current_hour + ":" + current_minute + ":" + current_second);
		out.println();
		out.println();
		
		//calculates and prints our time
		out.println("The time is:");
		current_hour -= 6;
		out.println(current_hour + ":" + current_minute + ":" + current_second);

	}

}
