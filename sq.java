import java.util.*;
public class sq {
public static void main(String args[])
{
	Stack<Integer> s=new Stack<>();
	s.push(1);
	s.push(2);
	s.push(3);
	s.pop();
	Queue<Integer> q=new LinkedList<>();
	q.offer(1);
	q.offer(2);
	q.offer(3);
	q.poll();

	Deque<Integer> d=new LinkedList<>();
	d.push(1);
	d.push(2);
	d.push(3);
	d.offer(4);
	d.pop();
	System.out.print(q);
}
}