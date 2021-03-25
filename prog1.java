

public class prog1 {
	private int a=5;
	String s="Souvik";
	
	public void show()
	{
		System.out.println("In side package");
	}
public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
public static void main()
{
	int b;
	prog1 obj=new prog1();
	obj.show();
}
}
