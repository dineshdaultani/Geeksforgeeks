package linkedlist;


public class DeleteSingleNodeByReference {

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
		System.out.println("\nLinked List contents are as follows:");
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void deleteNode(Node temp){
		if(temp.next != null){
			temp.data = temp.next.data;
			temp.next = temp.next.next;
		}else{
			temp = null;
		}
	}
	
	public static void main(String[] args) {
		DeleteSingleNodeByReference l_list = new DeleteSingleNodeByReference();
		
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l_list.head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		l_list.traverse();
		l_list.deleteNode(fourth);
		l_list.traverse();
	}

}
