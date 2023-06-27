package Chapter1;

public class Node {
	int data;
	Node link;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void display() {
		System.out.println("Linked List data: "+this.data);
	}
}
