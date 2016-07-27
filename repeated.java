import java.util.Scanner;


public class repeated {
	public static void main(String jd[]){
		String s;
		Scanner abc=new Scanner(System.in);
		s=abc.next();
		int h=0;
		int []p=new int[s.length()];
		for(int i=0;i<s.length();i++){
			int count=0;
		
			for(int k=0;k<s.length();k++){
				if(s.charAt(i)==s.charAt(k)){
					count++;
				}p[h]=count;
				h++;
		}
}
		
		
		for(int j=0;j<h;j++)
		{
			for(int k=j+1;k<h;k++)
			{
				if(p[j]>p[k]){
					int tmp=p[j];
		
					p[j]=p[k];
					p[k]=tmp;
					}
		System.out.println(p[h-1]);
			}
		}
	}
}

