import java.util.*;
public class greatestex2 {
public static void main(String args[])
{
	int test,n,temp=0;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int k1=0;k1<test;k1++)
	{
		n=sc.nextInt();
		int arr[]=new int[n];
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
		for(int i=0;i<n-2;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		temp=0;
	}
}
}
