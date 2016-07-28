import java.util.Scanner;


public class count31 {
	public static void main(String g[]){
		String s;
		Scanner abc=new Scanner(System.in);
		s=abc.nextLine(); //System.out.println(s);
		String l[]=s.split(" ");
	
		int len=l.length;
		int sum=0;
		for(int i=0;i<len;i++){	
			sum=sum+l[i].length();
			
	}System.out.println(sum);
		}
}