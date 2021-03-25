/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class pt {
	public static void main (String[] args) {
		int test,n,sum=0; double avg=0.0;
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter test case");
		test=sc.nextInt();
		for(int p=0;p<test;p++)
		{
		    n=sc.nextInt();
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    for(int i=0;i<n;i++)
		    sum=sum+arr[i];
		    
		    avg=sum/n;
		    
		    System.out.print(sum+" ");
		    System.out.print(avg);
		    System.out.println();
		}
	}
}