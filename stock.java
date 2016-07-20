
public class stock {
String name;
String sysmbol;
double pprice;
double cprice;
stock()
{
	name="sugar";
	sysmbol="$";
	pprice=100;
	cprice=150;	
	System.out.println("name of stock="+name+"  "+"sysmbol="+sysmbol+"  "+"previous price = "+pprice+"current price = "+"  "+cprice);
}
public double getChangePercentage() 
{
	double b,a;
	a=(double)cprice-pprice;
	b=(a/pprice)*100;
	return b;
}
public static void main(String s[])
{double c;
	stock pp=new stock();
	
	c=pp. getChangePercentage() ;
			System.out.println("percentage is  "+c+"%");
	
}
}
