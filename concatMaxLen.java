import java.util.*;
public class concatMaxLen {
	public static void main(String args[])
	{
		int test;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter t");
		test=sc.nextInt();
		for(int p=0;p<test;p++)
		{
			String s="";
			String r="";
			int sl=0;
			int rl=0;
			System.out.println("enter 1st string");
			s=sc.next();
			System.out.println("enter 2nd string");
			r=sc.next();
			sl=s.length();
			rl=r.length();
			int max=0;
			String full="";
			if(sl>rl)
				max=sl;
			else
				max=rl;
			for(int i=0;i<sl;i++)
			{
				char ch=s.charAt(i);
				full=full+ch;
			}
			for(int i=0;i<rl;i++)
			{
				char ch=r.charAt(i);
				full=full+ch;
			}
			System.out.println("max length-"+max);
			System.out.println("Ans-"+full);
		}
	}
}
