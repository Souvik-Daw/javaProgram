package Graph;
import java.util.*;
public class ConnectedGraph {
	
	static void addEdge(ArrayList<ArrayList<Integer>> arr,int a,int b)
	{
		arr.get(a).add(b);
		arr.get(b).add(a);
	}
	
	static void Dfs(ArrayList<ArrayList<Integer>> arr,boolean v[],int k)
	{
		v[k]=true;
		System.out.print(k+" ");
		
		for(int i=0;i<arr.get(k).size();i++)
		{
			if(!v[i])
				Dfs(arr,v,i);
		}
	}
	static void connect(ArrayList<ArrayList<Integer>> arr,int val)
	{
		boolean v[]=new boolean[val];
		for(int i=0;i<val;i++)
		{
			if(!v[i])
			{
				Dfs(arr,v,i);
				System.out.println("-----");
			}
		}
	}
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>(5);

		int v=5;
		for(int i=0;i<v;i++)
		{
			arr.add(new ArrayList<Integer>());
		}
		addEdge(arr,1,0);
		addEdge(arr,1,2);
		addEdge(arr,3,4);
		System.out.println("Below");
		connect(arr,v);
		}
}
