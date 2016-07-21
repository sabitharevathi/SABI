import java.util.Scanner;


public class SUM {
public static void main(String jk[]){
	int a,sum=0;
	Scanner ss=new Scanner(System.in);
	a=ss.nextInt();
	for(int i=a;i>=0;i--){
		sum=sum+i;
	}System.out.println(sum);
}
}
