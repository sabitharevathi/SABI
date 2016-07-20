import java.util.Scanner;


public class patient {
String name;
double weigth;
double heigth;
Scanner o=new Scanner(System.in);
	
public String set()
{
	String r;
	 r=o.next();
	 	return r;
	 
	
}
public double setter()
{
	
	double a;

	a=o.nextDouble();
	return a;
}
public double setters()
{
	
	double b;
	
	b=o.nextDouble();
	return b;
}
public double BMI(double w,double h)
{
double bmi;
weigth=w;
heigth=h;
	bmi = ( weigth/( heigth*heigth)) *703; 
	return bmi;
}
public static void main(String p[]) 
{
	patient pp=new patient();
	
	double t[]=new double[10];
	String n[]=new String[10];
	double [] w=new double[10];
	double [] h=new double[10];
		for(int i=0;i<10;i++)
	{
			System.out.print("name of the patient");	
	n[i]=pp.set();
	System.out.print("weight");
	w[i]=pp.setter();
	System.out.print("height");
	h[i]=pp.setters();	
	t[i]=pp.BMI(w[i], h[i]);	
	System.out.println("name  "+n[i]+  "  BMI = "+t[i]);
	
	

	}
		for(int j=0;j<10;j++)
		{
			if(t[j]>=25)
			
				System.out.println("NAME ="+n[j]+    "  BMI = "+t[j] );
			}
		}
}

