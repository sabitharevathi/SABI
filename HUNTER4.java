package hunter;

import java.util.Scanner;

public class HUNTER4 {
	public static void main(String sk[]){
		Scanner aa=new Scanner(System.in);
		int a;
		System.out.println("enter the size of array");
		a=aa.nextInt();
		int p[]=new int[a];
		int k=0;
System.out.println("enter the values");
int []n=new int[a];
int b=0;
for(int i=0;i<n.length;i++){
	n[i]=aa.nextInt();
	
}
for(int i=0;i<n.length;i++){
	int count=0;
	for(int j=0;j<n.length;j++){
		if(n[i]==n[j]){
			count++;
		}
		
	}
	if(count==1){
		 p[k]=n[i];
		 k++;
	}
}for(int i=0;i< k;i++){
	System.out.println(p[i]);
}

}
}