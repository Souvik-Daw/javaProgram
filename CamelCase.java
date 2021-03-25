import java.util.*;

class CamelCase {
	public static void main (String[] args) {
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
	    int count=0,l;
	    String s="";
	    char ch=0;
		for(int p=0;p<test;p++)
		{

		    s=sc.next();
		    l=s.length();
		   // System.out.println("length"+l);
		    for(int i=0;i<l;i++)
		    {
		        ch=s.charAt(i);
		        int q=(int)ch;
		        if(q>=65 && q<=95)
		        count++;
		    }
		    System.out.println(count);
		    count=0;
		    ch=0;
		    s="";
		    l=0;
		}
	}
}