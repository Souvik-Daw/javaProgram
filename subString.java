import java.util.*;
import java.lang.*;
import java.io.*;

class subString {
    public static int first(int arr[],int high,int low,int k)
    {
        while(low<=high)
		    {
		        int mid=(high+low)/2;
		        if((mid==0 || k>arr[mid-1]) && arr[mid]==k)
		            return mid;
		        else if(arr[mid]<k)
		            low=mid+1;
		        else
		            high=mid-1;
		    }
		    return -1;
    }
    public static int second(int arr[],int high,int low,int x,int n)
    {
    	int  res = -1;
    		  while (low <= high) 
    		  {
    		    // Normal Binary Search Logic
    		    int mid = (low + high) / 2;
    		    if (arr[mid] > x)
    		      high = mid - 1;
    		    else if (arr[mid] < x)
    		      low = mid + 1;
    		 
    		    // If arr[mid] is same as x,
    		    // we update res and move to 
    		    // the right half.
    		    else
    		    {
    		      res = mid;
    		      low = mid + 1;
    		    }
    		  }
    		  return res;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int first=first(arr,n-1,0,k);
		    System.out.print(first+" ");
		    if(first==-1)
		        System.out.println("-1");
		    else
		    {
		        int second=second(arr,n-1,0,k,n);
		        System.out.println(second);
		    }
		   
		}
	}
}