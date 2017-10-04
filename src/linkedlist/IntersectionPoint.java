package linkedlist;

import java.util.HashSet;

public class IntersectionPoint {
	
	Node head1, head2;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	public boolean findIntersection(){
		Node temp1 = head1;
		Node temp2 = head2;
		
		while(temp1 != null){
			while(temp2 != null){
				if(temp1 == temp2){
					return true;
				}else{
					temp2 = temp2.next;
				}
			}
			temp2 = head2;
			temp1 = temp1.next;
		}
		return false;
	}
	
	public boolean findIntersectionHMap(){
		HashSet<Node> hset = new HashSet<Node>();
		Node temp1 = head1;
		// Traversing first list and saving the nodes in hashset
		while(temp1 != null){
			hset.add(temp1);
			temp1 = temp1.next;
		}
		// Traversing other list and checking whether other list node present in hashset
		Node temp2 = head2;
		while(temp2 != null){
			if(hset.contains(temp2))
				return true;
			temp2 = temp2.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		IntersectionPoint l_list = new IntersectionPoint();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		Node _first = new Node(1);
		
		
		l_list.head1 = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		l_list.head2 = _first;
		_first.next = second;

		System.out.println(l_list.findIntersection());
		System.out.println(l_list.findIntersectionHMap());
	}

}
