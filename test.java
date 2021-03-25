import java.util.*;
class prog
{
	void display()
	{
		System.out.println("Test");
	}
}
public class test 
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		Integer i=new Integer(5);
		int a=Sc.nextInt();
		System.out.print(a);
	    prog obj = new prog();
	    obj.display();
	    Sc.close();
	}

}
