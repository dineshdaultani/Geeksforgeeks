package linkedlist;


public class PairwiseSwap {

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
	
	public void swapElements(Node head){
		if(head == null || head.next == null)
			return;
		else{
			int temp = head.data;
			head.data = head.next.data;
			head.next.data = temp;
			swapElements(head.next.next);
		}
	}
	
	public static void main(String[] args) {
		PairwiseSwap l_list = new PairwiseSwap();
		
		l_list.push(10);
		l_list.push(20);
		l_list.push(30);
		l_list.push(40);
		l_list.push(50);
		l_list.push(60);
		
		l_list.traverse();
		l_list.swapElements(l_list.head);
		l_list.traverse();

	}

}
