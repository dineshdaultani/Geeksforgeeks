package linkedlist;

public class LinkedListImplementation {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node (int data){
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		LinkedListImplementation l_list = new LinkedListImplementation();
		l_list.head = new Node(10);
		Node second = new Node(20);
		Node third =  new Node(30);
		
		l_list.head.next = second;
		second.next = third;
		
		Node temp = l_list.head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
