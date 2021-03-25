package packTest;
import java.util.*;
public class SortSpecial {
public static void main(String args[])
{
	Integer arr[]= {1,5,4,7,5,1,4,47,8,9};
	int n=arr.length;
	//ArrayList<Integer> a=new ArrayList<Integer>();
	Arrays.sort(arr, Collections.reverseOrder());
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
