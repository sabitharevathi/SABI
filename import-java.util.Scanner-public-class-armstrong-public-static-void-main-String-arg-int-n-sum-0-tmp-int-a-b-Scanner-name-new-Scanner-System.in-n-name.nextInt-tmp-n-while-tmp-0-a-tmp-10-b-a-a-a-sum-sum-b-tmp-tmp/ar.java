import java.util.Scanner;


public class armstrong {
	public static void main(String [ ] arg){
		int n,s=0,t;
		int ai,bi;	
		Scanner name=new Scanner(System.in);
		n=name.nextInt();
		tmp=n;
		while(tmp!=0)
		{
			ai=t%10;
			bi=ai*ai*ai;
			s=s+bi;
			t=t/10;
		}
		System.out.println(s);
		if(n==s)
		{
			System.out.println("the number is armstrong");
		}
		else
		{
			System.out.println("the number is not armstrong");
		}
	}
}
