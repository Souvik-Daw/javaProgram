import java.util.*;
public class FProgram {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int test,p,num,m2=0,l,m3=0;String s="";
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("enter t");
		test=sc.nextInt();
		for(int i1=0;i1<test;i1++)
		{
			System.out.println("enter no.");
			num=sc.nextInt();
			m2=num*2;
			m3=num*3;
			s+=num+""+m2+""+m3;
			l=s.length();
			int arr[]=new int[l];
			//System.out.println("ans"+s);
			p=0;
			for(int i=0;i<l;i++){
		        arr[i]= Integer.parseInt(s.charAt(i)+"");
		        }
			
			//System.out.println("array");
			for(int i=0;i<l-1;i++)
			{
				for(int j=0;j<l-1-i;j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			//System.out.println("array");
			for(int i=0;i<l;i++)
			{
				if(arr[i]==a[i])
				{
					//System.out.println("1");
					p++;
				}
					else
					{
						p=0;
				break;
					}
						//System.out.println("0");
			}
				//System.out.println(arr[i]);
			
			if(p==l)
				System.out.println("1");
			else
				System.out.println("0");
			
			p=0;
			s="";
			m2=0;
			m3=0;
		}
		}
	}

