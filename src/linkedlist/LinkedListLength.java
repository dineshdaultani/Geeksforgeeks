package linkedlist;

public class LinkedListLength {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public int countNodesIterative(){
		int count = 0;
		Node temp = head;
		while(temp != null){
			count ++;
			temp = temp.next;
		}
		return count;
	}
	
	public int countNodesRecursion(Node temp){
		if(temp == null)
			return 0;
		else
			return 1 + countNodesRecursion(temp.next);
	}
	
	public void push(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public static void main(String[] args) {
		LinkedListLength l_list = new LinkedListLength();
		l_list.push(10);
		l_list.push(20);
		l_list.push(30);
		l_list.push(30);
		l_list.push(30);
		l_list.push(30);
		
		System.out.println("Total length of the linkedlist when iterating is: " + l_list.countNodesIterative());
		System.out.println("Total length of the linkedlist when counting recursively is: " + 
																				l_list.countNodesRecursion(l_list.head));
	}
}
