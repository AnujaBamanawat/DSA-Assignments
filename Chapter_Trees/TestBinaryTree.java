package Chapter_Trees;
import static java.lang.Math.random;

import java.util.LinkedList;
import java.util.Queue;

public class TestBinaryTree {
	public static void main(String[] args) {
//		BinaryTree b1 = new BinaryTree();
//		
//		b1.insert_into_BStree(3);
//		b1.insert_into_BStree(4);
//		b1.insert_into_BStree(5);
//		b1.insert_into_BStree(6);
//		b1.insert_into_BStree(7);
//		b1.insert_into_BStree(8);
//		b1.insert_into_BStree(9);
//		b1.insert_into_BStree(10);
//		b1.insert_into_BStree(11);
//		b1.insert_into_BStree(12);
//		b1.insert_into_BStree(13);
//Displaying Binary Search Tree operations
		
//		System.out.println("Inorder Display");
//		b1.displayInorder(b1.root);
//		System.out.println("Post Order Display:");
//		b1.displayPostOrder(b1.root);
//		System.out.println("-------------------     ---------------------    ----------------");
//		System.out.println("Maximum element of the binary search tree is: "+b1.maxInBSTree(b1.root));
//		System.out.println("Minimum element of the binary search tree is: "+b1.minBSTree(b1.root));

		
//Displaying Binary Tree operations
		
		BinaryTree b2 = new BinaryTree();
		b2.insertInBT(3);
		b2.insertInBT(4);
		b2.insertInBT(5);
		b2.insertInBT(6);
		b2.insertInBT(7);
		b2.insertInBT(8);
		b2.insertInBT(9);
		b2.insertInBT(10);
		b2.insertInBT(11);
		b2.insertInBT(12);
		
		//b2.insertInBT(13);
		//b2.minPair(b2.root);
		
		//b2.ll(b2.root);
		
		Queue<Node> q = new LinkedList<>();
		q.offer(b2.root);
		
		int count=0;
		while(!q.isEmpty()) {
			Node temp = q.poll();
			count++;
			if(temp.left!=null) {
				q.offer(temp.left);
			}
			if(temp.right!=null) {
				q.offer(temp.right);
			}
		}
		
		System.out.println("Total number of nodes in the tree "+count);
		
		System.out.println("Total number of nodes in a tree"+b2.totalNode(b2.root));
		
		System.out.println("Minimun height of binary search tree is "+b2.minBSTree(b2.root));

		
		
		
		//System.out.println(q);
//		b2.displayInorder(b2.root);
//		
//		if(b2.findinBT(b2.root,13 )) {
//			System.out.println("Data found in Binary Tree searched with Recursion!!");
//		}
//		else {
//			System.out.println("Data not found in Binary Tree searched with Recursion!!!!");
//		}
//		
		System.out.println("Maximum height of Binary Tree is "+b2.maxHeight(b2.root));
		System.out.println("Minimum height of Binary Tree is "+b2.minHeight(b2.root));

//		
//		
//		System.out.println("Finding the element using Stack");
//		b2.findEleUsingStack(b2.root,10);
		//System.out.println(random());
	}
}
