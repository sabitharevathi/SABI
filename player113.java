package player;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class player113 {
	public static void main(String dd[]) throws ParseException{
		SimpleDateFormat formate =new SimpleDateFormat("dd/MM/yyyy");
		Scanner aa=new Scanner(System.in);
		System.out.println("enter the date");
		String s=aa.next();
		Date d=formate.parse(s);
		String ss=formate.format(d);
		if(ss.equals(s)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
