package Graph;
import java.util.*;
public class Graph1 {
	static void print(ArrayList<ArrayList<Integer>> arr)
	{
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(i+"-----");
			for(int j=0;j<arr.get(i).size();j++)
			{
				System.out.print(arr.get(i).get(j)+",");
			}
			System.out.println();
		}
		
	}
	static void addEdge(ArrayList<ArrayList<Integer>> arr,int u,int v)
	{
		arr.get(u).add(v);
		arr.get(v).add(u);
	}
	static void bfs(ArrayList<ArrayList<Integer>> arr,int v)
	{
		LinkedList<Integer> q=new LinkedList<Integer>();
		boolean value[]=new boolean[v];
		for(int i=0;i<v;i++)
			value[i]=false;
		
			value[0]=true;
			int p=arr.get(0).get(0);
			System.out.println("value ofp is "+p);
			q.push(0);
		
		while(q.size()!=0)
		{
			int x=q.poll();
			System.out.print(x+" ");
			for(int i=0;i<arr.get(x).size();i++)
			{
				int node=arr.get(x).get(i);
				if(value[node]==false)
				{
					value[node]=true;
					q.add(node);
				}
			}
		}
	}
	public static void main(String args[])
	{
		int v=5;
		//ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>(v);
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj, 0, 1);
	    addEdge(adj, 0, 4);
	    addEdge(adj, 1, 2);
	    addEdge(adj, 1, 3);
	    addEdge(adj, 1, 4);
	    addEdge(adj, 2, 3);
	    addEdge(adj, 3, 4);
	    System.out.println("Adjacent list");
		print(adj);
		System.out.println("BFS");
		bfs(adj,v);
	}
}
