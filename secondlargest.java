import java.util.*;
public class secondlargest {
public static void main(String args[])
{
	int test,n,temp=0;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int j=0;j<test;j++)
	{
	n=sc.nextInt();
	int arr[]=new int[n];
	if(n==1)
		{
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[n-1]);
		}
	else
	{
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int k=1;k<(n-i);k++)
		{
			if(arr[k-1]>arr[k])
			{
				temp=arr[k-1];
				arr[k-1]=arr[k];
				arr[k]=temp;
			}
		}
	}
	System.out.println(arr[n-2]);
	}
	}
}
}
