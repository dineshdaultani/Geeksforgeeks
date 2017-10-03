package linkedlist;

public class LinkedListGetNthNode {

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
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void push(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public int getNthNode(int pos){
		int index = 0;
		Node temp = head;
		while(temp!= null){
			if(index == pos)
				return temp.data;
			index++;
			temp = temp.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		LinkedListGetNthNode l_list = new LinkedListGetNthNode();
		l_list.push(10);
		l_list.push(20);
		l_list.push(30);
		l_list.push(40);
		l_list.push(50);
		l_list.push(60);
		
		System.out.println("Linked list contents are as follows: ");
		l_list.traverse();
		System.out.println("Postion contains this element: " + l_list.getNthNode(6));

	}

}
