import java.util.*;
public class finalelement {
public static void main(String args[])
{
	int test,l,n,max,min,pmin = 0,pmax = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
		n=sc.nextInt();
		l=n;
		int arr[]=new int[n];
		int arr2[]=new int[l];
		System.out.println("enter array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		min=arr[0];
		max=0;
		for(int i=0;i<n;i++)
		{
		
			if(max<=arr[i])
				{
				max=arr[i];
				pmax=i;
				}
			if(min>=arr[i])
				{
				min=arr[i];
				pmin=i;
				}
			if(i%2==0)
			{
				for(int k=0;k<n;k++)
				{
					if(k==pmax)
						continue;
					else
					{
						arr2[k]=arr[k];
					}
				}
				max=0;
			}else
			{
				for(int k=0;k<n;k++)
				{
					if(k==pmin)
						continue;
					else
					{
						arr2[k]=arr[k];
					}
				}
				min=arr[0];
			}
		}
		for(int q=0;q<n;q++)
			if(q!=0)
			System.out.println(arr2[q]);
	}
}

