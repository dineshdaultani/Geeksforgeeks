package linkedlist;

public class LinkedListSearch {
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
	
	public boolean searchElementIterative(int key){
		Node temp = head;
		while(temp != null){
			if(temp.data == key)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	public boolean searchElementRecursively(int key, Node temp){
		if(temp == null)
			return false;
		else if(temp.data == key)
			return true;
		else 
			return searchElementRecursively(key, temp.next);
	}
	
	public static void main(String[] args) {
		LinkedListSearch l_list = new LinkedListSearch();
		l_list.push(1);
		l_list.push(2);
		l_list.push(3);
		l_list.push(14);
		l_list.push(8);
		l_list.push(4);
		
		// Searching Iteratively
		if(l_list.searchElementIterative(11))
			System.out.println("Element found Iteratively");
		else
			System.out.println("Element not found Iteratively");
		
		// Searching Recursively
		if(l_list.searchElementRecursively(11, l_list.head))
			System.out.println("Element found Recursively");
		else
			System.out.println("Element not found Recursively");
	}
}
