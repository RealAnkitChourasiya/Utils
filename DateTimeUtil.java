package uk.co.wowcher;

import java.time.LocalTime;

/****author 
 * 
 * @author Ankit Chourasiya 
 * Date 19/06/2021
 *
 */

public class DateTimeUtil {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(getTimeInWords(localTime));
	}
	
	/**** 
	 * Method accepts
	 * 24 hour clock
	 * and returns time in String
	 */
	public static String getTimeInWords(LocalTime localTime) {
		
		int hour = localTime.getHour();
		Integer minute = localTime.getMinute();
		
		String word[] = {"", "one", "two", "three", "four", "five", "six", "Seven", "eight", "nine", "ten", "eleven", "twelve"};
		
		if(LocalTime.MIDNIGHT.toString().equals(hour+":"+minute)) {
			return "It's Midnight";
		}
		if(LocalTime.NOON.toString().equals(hour+":"+minute)) {
			return "It's Midday";
		}
		
		String m = minute.toString();
		if(m.length() == 2) {
			String a = word[Integer.parseInt(m.substring(0,1))];
			String b = word[Integer.parseInt(m.substring(1))];
			m =a + " " + b;
		}
		
		String time = "It's " +  word[hour] + " " + m;
		
		return time;
	}

}
