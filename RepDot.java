import java.util.*;
public class RepDot {
	public static void main(String args[])
	{
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(int p=0;p<test;p++)
		{
			String s="";
			int l=0;
			s=sc.next();
			l=s.length();
			char arr[]=new char[l];
			System.out.println(s);
			for(int i=0;i<l;i++)
			{
				arr[i]=s.charAt(i);
			}
			int j=0;
			for(int i=0;i<l-1;i++)
			{
				char ch=s.charAt(i);
				arr[j]='.';
				for(int k=0;k<l;k++)
				System.out.print(arr[k]);
				System.out.println();
				j++;
			}
		}
	}
}
