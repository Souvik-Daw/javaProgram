package packTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
public class StackCompare {
	public static void main(String args[])throws IOException
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test-- >0)
		{
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		String line=br.readLine();
		String token[]=line.split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(token[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(i<n-1)
			{
			if(arr[i]>arr[i+1])
				System.out.print(arr[i+1]);
			else if(arr[i]==arr[i+1])
				System.out.print("-1 ");
			else
				System.out.print("-1 ");
			}
		}
		System.out.println("-1");
	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
