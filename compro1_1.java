import java.util.*;

public class compro1_1 {
	public static void main(String args[])
	{
		int t,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int k=n-1;k>=0;k--)
		{
			System.out.print(arr[k]);
			arr[k]=0;
		}
		
		}
		sc.close();
	}

}
