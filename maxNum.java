import java.util.*;
public class maxNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.");
        int a=sc.nextInt();//6
        System.out.println("Enter second no.");
        int b=sc.nextInt();//6
        System.out.println("Enter third no.");
        int c=sc.nextInt();//4
        if(a>=b && a>=c)
        {
            System.out.println("a is greater");
        }
        else if(b>=a && b>=c)
        {
            System.out.println("b is greater");
        }
        else 
        {
            System.out.println("c is greater");
        }
    }
}
