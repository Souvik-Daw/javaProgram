import java.util.*;
public class thread
{
    public static void main()
    {
        System.out.println("Enter the string");
        Scanner Sc=new Scanner(System.in);
        String s=Sc.nextLine();
        System.out.println("Enter the time of delay in sec");
        int a=Sc.nextInt();
        int time=a*1000;
        int length=s.length();
        char ch=' ';
        for(int i=0;i<length;i++)
        {
            ch=s.charAt(i);
            System.out.print(ch);
            try
            {
                Thread.sleep(time);
            }
            catch(Exception e)
            {
            }
        }
    }
}