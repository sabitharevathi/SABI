package player;

import java.util.Calendar;

public class player104 {
	public static void main(String args[]) {
		 
		// Create Calendar instance
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
 
		 
		c1.set(2012, 2, 12);
		c2.set(2011, 3, 12);
 
		 
		long  Date1 = c1.getTimeInMillis();
		long  Date2 = c2.getTimeInMillis();
 
		 
		long diff  =  Date1-  Date2;
  
 
		 
		long diffInDays = diff  / (24 * 60 * 60 * 1000);
 
		 
		System.out.println("Difference in Days : " + diffInDays);
 
	 
 
}
}
