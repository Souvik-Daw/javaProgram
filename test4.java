import java.io.*;
import java.util.*;


public class test4{
    public static int convert(int a)
    {
        if(a==1)
        return 0;
        else
        return 1;
    }
    public static long count(int arr[],int c_01,int c_10,int a)
    {
        long total=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a)
            {
                a=convert(a);
            }
            else{
                total+=1;
                if(arr[i]==1)
                {
                    c_10--;
                    if(c_10==-1)
                    return Integer.MAX_VALUE;
                }
                else
                {
                    c_01--;
                    if(c_01==-1)
                    return Integer.MAX_VALUE;
                }
            }
        }
        return total;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();
            int c_01=sc.nextInt();
            int c_10=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            System.out.println(Math.min(count(arr,c_01,c_10,0),count(arr,c_01,c_10,1)));
        }
    }
}