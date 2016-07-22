import java.util.Scanner;


public class vo {
	public static void main(String[] args) {
char f;
	  Scanner fa=new Scanner(System.in);
     f=fa.next().charAt(0);
	if(f=='a' || f=='o' ||  f=='i' ||  f=='e' ||  f=='u' ){
		System.out.println("vowel");
	}
	else{
		System.out.println("consonant");
	}
	
	}
}
