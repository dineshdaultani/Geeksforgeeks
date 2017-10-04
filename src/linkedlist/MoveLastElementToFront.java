package linkedlist;

public class MoveLastElementToFront {

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
		System.out.println("\nContents of the list are: ");
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void moveLastElement(){
		if(head == null || head.next == null)
			return;
		else{
			Node temp = head;
			Node prev = null;
			while(temp.next != null){
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			temp.next = head;
			head = temp;
		}
	}
	
	public static void main(String[] args) {
		MoveLastElementToFront l_list = new MoveLastElementToFront();
		l_list.push(1);
		l_list.push(2);
		l_list.push(3);
		l_list.push(4);
		l_list.push(5);
		
		l_list.traverse();
		l_list.moveLastElement();
		l_list.traverse();

	}

}
