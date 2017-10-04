package linkedlist;

public class IntersectionTwoSortedLists {

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
		System.out.println("\nContents of the list are: ");
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public Node findIntersectionList(Node head1, Node head2){
		Node head = new Node(0);
		if(head1 == null && head2 == null)
			return head.next;
		else{
			Node temp1 = head1, temp2 = head2, temp = head;
			while(temp1 != null && temp2 != null){
				if(temp1.data == temp2.data){
					temp.next = new Node(temp1.data);
					temp = temp.next;
					temp1 = temp1.next; temp2 = temp2.next;
				}else if( temp1.data < temp2.data)
					temp1 = temp1.next; 
				else
					temp2 = temp2.next;
			}
			return head.next;
		}
	}
	
	public static void main(String[] args) {
		IntersectionTwoSortedLists l_list = new IntersectionTwoSortedLists();
		l_list.head1 = l_list.push(l_list.head1, 50);
		l_list.head1 = l_list.push(l_list.head1, 40);
		l_list.head1 = l_list.push(l_list.head1, 30);
		l_list.head1 = l_list.push(l_list.head1, 20);
		l_list.head1 = l_list.push(l_list.head1, 10);
		
		l_list.head2 = l_list.push(l_list.head2, 55);
		l_list.head2 = l_list.push(l_list.head2, 44);
		l_list.head2 = l_list.push(l_list.head2, 30);
		l_list.head2 = l_list.push(l_list.head2, 25);
		l_list.head2 = l_list.push(l_list.head2, 20);
		l_list.head2 = l_list.push(l_list.head2, 11);
		l_list.head2 = l_list.push(l_list.head2, 10);
		
		l_list.traverse(l_list.head1);
		l_list.traverse(l_list.head2);

		Node head = l_list.findIntersectionList(l_list.head1, l_list.head2);
		l_list.traverse(head);
		
	}

}
