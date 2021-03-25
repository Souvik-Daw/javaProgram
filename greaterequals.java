import java.util.*;
public class greaterequals {
public static void main(String args[])
{
	int test,n,max=0,sum=0;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int k=0;k<test;k++)
	{
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		max=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(max>=arr[i])
			{
				sum++;
				System.out.print(sum);
			}
		}
		System.out.println();
		max=0;
		sum=0;
	}
}
}
