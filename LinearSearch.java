/*package whatever //do not write package name here */

import java.util.*;

class LinearSearch{
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int test,n,num,first=0,last=0,c=0;
		System.out.print("Enter test case");
		test=sc.nextInt();
		for(int p=0;p<test;p++)
		{
			System.out.print("Enter no of elements");
		    n=sc.nextInt();
		    System.out.print("Enter the no");
		    num=sc.nextInt();
		    int arr[]=new int[n];
		    System.out.print("Enter array");
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==num)
		        {
		        	first=i;
		        break;
		        }
		    }
		   /* for(int i1=arr.length-1;i1>=0;i1--)
		    {
		        if(arr[i1]==num)
		        last=i1;
		    }*/
		    System.out.print("Ans-");
		    System.out.println(first+" "+last);
		    first=0;
		    last=0;
		}
	}
}