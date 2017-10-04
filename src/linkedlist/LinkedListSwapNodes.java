package linkedlist;

public class LinkedListSwapNodes {
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
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void swapNodes(int x, int y){
		Node node_x = null, node_y = null;
		Node temp = head;
		Node prev = null, prev_x = null, prev_y = null;
		while(temp != null){
			if(temp.data == x){
				node_x = temp;
				prev_x = prev;
			}else if(temp.data == y){
				node_y = temp;
				prev_y = prev;
			}
			prev = temp;
			temp = temp.next;
		}
		if(node_x == null)
			System.out.println("Node x not found in the list");
		else if(node_y == null)
			System.out.println("Node y not found in the list");
		else if(node_x == node_y) // x and y same
			return;
		else if(node_x.next != node_y ){ // normal case
			Node temp1 = node_x.next;
			prev_x.next = node_y;
			node_x.next = node_y.next;
			node_y.next = temp1;
			prev_y.next = node_x;
			
		}else{	// when x and y in sequence
			System.out.println("HI");
			Node temp1 = node_x.next;
			prev_x.next = node_y;
			node_x.next = node_y.next;
			node_y.next = temp1;
			prev_y.next = node_x;
		}
	}
	
	public static void main(String[] args) {
		LinkedListSwapNodes l_list = new LinkedListSwapNodes();
		l_list.push(1);
		l_list.push(4);
		l_list.push(2);
		l_list.push(7);
		l_list.push(12);
		l_list.push(20);
		l_list.push(13);

		// Linked List before swapping
		System.out.println("Linked List before swapping:");
		l_list.traverse();
		l_list.swapNodes(20, 12);
		
		// Linked List after swapping
		System.out.println("\nLinked List after swapping:");
		l_list.traverse();
	}

}
