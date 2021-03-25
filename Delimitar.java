import java.util.*;
public class Delimitar {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	sc.useDelimiter("[^0-9]+");
	int s=0;
	while(sc.hasNextInt())
	{
		s=sc.nextInt();
		System.out.println(s);
	}
	System.out.println(s);
	
}
}
