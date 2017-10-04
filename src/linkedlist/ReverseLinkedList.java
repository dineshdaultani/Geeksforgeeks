package linkedlist;

public class ReverseLinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void traverse(){
		Node temp = head;
		System.out.println("Linked List contents are as follows:");
		while(temp != null){
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void reverse(){
		Node current = head;
		
		Node prev = null;
		Node temp;
		while(current != null){
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		head = prev;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList l_list = new ReverseLinkedList();
		l_list.push(10);
		l_list.push(20);
		l_list.push(30);
		l_list.push(40);
		l_list.push(50);
		l_list.push(60);

		l_list.traverse();
		l_list.reverse();
		l_list.traverse();
	}
}