import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class inputBR
{
	public static void main(String args[])throws IOException
	{
		int test;
		 BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
		 String line = input.readLine();
		 String []tokens = line.split(" ");
		 int x = Integer.parseInt(tokens[0]);
		 int y=Integer.parseInt(tokens[1]);
		 System.out.println(x);
		 System.out.println(y);
	}
	}