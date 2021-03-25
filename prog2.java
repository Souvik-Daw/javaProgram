import java.util.*;
interface a
{
	 void show();
}
interface b
{
	void display();
}
class prog2 implements a,b
{
	public void show()
	{
		System.out.println("in a");
	}
	public void display()
	{
		System.out.println("in b");
	}
	
 public void abc()
 {

	 System.out.println("abc");
 }
 public static void main(String args[])
 {
	 prog2 obj2=new prog2();
	 obj2.abc();
	 a obj=new prog2();
	 b obj3=new prog2();
	 obj.show();
	 obj3.display();
	 
 }
}