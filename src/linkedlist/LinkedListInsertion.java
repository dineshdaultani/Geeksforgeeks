package linkedlist;

public class LinkedListInsertion {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void traverse(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public Node insertAtFront(int data){
		Node temp = new Node(data);
		temp.next = head;
		return temp;
	}
	
	public void insertAfterNode(int data, Node prev_node){
		if(prev_node == null){
			System.out.println("Prev_node can't be null");
			return;
		}
		Node temp = new Node(data);
		temp.next = prev_node.next;
		prev_node.next = temp; 
	}
	
	public void insertAtEnd(int data){
		Node temp = head;
		Node new_node = new Node(data);
		
		if(head == null){
			head = temp;
			return;
		}
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new_node;
	}
	
	public static void main(String[] args) {
		LinkedListInsertion l_list = new LinkedListInsertion();
		l_list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		l_list.head.next = second;
		second.next = third;
		
		System.out.println("Linkedlist before inserting element at front");
		l_list.traverse();
		l_list.head = l_list.insertAtFront(5);
		System.out.println("Linkedlist after inserting element at front");
		l_list.traverse();

		System.out.println("Linkedlist before inserting an element after node");
		l_list.traverse();
		l_list.insertAfterNode(40, second);
		System.out.println("Linkedlist after inserting an element after node");
		l_list.traverse();
		
		System.out.println("Linkedlist before inserting an element at the end");
		l_list.traverse();
		l_list.insertAtEnd(50);
		System.out.println("Linkedlist after inserting an element at the end");
		l_list.traverse();
		
	}

}
