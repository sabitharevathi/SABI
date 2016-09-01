package player;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class player120 {
	public static void main(String dd[]) throws ParseException{
		SimpleDateFormat formate =new SimpleDateFormat("HH:mm  ");
		Scanner aa=new Scanner(System.in);
		System.out.println("enter the date");
		String sss=aa.next();
		Date d=formate.parse(sss);
		String ssA=formate.format(d);
		if(ssA.equals(sss)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
