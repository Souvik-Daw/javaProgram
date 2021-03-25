import java.util.*;
public class ConcatRevWord {
	public static void main(String args[])
	{
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(int p=0;p<test;p++)
		{
			String s="";
			String r="";
			String full="";
			int sl=0;
			int rl=0;
			//System.out.println("enter 1st string");
			s=sc.next();
			//System.out.println("enter 1st string");
			r=sc.next();
			sl=s.length();
			rl=r.length();
			for(int i=rl-1;i>=0;i--)
			{
				char ch=0;
				ch=r.charAt(i);
				full=full+ch;
			}
			for(int i=sl-1;i>=0;i--)
			{
				char ch=0;
				ch=s.charAt(i);
				full=full+ch;
			}
			System.out.println(full);
		}
	}
}
