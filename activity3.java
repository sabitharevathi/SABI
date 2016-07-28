import java.util.Scanner;


public class activity3 {
	public static void main(String kk[]){
		String a;
		String b;
		
		int j=0,k=0,count =0;
		Scanner aa=new Scanner(System.in);
		System.out.println("enter the 1 string");
		a=aa.next();
		String p[] =new String[a.length()];
		System.out.println("enter the  2 string");
		b=aa.next();
		String bb[]=new String[b.length()];
		for(int i=0;i<a.length()-1;i++){
	    p[j]=a.substring(i,i+2);
		j++;
		}for(int i=0;i<b.length()-1;i++){
			 bb[k]=b.substring(i,i+2);
			 k++;
		}for(int i=0;i<a.length()-1;i++){
			for(int l=0;l<b.length()-1;l++){
				if((p[i].equals(bb[l]))){
					
					count++;
					
				}
				
			}
		
			}if(count>0){
				System.out.println("true");
			}
			else{
				System.out.println("No sub  strings  present");
			}
		
		}
	}
