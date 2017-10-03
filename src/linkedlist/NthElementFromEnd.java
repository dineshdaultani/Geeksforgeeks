package linkedlist;

public class NthElementFromEnd {

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
		System.out.println("Linkedlist contents are as follows: ");
		while(temp != null){
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public int getNthElementFromEnd(int n){
		Node temp = head;
		int total_elements = 0;
		while(temp != null){
			total_elements ++;
			temp = temp.next;
		}
		int index = total_elements - n - 1;
		temp = head;
		while(temp != null && index != 0){
			index--;
			temp = temp.next;
		}
		// returning value
		if(temp != null)
			return temp.data;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		NthElementFromEnd l_list = new NthElementFromEnd();
		l_list.push(1);
		l_list.push(2);
		l_list.push(3);
		l_list.push(4);
		l_list.push(5);
		l_list.push(6);
		l_list.push(7);
		l_list.push(8);
		
		l_list.traverse();
		
		System.out.println("Nth element is: " + l_list.getNthElementFromEnd(3));
		

	}

}
