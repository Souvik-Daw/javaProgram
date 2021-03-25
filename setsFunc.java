import java.util.*;
public class setsFunc {
	public static void main(String args[])
	{
		Set<Integer> s1=new TreeSet<>();
		s1.add(512);
		s1.add(621);
		s1.add(925);
		s1.add(704);
		s1.add(836);
		
		for(int i:s1)
			System.out.print(i+" ");
	}
}
