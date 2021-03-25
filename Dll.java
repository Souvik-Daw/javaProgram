import java.util.*;
import java.lang.*;
class Node{
		int data;
		Node next,prev;
		Node(int d)
		{
			data=d;
			next=prev=null;
		}
}
class DQue{
	Node head=null,tail;

		void add(int data)//add at the end
		{
			Node toAdd=new Node(data);
			if(head==null)
			{
				head=tail=toAdd;
				return;
			}
			head.next=toAdd;
			toAdd.prev=head;
			head=toAdd;
		}
		
		void addLast(int data)//add at the start
		{
			Node toAdd=new Node(data);
			if(head==null)
			{
				head=tail=toAdd;
				
			}
			else
			{
			toAdd.next=tail;
			tail.prev=toAdd;
			tail=toAdd;
			}
		}
		int remove()//remove from first
		{
			if(head==null)
			{
				return 0;
			}
			Node remove=tail;
			tail=tail.next;
			tail.prev=null;
			if(tail==null)
			{
				head=null;
			}
			return remove.data;
			//remove=null;
		}
		
		int removeLast()//remove from last
		{
			if(tail==null)
			{
				return 0;
			}
			Node remove=head;
			head=head.prev;
			head.next=null;
			if(head==null)
				tail=null;
			return remove.data;
		}
		void peekFirst()
		{
			Node pf=tail;
			System.out.println("First element-"+pf.data);
		}
		void peekLast()
		{
			Node pl=head;
			System.out.println("Last element-"+pl.data);
		}
		void show()//show
		{
			Node n=tail;
			while(n!=null)
				{
				System.out.print(n.data+" ");
				n=n.next;
				}
			System.out.println();
		}
	}
public class Dll {
public static void main(String args[])
{
	DQue a=new DQue();
	a.addLast(5);
	a.addLast(6);
	a.addLast(7);
	a.addLast(8);
	a.addLast(9);
	a.addLast(10);
	a.addLast(11);
	System.out.println("removed-"+a.removeLast());
	System.out.println("removed-"+a.removeLast());
	a.show();
	a.peekFirst();
	a.peekLast();
}
}
