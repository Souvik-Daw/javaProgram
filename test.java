import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter breadth");
        int r=sc.nextInt();
        int q=(int)Math.sqrt(Math.pow(l,2)+Math.pow(r,2));
        System.out.println("diagonal "+q);
        int p=(l+r+q)/2;
        int area=(int)Math.sqrt(p+l+r+q);
        System.out.println("area "+area);
    }
}