package pro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pro21 {
	public static void main(String k[]){
		int a;
		Scanner abc=new Scanner(System.in);
		a=abc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=abc.nextInt();
		}ArrayList<Integer> aa=new ArrayList<Integer>();
		ArrayList<Integer> bb=new ArrayList<Integer>();
		for(int i=0;i<a;i++ ){
			for(int j=0;j<a;j++){
				if(b[i]!=b[j]){
					aa.add(b[i]);
				}
				else
				{
					bb.add(b[i]);
				}
			}
		}
		System.out.println(aa);
		System.out.println(bb);
		
	}

}
