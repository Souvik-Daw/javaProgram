class a
{
    int a;
    a(int a1)
    {
        a=a1;
    }
    void display()
    {
        System.out.println("in a"+a);
    }
}
public class b extends a
{
    int p;
    b(int b1)
    {
     super(6);
     p=b1;
    }
    void display1()
    {
        System.out.println("in b"+p);
    }
    public static void main(String args[])
    {
        b obj = new b(5);
        obj.display();
        obj.display1();
        
    }
}
