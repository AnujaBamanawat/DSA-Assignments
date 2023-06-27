package Chapter1;

public class SingleLinkedList {
	Node head;
	
	public SingleLinkedList() {
		head = null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.link = head;
		head = newNode;
	}
	
	
	public void deleteLast() {
		Node temp = head;
		
		while(temp.link.link!=null) {
			temp=temp.link;
		}
		temp.link = null;
	}
	
	//Program to reverse pair of linked list  
	//This program needs correction
	public void pairReverser() {
		Node temp = head;
		Node temp1 = head.link;
		
		temp.link = temp1.link;
		temp1.link = null;
		temp1.link = temp;
		head = temp1;
		
		temp = null;
		temp1 = null;
		
		Node previous = head.link;
		Node current = previous.link;
		Node future = null;
		
		while(current.link!=null && current.link.link!=null) {
			current.display();
			
			future = current.link;
			previous.link = future;
			current.link = future.link;
			future.link = previous.link;
			previous = current;
			current = future;	
		}	
	}
	
	
	
	//Modular Node
	public void modularNode(int k) {
		Node temp = head;
		Node temp_mod = new Node(0);
		while(temp!=null) {
			if(temp==null) {break;}
			if(temp.data%k==0) {
				if(temp.data>temp_mod.data) {
					temp_mod=temp;
				}
			}
			temp=temp.link;
		}
		System.out.println("The Highest modular node data is:"+temp_mod.data);
	}
	
	
	public void displayAll() {
		Node temp = head;
		while(temp!=null) {
			temp.display();
			temp = temp.link;
		}
	}
}
