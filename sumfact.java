import java.util.*;
public class sumfact {
public static void main(String args[])
{
	int test,n,sum=0;
	Scanner sc=new Scanner(System.in);
	test=sc.nextInt();
	for(int i=0;i<test;i++)
	{
		n=sc.nextInt();
		for(int j=0;j<=n;j++)
		{
			sum+=j;
		}
		System.out.println(sum);
		n=0;
		sum=0;
	}
	
}
}
