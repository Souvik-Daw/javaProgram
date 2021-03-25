
public class revword {
	public static void main(String args[])
	{
		String s="  I  am   Souvik   Daw   ";
		s=s.trim();
		s= s.replaceAll(" +", " ");
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		System.out.print(arr[i]+" ");
		System.out.println();
		
	}
}
