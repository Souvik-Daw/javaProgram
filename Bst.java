package packTest;

import java.util.LinkedList;
import java.util.*;


class Node1{
	int data;
	Node1 left;
	Node1 right;
	Node1(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class Bst {
	Node1 root;
	Bst()
	{
		root=null;
	}
	void delete(int key)
	{
		root=deleteRec(root,key);
	}
	Node1 deleteRec(Node1 root,int key)
	{
		if(root==null)
			return root;
		if(key<root.data)
			root.left=deleteRec(root.left,key);
		else if(key>root.data)
			root.right=deleteRec(root.right,key);
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.data=comp(root.right);
			root.right=deleteRec(root.right,key);
		}
		return root;
	}
	int comp(Node1 d)
	{
		int max=d.data;
		while(d.left!=null)
		{
			max=d.left.data;
			d=d.left;
		}
		return max;
		
		
	}
	void insert(int key)
	{
		root=insertRec(root,key);
	}
	Node1 insertRec(Node1 root,int key)
	{
		if(root==null)
		{
			root=new Node1(key);
			return root;
		}
		if(key<root.data)
			root.left=insertRec(root.left,key);
		else if(key>root.data)
			root.right=insertRec(root.right,key);
		return root;
			
	}
	
		void inorder()
		{
	 Queue<Node1> q = new LinkedList<>(); 
		q.add(root);
		while(!q.isEmpty())
		{
			Node1 temp=q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	public static void main(String args[])
	{
		Bst tree=new Bst();
		 tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	        tree.delete(60);
		tree.inorder();
	}

}
