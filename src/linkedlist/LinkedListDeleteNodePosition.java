package linkedlist;

public class LinkedListDeleteNodePosition {
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
	
	public void push(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void deleteAtPos(int position){
		// If linkedlist is empty
		if(head == null)
			return;
		
		Node temp = head;
		Node prev = null;
		int index = 0;
		
		// If position is first
		if(position == 0){
			head = temp.next;
			return;
		}
		while(index != position && temp != null){
			prev = temp;
			temp = temp.next;
			index++;
		}
		if(temp == null){
			System.out.println("Reached end of the linked list");
			return;
		}
		else	
			prev.next = temp.next;
	}
	
	public static void main(String[] args) {
		LinkedListDeleteNodePosition l_list = new LinkedListDeleteNodePosition();
		l_list.push(10);
		l_list.push(20);
		l_list.push(30);
		l_list.push(40);
		
		System.out.println("Linkedlist elements before deletion");
		l_list.traverse();
		l_list.deleteAtPos(4);
		System.out.println("Linkedlist elements after deletion");
		l_list.traverse();
	}

}
