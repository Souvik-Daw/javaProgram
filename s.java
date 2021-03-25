import java.util.*;
public class s {
public static void main(String args[])
{
	Stack<Integer> st=new Stack<>();
	st.add(5);
	st.add(7);
	st.add(6);
	st.add(2);
	st.add(4);
	System.out.println("head is "+st.peek());
	for(Integer i:st)
		System.out.print(i+" ");
}
}
