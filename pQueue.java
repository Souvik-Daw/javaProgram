import java.util.*;
public class pQueue {
	public static void main(String args[])
	{
		int arr[]= {1,5,6,2,8,9,4};
		int max=0;
		int min=0;
		int n=arr.length;
		PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0;i<n;i++)
			q.add(arr[i]);
		min=q.peek();
		System.out.println(min);
		
		
		
		PriorityQueue<Integer> q1=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++)
			q1.add(arr[i]);
		max=q1.peek();
		System.out.println(max);
	}
}