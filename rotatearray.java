import java.util.*;
public class rotatearray {
public static void main(String args[])
{
	int test,n,k;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int i=0;i<test;i++)
	{
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int j=k;j<(n+k);j++)
		{
			System.out.println(arr[j%n]);
		}
		System.out.println();
	}
}
}
