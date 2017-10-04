package linkedlist;

public class MergeTwoSortedLists {

	Node head1, head2;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public Node push(Node head, int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		return head;
	}
	
	public void traverse(Node head){
		Node temp = head;
		while(temp!= null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public Node mergeLists(Node head1, Node head2){
		Node temp1 = head1, temp2 = head2;
		Node head = new Node(0);
		if(temp1 == null && temp2 == null){
			System.out.println("Both lists are empty");
			return null;
		}
		Node temp = head;
		while(temp1 != null && temp2 != null){
			if(temp1.data < temp2.data){
				temp.next = new Node(temp1.data);
				temp1 = temp1.next;
			}
			else{
				temp.next = new Node(temp2.data);
				temp2 = temp2.next;
			}
			temp = temp.next;
		}
		while(temp1 != null){
			temp.next = new Node(temp1.data);
			temp1 = temp1.next;
			temp = temp.next;
		}
		while(temp2 != null){
			temp.next = new Node(temp2.data);
			temp2 = temp2.next;
			temp = temp.next;
		}
		return head.next;
	}
	
	public static void main(String[] args) {
		MergeTwoSortedLists l_list = new MergeTwoSortedLists();
		l_list.head1 = null;
		l_list.head2 = null;
		l_list.head1 = l_list.push(l_list.head1, 50);
		l_list.head1 = l_list.push(l_list.head1, 40);
		l_list.head1 = l_list.push(l_list.head1, 30);
		l_list.head1 = l_list.push(l_list.head1, 20);
		l_list.head1 = l_list.push(l_list.head1, 10);
		System.out.println("Values in List 1");
		l_list.traverse(l_list.head1);
		
		l_list.head2 = l_list.push(l_list.head2, 35);
		l_list.head2 = l_list.push(l_list.head2, 23);
		l_list.head2 = l_list.push(l_list.head2, 12);
		l_list.head2 = l_list.push(l_list.head2, 2);
		System.out.println("\nValues in List 2");
		l_list.traverse(l_list.head2);
		System.out.println("\nValues in merged list");
		Node head = l_list.mergeLists(l_list.head1, l_list.head2);
		l_list.traverse(head);
		
	}

}
