import java.util.Scanner;


public class player8 {
	public static void main(String  g[]){
		String s;
		Scanner abc=new Scanner(System.in);
		s=abc.next();
		int n;
		String ss[]=new String[s.length()];
		int p=0;
		for(int i=0;i<s.length();i++){
	String a=String.valueOf(s.charAt(i));
	n=s.charAt(i);
	if((n>=65)&&(n<=90)){
		ss[p]=a.toLowerCase();
		p++;
	}if((n>=97)&&(n<=122)){
		
		ss[p]=a.toUpperCase();
		p++;
	}
	
		}String sum="";
		for (int j=0;j<=p-1;j++){
		sum=sum+ss[j];
		
	}System.out.println(sum);
}
}