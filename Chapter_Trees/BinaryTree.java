package Chapter_Trees;

import static java.lang.Math.random;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class BinaryTree {
	Node root;
	
	public BinaryTree() {
		root=null;
	}
	
	public void insert_into_BStree(int data) {
		Node temp = root;
		Node pre = temp;
		Node newNode = new Node(data);
		if(root==null) {
			root=newNode;
			//root.display();
			return;
		}
		while(temp!=null) {
			if(temp!=null) {
				pre = temp; //To follow the temp..
			}
			if(temp.data>data) {
				temp = temp.left;
			}
			else {
				temp=temp.right;
			}
			if(temp==null) {
				if(pre.data>data) {
					pre.left = newNode;
				}
				else {
					pre.right = newNode;
				}
			}
		}
	}
	
	public void displayInorder(Node temp) {
		if(temp==null) {return;}
		//System.out.println(1);
		displayInorder(temp.left);
		temp.display();
		//System.out.println(temp.data+" ");
		displayInorder(temp.right);
	}
	
	public void displayPostOrder(Node temp) {
		if(temp==null) {
			System.out.println("null leaf");
			return;
			}
		
		displayPostOrder(temp.left);
		displayPostOrder(temp.right);
		temp.display();
	}
	
//	public void ll(Node root) {
//		Queue<Node> q = new LinkedList<>();
//		q.offer(root);
//		System.out.println(q.poll());
//	}
	
	public int maxInBSTree(Node temp) {
		if(temp==null)return -1;
		while(temp.right!=null)temp=temp.right;
		return temp.data;
	}
	
	public int minBSTree(Node temp) {
		if(temp==null)return -1;
		
		while(temp.left!=null)temp=temp.left;
		
		return temp.data;
	}
	
	public int inOrd(Node temp) {
		while(temp!=null) {
			inOrd(temp.left);
			inOrd(temp.right);
			System.out.println(temp.data);
			return temp.data;
			
		}
		return 0;
	}
	
	public void insertInBT(int i) {
		// TODO Auto-generated method stub
		Node temp = root;
		Node pre = null;
		
		Node newNode = new Node(i);

		if(root==null) {
			root = newNode;
		}
		
		while(temp!=null) {
			if(temp!=null) {
				pre=temp;
			}
			
			if(random()<0.5) {
				temp = temp.right;
				if(temp==null) {
					pre.right=newNode;
				}
			}
			else {
				temp=temp.left;
				if(temp==null) {
					pre.left = newNode;
				}
			}
			
		}
	}

	public boolean findinBT(Node root2, int i) {
		// TODO Auto-generated method stub
		if(root2==null) {
			//System.out.println("Data not found in Binary Tree!!");
			return false;
		}
		if(root2.data==i) {
			//System.out.println("Data found in the Binary Tree");
			return true;
		}
		return findinBT(root2.left,i) || findinBT(root2.right,i);
	}
	
	public int maxHeight(Node root) {
		if(root==null) {
			return 0;
		}
		int leftCount = maxHeight(root.left);
		int rightCount = maxHeight(root.right);
		return leftCount>rightCount?leftCount+1:rightCount+1;
	}
	
	
	public int totalNode(Node root){
		if(root==null) {
			return 0;
		}
		int leftCount = totalNode(root.left);
		int rightCount = totalNode(root.right);
		
		return 1+leftCount+rightCount;   
	}
	

	//To traverse or to search element in Binary always use stack
	
	Stack<Node> s1 = new Stack<>();
	
	public void findEleUsingStack(Node temp,int data)
	{
		Node root = temp;
		s1.add(root);
		while(temp!=null || s1.size()!=-1) {
			while(temp.left!=null) {
				temp=temp.left;
				if(temp.left!=null) {
					s1.add(temp);
				}
			}
			s1.remove(s1.size()-1);
			temp = temp.right;
			if(temp.data == data) {
				System.out.println("Data found!!");
				return;
			}
		}
		System.out.println("Data not found!!!");
		return;
		
	}
	
	
	public int minHeight(Node head) {
		if(head==null)return 0;
		Queue<Node> q = new LinkedList();
		q.offer(head);
		q.offer(null);
		int count  = 1;
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if(curr!=null) {
			if(curr.left==null && curr.right==null) {return count;}
			if(curr.left!=null) {
				q.offer(curr.left);
			}
			if(curr.right!=null) {
				q.offer(curr.right);
			}}
			else {
				if(!q.isEmpty()) {
					count++;
					q.offer(null);
				}
			}	
		}
		return count;
	}
	
	
	
	
	
	//Normal binary tree operations
	//Node temp_insert;
	
//	public void insertInBT(Node root, int data) {
//		this.temp_insert = root;
//	
//
//		Node prev = null;
//		Node newNode = new Node(data);
//		if(this.temp_insert==null) {
//			root = newNode;
//			System.out.println("Data inserted into root!!");
//			return;
//		}
//		
//		boolean flag = false;
//		prev = this.temp_insert;
//		this.temp_insert=this.temp_insert.left;
//		if(this.temp_insert!=null) {
//			if(prev.right==null) {
//				prev.right = newNode;
//				System.out.println("Data inserted in right side of tree!");
//				return;
//			}
//			flag=true;
//		}
//		else {
//			this.temp_insert = newNode;
//			System.out.println("Data inserted in left side of tree!");
//			return;
//		}
//		if(random()<0.5) {
//			flag=false;
//		}
//		
//		if(flag) {
//			insertInBT(this.temp_insert,data);
//		}
//		else {
//			insertInBT(this.temp_insert,data);
//		}	
//	}
	
	
}
