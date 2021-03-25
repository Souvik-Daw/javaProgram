package Graph;
import java.util.*;
public class Graph {
	LinkedList<Integer> arr[];
	int v;
	Graph(int v)
	{
		this.v=v;
		arr=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			arr[i]= new LinkedList<Integer>();//
		}
	}
	void Dfs(boolean val[],int key)
	{
		val[key]=true;
		System.out.print(key+" ");
		for (int x : arr[key]) {
            if (!val[x])
                Dfs(val,x);
        }
	}
	void connect()
	{
		boolean val[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(!val[i])
			{
			Dfs(val,i);
			System.out.println();
			}
		}
	}
	void addEdge(int a,int b)
	{
		arr[a].add(b);
		arr[b].add(a);
	}
	public static void main(String args[])
	{
		Graph g=new Graph(5);
		g.addEdge(1, 0);
		g.addEdge(1, 2);
		g.addEdge(3, 4);
		g.connect();
	}
}
