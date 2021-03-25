import java.util.*;
class addsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String str="";
        int i=1;
        for(i=1;i<=s;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int a=i+(s-1);
        for(;i<=a;i++)
        {
            str+=i+" ";
        }
        int p=s;
        s=s*s;
        int count=0;
        for(;i<=s;i++)
        {
            if(count==p)
            {
            System.out.println();
            count=0;
            }
            System.out.print(i+" ");
            count++;
        }
        System.out.println();
        System.out.println(str);
    }
}