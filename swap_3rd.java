import java.util.*;
public class swap_3rd {
public static void main(String args[])
{
	int test,temp=0,n,k;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int p=0;p<test;p++)
	{
	n=sc.nextInt();
	k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	temp=arr[k-1];
	arr[k-1]=arr[n-k];
	arr[n-k]=temp;
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]);
	}
	System.out.println("");
	temp=0;
}
}
}