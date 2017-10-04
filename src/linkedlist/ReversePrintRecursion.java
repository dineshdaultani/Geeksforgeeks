package linkedlist;

public class ReversePrintRecursion {


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
		System.out.println("Contents of the list are: ");
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void printReverse(Node head){
		if(head == null)
			return;
		else{
			printReverse(head.next);
			System.out.print(head.data + " ");
		}
	}
	
	public static void main(String[] args) {
		ReversePrintRecursion l_list = new ReversePrintRecursion();
		l_list.push(60);
		l_list.push(50);
		l_list.push(40);
		l_list.push(30);
		l_list.push(20);
		l_list.push(10);
		l_list.push(1);
		
		l_list.traverse();
		System.out.println("\nPrinting recursively: ");
		l_list.printReverse(l_list.head);

	}

}
