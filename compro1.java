import java.util.*;
public class compro1 {
	public static void main(String args[])
	{
		int t,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			
			n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("");
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();	
		}
		for(int j=0;j<n;j+=2)
		{
			System.out.print(arr[j]);
		}
		}
	}

}