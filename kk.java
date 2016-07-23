import java.util.Scanner;


public class kk {public static void main(String[] args) {
	
	String a;

	Scanner scanner = new Scanner(System.in);
	a=scanner.next();
	int i=0,j=a.length()-1;
	while(i<a.length()){
		if(a.charAt(i)!=a.charAt(j)){
			System.out.print(a.charAt(i));
			System.out.print(a.charAt(j));
			
		}
		else{
		System.out.print(a.charAt(i));}
		
		i++;
		j--;
		
	}
		
	}

}
