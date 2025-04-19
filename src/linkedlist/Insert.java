package linkedlist;

class Node {
	int data;
	Node next;
}

public class Insert {

	private Node head;
	
	public void printList() {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public void insertFront(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
	public void insertLast(int data) {
		Node node = new Node();
		node.data = data;
		if(head==null) {
			head=node;
		}else {
			Node curr = head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=node;
		}
	}
	
	public void insertAfter(Node prev, int data) {
		Node node = new Node();
		node.data=data;
		node.next=prev.next;
		prev.next=node;
	}
	
	public static void main(String args[]) {
		Insert insert = new Insert();
		insert.insertFront(10);
		insert.insertFront(20);
		insert.insertLast(30);
		insert.insertLast(40);
		insert.insertAfter(insert.head, 25);
		insert.printList();
	}
	
}
