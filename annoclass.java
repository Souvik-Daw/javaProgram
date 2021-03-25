
interface qwert{
	public void show();
}
class abc implements qwert
{
	public void show()
	{
		System.out.println("In abc show");
	}
}
public class annoclass
{
	public static void main(String args[])
	{
		qwert a=() ->System.out.println("In annoclass show");//lambda expression
		System.out.println("test show");
		a.show();
		
	}
}
