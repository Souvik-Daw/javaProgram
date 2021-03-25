package packTest;
import java.util.*;
public class BSearch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,3,4,6,7,9};
		int n=arr.length;
		int k=4;
		int l=0;
		int h=n-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==k)
			{
				System.out.println("Found in "+(mid+1));
				break;
			}
			else if(arr[mid]<k)
			{
				l=mid+1;
			}
			else
			{
				h=mid+1;
			}
			System.out.println("Not found");
		}
	}
}
