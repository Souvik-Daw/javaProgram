package packTest;
import java.util.*;
public class DupEle {
public static void main(String args[])
{
	int arr[]= {2,2,2,10,2,5,5};
	int k=3;
	int n=arr.length;
	int unique=0;
	Arrays.sort(arr);
	for(int i=0;i<n-2;i++)
	{
		if(arr[i]!=arr[i+1] && arr[i+1]!=arr[i+2])
		{
			unique=arr[i+1];
		}
	}
	System.out.println(unique);
}
}
