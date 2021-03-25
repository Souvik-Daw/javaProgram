
/**
 * Write a description of class program1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class program1
{
    public int sum(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static void main()
    {
        program1 ob=new program1();
        int n=ob.sum(5,2);
        System.out.println("sum"+n);
    }
}
