package linkedlist;

public class Insert {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data= d;
			this.next=null;
		}
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void insertAfter(Node prev, int data) {
		if(prev == null) {
			System.out.println("Prev cannot be null");
			return;
		}
		
		Node node = new Node(data);
		node.next = prev.next;
		prev.next = node;
	}
	
	public void append(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node ;
			return;
		}
		
		Node curr = head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		
		curr.next=node;
		return;
	}
	
	public void printList() {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public static void main(String args[]) {
		Insert list = new Insert();
		list.append(6);
		list.push(7);
		list.push(1);
		list.append(4);
		list.insertAfter(list.head.next, 8);
		list.printList();
	}
}
