import java.util.Scanner;


public class pweer3 {
	public static void main(String o[]){
		int n,sum=0;
		int b[] = new int[100];
		int s[]=new int[100];
		
		int num=0,a,k=1;

		Scanner ac=new Scanner(System.in);
		n=ac.nextInt();
		while(n>0){
			a=n%10;
			b[num]=a;
			n=n/10;
			num++;
		}
		for(int i=0;i<num;i++){
			s[i]=1;
			for(int j=0;j<4;j++){
				s[i]*=b[i];
				
			
			}
			
			}
	for(int j=0;j<4;j++){
		
		System.out.println(s[j]);
	}for(int j=0;j<4;j++){
		sum=sum+s[j];
	}System.out.println("sum "+sum);
	
}
}
