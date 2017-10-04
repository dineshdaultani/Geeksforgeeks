package linkedlist;

import java.util.HashSet;

public class DetectLoop {

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
		System.out.println("Linked List contents are as follows:");
		while(temp != null){
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public boolean detectLoop(){
		HashSet<Node> hset = new HashSet<Node>();
		Node temp = head;
		while(temp != null){
			if(hset.contains(temp))
				return true;
			else
				hset.add(temp);
			temp = temp.next;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		DetectLoop l_list = new DetectLoop();
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		
		l_list.head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;

		//l_list.traverse();
		System.out.println("Loop exists: " + l_list.detectLoop());
		
	}

}
