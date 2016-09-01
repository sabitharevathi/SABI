package player;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class player100 {
	public static void main(String dd[]) throws ParseException{
		SimpleDateFormat formate=new SimpleDateFormat("dd/MM/yyyy");
		
		String n;
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the DATE");
		n=abc.nextLine();
		System.out.println("enter the DATE2");
		String s;
		s=abc.nextLine();
		Date date=null;
		Date date1=null;
		try{
			date=formate.parse(n);
			date1=formate.parse(s);
		}catch(ParseException e){
			e.printStackTrace();
			}
		if(date.compareTo(date1)<0){
			SimpleDateFormat formate1=new SimpleDateFormat("MM/dd/yyyy");
			String ss=formate1.format(date)  ;
			 
			System.out.println(ss);
		}
		else{SimpleDateFormat formate1=new SimpleDateFormat("MM/dd/yyyy");
		String ss=formate1.format(date1)  ;
		 
		System.out.println(ss);
		}
		
	}
}
