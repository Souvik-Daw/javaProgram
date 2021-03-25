import java.util.*;
public class primeNo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		int k=5;
		int count=0;
        int i=5;
        
            if(Arrays.binarySearch(arr,i)==-1)
            {
                count++;
                
                    
            }
            
        
        System.out.println(i+"  "+count+" "+Arrays.binarySearch(arr,i));
		
	}
}
//2,3,4,7,11