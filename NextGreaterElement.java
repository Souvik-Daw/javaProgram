package packTest;
import java.util.*;
public class NextGreaterElement {
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		int arr[]= {13,7,6,12};
		int n=arr.length;
		s.add(arr[0]);
		int element=0;
		for(int i=1;i<n;i++)
		{
			if(s.size()>0)
			{
				element=s.pop();
					while(element<arr[i])
					{
						System.out.println(element+"->"+arr[i]);
						if(s.isEmpty())
							break;
						element=s.pop();
					}
					if(element>arr[i])
						s.push(element);
				
			}
			
				int p=s.push(arr[i]);
				//System.out.println(p);
	}
		while(s.size()>0)
		{
			System.out.println(s.peek()+"->"+"-1");
			s.pop();
		}
	}
}
