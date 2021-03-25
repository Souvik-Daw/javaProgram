package packTest;
import java.util.*;
public class RevQueue {
	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		
		Integer arr[]=new Integer[q.size()];
		q.toArray(arr);
		
		int size=q.size();
		Queue<Integer> q1=new LinkedList<Integer>();
		while(size>0)
		{
		q1.offer(arr[size-1]);
		size--;
		}
		
		for(Integer i:q1)
			System.out.print(i+" ");
	
	}
}
