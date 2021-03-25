import java.util.*;
public class FirstCaps{
	public static void main(String args[])
	{
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		test=test+1;
		while(test--> 0)
		{ 
			String s="";
			int l=0;
			s=sc.nextLine();
			l=s.length();
			char arr[]=new char[l];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.charAt(i);
			}
			for(int i=0;i<l;i++)
		    {
				if(i==0)
					arr[i]=Character.toUpperCase(arr[i]);
				else if(arr[i-1]==' ')
		        {
		            arr[i]=Character.toUpperCase(arr[i]);
		        }
		        else
		        arr[i]=arr[i];
		    }
			for(int i=0;i<l;i++)
			{
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}
