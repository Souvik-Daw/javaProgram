import java.util.Scanner;
public class largestname {
	public static void main(String args[])
	{
		int test,n,pos=0,max=0;
		String s="";
		String arr[];
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(int k=0;k<test;k++)
		{
		n=sc.nextInt();
		if(n==1)
		{
			arr=new String[n];
			for(int p1=0;p1<n;p1++)
			{
				arr[p1]=sc.next();
			}
			System.out.println(arr[0]);
		}
		else
		{
		arr=new String[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
			s=arr[i];
			arr2[i]=s.length();
		}
		for(int p=0;p<n;p++)
		{
			if(max<=arr2[p])
				{
				max=arr2[p];
				pos=p;
				}
		}
			System.out.println(arr[pos]);
			max=0;
			pos=0;
		}
		}

		}
	}
