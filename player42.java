package player;

public class player42 {
	public static void main(String arg[]){
		String x1="sat";
		String y1="abate";
		String s1a=y1.replaceAll(x1,"");
	 
		if(s1a.equals(y1)){
			System.out.println("no substring");
		}else{
			System.out.println("there is subpart");
		}
		}
}
