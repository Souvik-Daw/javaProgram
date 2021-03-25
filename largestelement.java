import java.util.*;
public class largestelement {
public static void main(String args[])
{
	int test,n,max=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("");
	test=sc.nextInt();
	for(int i=0;i<test;i++)
	{
		System.out.println("");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("");
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			
			if(max<=arr[j])
				max=arr[j];
		}
		System.out.println(""+max);
		max=0;
	}
}
}
