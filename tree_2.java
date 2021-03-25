package packTest;
import java.util.*;
class Node2
{
	Node2 left,right;
	int data;
	Node2(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class tree_2 {
	
	Node2 root;
	tree_2()
	{
		root=null;
	}
	void levelOrder()
	{
		lo(root);
	}
	void lo(Node2 root)
	{
		Queue<Node2> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node2 temp=q.poll();
			System.out.println(temp.data);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	void insert(int data)
	{
		insert(root,data);
	}
	void insert(Node2 root,int data)
	{
		Queue<Node2> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node2 temp=q.poll();
			//System.out.println(temp.data);
			if(temp.left!=null)
				q.add(temp.left);
			else
				{temp.left=new Node2(data);
			break;}
			if(temp.right!=null)
				q.add(temp.right);
			else
			{temp=new Node2(data);
			break;}
		}
	}
	void delete(int data)
	{
		delete(root,data);
	}
	void delete(Node2 root,int data)
	{
		Node2 p=null;
		Queue<Node2> q=new LinkedList<>();
		q.add(root);
		Node2 temp=null;
		while(!q.isEmpty())
		{
			temp=q.poll();
			if(temp.data==data)
				p=temp;
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		int x=temp.data;
		p.data=x;
		deleteLast(root,temp);
		
	}
	void deleteLast(Node2 t,Node2 root)
	{
		Queue<Node2> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node2 temp=q.poll();
			//System.out.println(temp.data);
			if(temp.left!=null)
				
			
				{
					if(temp.left==t)
					{
						temp.left=null;
						t=null;
						break;
					}
					else
						q.add(temp.left);
					
				}
			if(temp.right!=null)
				{
			
				if(temp.right==t)
				{
					temp.right=null;
					t=null;
					break;
				}
				else
					q.add(temp.right);	
				}
		}
	}
	public static void main(String args[])
	{
		tree_2 t=new tree_2();
		t.root = new Node2(1);
        t.root.left = new Node2(2);
        t.root.right = new Node2(3);
        t.root.left.left = new Node2(4);
        t.root.left.right = new Node2(5); 
        t.insert(6);
        
        t.delete(5);
        t.levelOrder();
	}

}
