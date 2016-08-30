package hunter;

public class hunte96 {
	public static void main(String arg[])
	{
	String w  = "java";
	int dd=0;
int a[]=new int[w .length()];
	for(int i =0;i<w.length();++i)
	{

	if(Character.isLowerCase(w.charAt(i))){
	a[dd]=((int)w.charAt(i) -(int)'a'+1);
	//System.out.println(a[dd]);
	dd++;
	}
	else{
	a[dd]=((int)w.charAt(i)-(int)'A' +1);
//	System.out.println(a[dd]);
	dd++;
	}
	}
	int en=a[w.length()-1];
//	System.out.println("the encrypt num is "+a[w.length()-1]);
	int b[]=new int[w.length()-1];
for(int j=0;j<w.length()-1;j++){
	b[j]=a[j]-en;
	if(b[j]<=0){
		b[j]=b[j]+26;
	}
//	System.out.println("brr[] "+b[j]);
}
 

char ar1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
for(int k=0;k<w.length()-1;k++){
System.out.print(ar1[b[k]-1]);
}
System.out.println(ar1[a[w.length()-1]-1]);
  
}
}
