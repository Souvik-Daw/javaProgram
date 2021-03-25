/*package whatever //do not write package name here */

import java.util.*;

class PascelsTriangle{
	public static void main (String[] args) {
		int test,num,store=0;
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter t");
		test=sc.nextInt();
		for(int p=0;p<test;p++)
		{
		    num=sc.nextInt();
		    store=(num-1);
		    for(int i=0;i<(num-2);i++)
		    {
		        store=(num-1);
                s=s+" "+store; 
                System.out.println(s);
		    }
		   // System.out.println("1"+s+" 1");
		    store=0;
		}
	}
}