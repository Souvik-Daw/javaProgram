import java.util.*;
public class maxmin {
public static void main(String args[])
{
	int test,n,max=0,min=0;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int i=0;i<test;i++)
	{
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		min=arr[0];
		max=0;
		for(int k=0;k<n;k++)
		{
			if(max<=arr[k])
				max=arr[k];
			if(min>=arr[k])
				min=arr[k];
		}
		System.out.println(max+" "+min);
	}
}
}
