// 1 2 2 3 3 
// 2 3
import java.util.*;
public class dup_ele {
	public static void main(String args[])
	{
		int arr[]= {1,2,2,3,3};
		int n=5;
		Set<Integer> s=new HashSet<>();
		for(int i:arr)
		{
			if(s.contains(i))
			{
				System.out.print(i+" ");
			}
			else
				s.add(i);
		}
	}
}
