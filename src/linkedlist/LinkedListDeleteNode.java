package linkedlist;

public class LinkedListDeleteNode {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void delete(int key){
		Node temp1 = head;
		Node temp2 = null;
		if(temp1 != null && temp1.data == key){
			head = temp1.next;
			return;
		}
			
		while(temp1 != null){
			if(temp1.data == key){
				temp2.next = temp1.next;
				return;
			}
			temp2 = temp1;
			temp1 = temp1.next;
		}
		System.out.println("Element not found!");
	}
	
	public void push(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void traverse(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListDeleteNode l_list = new LinkedListDeleteNode();
		l_list.push(10);
		l_list.push(20);
		l_list.push(30);
		l_list.push(40);
		l_list.push(50);
		
		System.out.println("Linkedlist before deleting the element");
		l_list.traverse();
		l_list.delete(10);
		System.out.println("Linkedlist after deleting the element");
		l_list.traverse();
	}
}