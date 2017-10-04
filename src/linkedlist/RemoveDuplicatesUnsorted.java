package linkedlist;

import java.util.HashSet;

import linkedlist.RemoveDuplicates.Node;

public class RemoveDuplicatesUnsorted {

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
	
	public void removeDuplicatesHMap(){
		HashSet<Integer> hset = new HashSet<Integer>();
		Node temp = head;
		Node prev = null;
		while(temp != null){
			if(hset.contains(temp.data))
				prev.next = temp.next;
			else{
				hset.add(temp.data);
				prev = temp;
			}
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicates l_list = new RemoveDuplicates();
		l_list.push(55);
		l_list.push(22);
		l_list.push(44);
		l_list.push(44);
		l_list.push(33);
		l_list.push(22);
		l_list.push(99);
		l_list.push(11);

		l_list.traverse();
		l_list.removeDuplicatesHMap();
		System.out.println("\nRemoved duplicates");
		l_list.traverse();

	}

}
