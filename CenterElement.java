import java.util.*;
public class CenterElement {
public static void main(String args[])
{
	
	int test,n,temp,l=0;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int k=0;k<test;k++)
	{
	n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	l=n/2;
	for(int i=0;i<n;i++)
		System.out.println(arr[i]);
		if(n%2!=0)
		System.out.println(arr[n/2]);//5
		else
		System.out.println(arr[l-1]);//6
}
}
}
