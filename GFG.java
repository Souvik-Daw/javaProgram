import java.util.*; 
import java.lang.*; 
import java.io.*; 

class GFG
{ 
    static int solve(int M, int N, int s) 
{ 
	if (N % s == 0) 
	{ 

		N = N / s; 
	} 
	else
	{ 

		N = (N / s) + 1; 
	} 

	// if length is divisible 
	// by side of square 
	if (M % s == 0) 
	{ 

		// tiles required is M/s 
		M = M / s; 
	} 
	else
	{ 
		
		// one more tile required 
		M = (M / s) + 1; 
	} 

	return M * N; 
} 

// Driver Code 
public static void main(String args[]) 
{ 
	// input length and breadth of 
	// rectangle and side of square 
	Scanner sc=new Scanner(System.in);
	
	int N = sc.nextInt(), M = sc.nextInt(), s = 4; 

	System.out.println("No of tiles"+solve(M, N, s)); 
} 
} 
