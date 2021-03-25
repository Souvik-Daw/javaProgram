package packTest;
import java.lang.*;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int arr[]=new int[n];
		    String s=br.readLine();
		    String t[]=s.split(" ");
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Integer.parseInt(t[i]);
		    }
		    Map<Integer,Integer> m=new HashMap<>();
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        if(m.get(arr[i])==null)
		        m.put(arr[i],1);
		        else
		        {
		           count=m.get(arr[i]);
		           count++;
		           m.put(arr[i],count);
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		    	System.out.println(m.get(arr[i])+arr[i]);
		    }
		}
	}
}