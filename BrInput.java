import java.io.*;
import java.io.BufferedReader;
public class BrInput {
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	String s=br.readLine();
	char ch=br.readLine().charAt(0);
	System.out.print(n+"\n"+s+"\n"+ch);
	
	
	
	
	 BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
	 String line = input.readLine();
	 String []tokens = line.split(" ");
	 int x = Integer.parseInt(tokens[0]);
	 int y=Integer.parseInt(tokens[1]);
	 System.out.println(x);
	 System.out.println(y);
}
}
