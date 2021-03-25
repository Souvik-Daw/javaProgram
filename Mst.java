package Graph;
import java.util.*;
public class Mst {
	static int V=4;
	static int min(int dist[],boolean v[])
	{
		int min=Integer.MAX_VALUE;
		int p=0;
		for(int i=0;i<V;i++)
		{
			if(v[i]==false && dist[i]<=min)
			{
					min=dist[i];
					p=i;
				}
			}
		
		return p;
	}
	static void Dist(int graph[][],int data)
	{
		int dist[]=new int[V];
		boolean v[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			dist[i]=Integer.MAX_VALUE;
			v[i]=false;
		}
		dist[data]=0;
		for(int i=0;i<V-1;i++)
		{
			int u=min(dist,v);
			v[u]=true;
			for(int j=0;j<V;j++)
			{
				if(!v[j] && graph[u][j]!=0 && dist[u]!=Integer.MAX_VALUE && (dist[u]+graph[u][j])<dist[j])
					dist[j]=(dist[u]+graph[u][j]);
			}
		}
		print(dist,V);
	}
	static void print(int[] dist,int V)
	{
		for(int i=0;i<V;i++)
			System.out.println(i+"--> "+dist[i]);
	}
	public static void main(String args[])
	{
		int graph[][]=new int[][]{
				{0,1,0,0},
				{1,0,1,5},
				{0,1,0,2},
				{0,5,2,0}
		};
		Mst obj=new Mst();
		obj.Dist(graph,0);
	}
}
