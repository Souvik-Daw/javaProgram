package packTest;
import java.util.*;
class Node5{
	int key;
	Node5 left;
	Node5 right;
	Node5(int data)
	{
		key=data;
		left=right=null;
	}
}
public class tree {
	Node5 root;
	tree()
	{
		root=null;
	}
	void postFix(Node5 r)
	{
		if(r==null)
			return;
		postFix(r.left);
		postFix(r.right);
		System.out.print(r.key+" ");
		
	}
	void preFix(Node5 r)
	{
		if(r==null)
			return;
		System.out.print(r.key+" ");
		preFix(r.left);
		preFix(r.right);
		
	}
	void inFix(Node5 r)
	{
		if(r==null)
			return;
		inFix(r.left);
		System.out.print(r.key+" ");
		inFix(r.right);
		
	}
	void inorder()
	{
        Queue<Node5> q = new LinkedList<>(); 
		q.add(root);
		while(!q.isEmpty())
		{
			Node5 temp=q.poll();
			System.out.print(temp.key+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
	}
	void insert(int k)
	{
		Queue<Node5> q = new LinkedList<>(); 
		q.add(root);
		while(!q.isEmpty())
		{
			Node5 temp=q.poll();
			if(temp.left!=null)
				q.add(temp.left);
			else
			{
				temp.left =new Node5(k);
				break;
			}
			if(temp.right!=null)
				q.add(temp.right);
			else
			{
				temp.right =new Node5(k);
				break;
			}
		}
	}
	void deletelast(Node5 x)
	{
		Queue<Node5> q = new LinkedList<>(); 
		q.add(root);
		Node5 temp=null;
		while(!q.isEmpty())
		{
			 temp=q.poll();
			 if(temp.left!=null)
			 {
				 if(temp.left==x)
				 {
					 temp.left=null;
					 //x=null;
					 break;
				 }
				 else
				 {
					q.add(temp.left); 
				 }
			 }
			 
			 if(temp.right!=null)
			 {
				 if(temp.right==x)
				 {
					 temp.right=null;
					 //x=null;
					 break;
				 }
				 else
				 {
					q.add(temp.right); 
				 }
			 }
			 
		}
	}
	void delete(int k)
	{
		delete(root,k);
	}
	void delete(Node5 root,int k)
	{
		Queue<Node5> q = new LinkedList<>(); 
		q.add(root);
		Node5 sd=null;
				Node5 temp=null;
		while(!q.isEmpty())
		{
			 temp=q.poll();
			if(temp.key==k)
				sd=temp;
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		int p=temp.key;
		sd.key=p;
		deletelast(temp);
		
	}
	int dimention(Node5 r)
	{
		if(r==null)
			return 0;
		int lh=height(r.left);
		int rh=height(r.right);
		
		int ld=dimention(r.left);
		int rd=dimention(r.right);
		
		return(Math.max(lh+rh+1,Math.max(ld,rd)));
	}
	int height(Node5 q)
	{
		if(q==null)
			return 0;
		else
		{
		return Math.max(height(q.left), height(q.right))+1;
		}
	}
	//Wrapped
	int dimention()
	{
		return dimention(root);
	}
	void inFix()
	{
		inFix(root);
	}
	void preFix()
	{
		preFix(root);
	}
	void postFix()
	{
		postFix(root);
	}
	public static void main(String args[])
	{
		tree t=new tree();
		t.root = new Node5(1);
        t.root.left = new Node5(2);
        t.root.right = new Node5(3);
        t.root.left.left = new Node5(4);
        t.root.left.right = new Node5(5);
        t.inFix();
        System.out.println();
		t.postFix();
		System.out.println();
		t.preFix();
		t.insert(6);
		t.delete(5);
		System.out.println();
		t.inorder();
		System.out.println();
		int a=t.dimention();
		System.out.println(a);
		
	}
}
/*
 public class LowerBound {

    private LowerBound() { }

    public static int lowerBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            //checks if the value is less than middle element of the array
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
*/