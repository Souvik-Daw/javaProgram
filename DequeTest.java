import java.util.*;
public class DequeTest {
public static void main(String args[])
{
	ArrayDeque<Integer> s=new ArrayDeque<>();
	s.offer(5);
	s.offer(6);
	s.offer(7);
	s.offer(8);
	s.offer(9);
	
	s.pollFirst();
	for(Integer k:s)
		System.out.print(k+" ");
}
}
