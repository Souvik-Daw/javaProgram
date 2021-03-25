import java.util.*;
public class sortedornot {
public static void main(String args[])
{
	int test,n,temp=0,c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of test case");
	test=sc.nextInt();
	for(int i=0;i<test;i++)
	{
	System.out.println("enter the no. of elements");
	n=sc.nextInt();
	int arr[]=new int[n];
	int arr2[]=new int[n];
	System.out.println("enter the array");
	for(int k=0;k<n;k++)
		arr[k]=sc.nextInt();
	for(int k=0;k<n;k++)
		arr2[k]=arr[k];
	for(int i1=0;i1<n-1;i1++)
	{
		for(int j=0;j<n-1-i1;j++)
		{
			if(arr2[j]>arr2[j+1])
			{
				temp=arr2[j];
				arr2[j]=arr2[j+1];
				arr2[j+1]=temp;
			}
		}
	}
	for(int k=0;k<n;k++)
	{
		if(arr2[k]==arr[k])
			c++;
	}
		if(c==n)
			{System.out.println("1");
		c=0;}
		else
		{
			System.out.println("0");
			c=0;}
	
	}
}
}
