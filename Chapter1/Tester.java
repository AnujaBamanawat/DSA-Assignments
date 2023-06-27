package Chapter1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList s1 = new SingleLinkedList();
		s1.insertFirst(4);
		s1.insertFirst(3);
		s1.insertFirst(2);
		s1.insertFirst(1);
		s1.insertFirst(8);
		s1.insertFirst(10);
		s1.insertFirst(1);
		s1.insertFirst(3);
		s1.insertFirst(2);
		s1.insertFirst(5);
		s1.insertFirst(6);
		s1.insertFirst(0);
		s1.insertFirst(-1);
		//s1.modularNode(2);
		s1.displayAll();
		System.out.println("After Pair reversal!");
		s1.pairReverser();
		//s1.displayAll();
		
//		CircularLinkedList c1 = new CircularLinkedList();
//		c1.insertAtFirst(1);
//		c1.insertAtFirst(2);
//		c1.insertAtFirst(3);
//		c1.insertAtFirst(4);
//		c1.insertAtFirst(5);
//		c1.insertAtFirst(6);
//		c1.insertAtFirst(7);
//		c1.insertAtFirst(8);
//		
//		c1.joshephusCircle(3);
//		c1.displayAll();
//		c1.divideCircularList();
	}

}
