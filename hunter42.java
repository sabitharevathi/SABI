import java.util.Scanner;


public class hunter42 {
	private static Scanner abc;

	public static void main(String  g[]){
		String s;
		String ss[]=new String[10];
		char[] i=new char[10];
		int p=0,a=-1,k=0;
		abc = new Scanner(System.in);
		
		s=abc.next();
		for(int j=0;j<s.length();j++){
			char c=s.charAt(j);
			
			if((c>=65)&&(c<=90)||(c>=97)&&(c<=122)){
				ss[p]=String.valueOf(c);
			
				p++;
				a++;k++;
			}
			if((c>=48)&&(c<=57)){
				
				i[a]+=c;
			}
		}System.out.println(p+" "+k);
	System.out.println("l"+i[0]);
		for(int j=0;j<k;j++){
			System.out.println(i[j]);
			long k1=i[j];
		
	
		for(int gg= (int) (k1-1);gg>=0;gg--){	System.out.print(ss[j]);
		System.out.println(gg);
	
		gg--;
		}
		
		}
		
	}
		

}