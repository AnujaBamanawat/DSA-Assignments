package Chapter1;

public class CircularLinkedList {
	Node head, tail;
	int count=0;
	
	public CircularLinkedList() {
		head = null;
		tail = null;
	}
	
	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = tail = newNode;
			count++;
		}
		count++;
		newNode.link = head;
		head=newNode;
		tail.link=head;
	}
	
	
	//Dividing circular Linked list into 2 equal parts
	//This program needs correction
	public void divideCircularList() {
		Node temp = head;
		Node newTemp;
		int i = 1;
		while(i<count/2) {
			//temp.display();
			temp = temp.link;
			i++;
		}
		
		Node newTail = temp;
		Node newHead = temp.link;
		//newTail.display();
		newTail.link = head;
		tail.link = newHead;
		newTemp = head;
//		tail.link=null;
//		tail.link = newTemp.link;
//		temp.link=null;
		do {
			newTemp.display();
			newTemp = newTemp.link;
		}while(newTemp!=head);

		
		
		System.out.println("List is divided into 2 equal parts");
		
		
		
//		Node newHead = temp.link;
//		tail.link=null;
//		tail.link = newHead;
//		
//		//newHead.display();
		newTemp = newHead;
		do {
			newTemp.display();
			newTemp=newTemp.link;
		}while(newTemp!=newHead);
	}
	
	
	//Joshephus Circle
	public void joshephusCircle(int m){
		Node temp = head;
		for(int i=0;;i=i++) {
			if(temp.link==null) {
				System.out.println("The last Element of the List is:"+temp.data);
				return;
			}
			
			if(i%10==(m-1)) {
				System.out.println("The last Element of the List is:"+temp.data);
				temp.link=temp.link.link;
			}			
			else {
				temp = temp.link;
			}
		}
	}
	
	public void displayAll() {
		Node temp = head;
		do {
			temp.display();
			temp = temp.link;
		}while(temp!=head);
	}
}
