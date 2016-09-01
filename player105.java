package player;

import java.util.Calendar;

public class player105{
	public static void main(String args[]) {
		 
		// Create Calendar instance
		Calendar a1 = Calendar.getInstance();
		Calendar a2 = Calendar.getInstance();
 
		 
		a1.set(2012, 2, 12);
		a2.set(2011, 3, 12);
 
		 
		long  D1 = a1.getTimeInMillis();
		long  D2 = a2.getTimeInMillis();
 
		 
		long diff  =  D2 -  D1;
  
 
		 
		long  Days = diff  / (24 * 60 * 60 * 1000);
 
		 
		System.out.println("Difference in Days : " +  Days);
 
	 
 
}
}
