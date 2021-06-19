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
		String tens[] = {"", "ten", "twenty", "thirty", "forty", "fifty"};
		
		if(LocalTime.MIDNIGHT.toString().equals(hour+"0:"+minute+0)) {
			return "It's Midnight";
		}
		if(LocalTime.NOON.toString().equals(hour+"0:"+minute+0)) {
			return "It's Midday";
		}
		
		String m = minute.toString();
		String a = ""; String b = "";
		if(m.length() == 2) {
			a = word[Integer.parseInt(m.substring(0,1))];
			b = word[Integer.parseInt(m.substring(1))];
			m =a + " " + b;
		} else {
			m = word[minute];
		}
		String time;
		if(hour > 12) {
			if(minute%10 == 0) {
				time = "It's " +  word[hour-12] + " :" + tens[minute/10];
			} else {
				time = "It's " +  word[hour-12] + " :" + m;
			}
			
		} else {
			time = "It's " +  word[hour] + " :" + m;
		}
		
		return time;
	}

}
