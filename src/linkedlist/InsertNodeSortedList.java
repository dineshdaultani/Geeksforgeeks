package linkedlist;

public class InsertNodeSortedList {

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
		System.out.println("\nContents of list are: ");
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void insertNode(int data){
		Node new_node = new Node(data);
		Node temp = head;	
		if(head == null || new_node.data <= head.data){
			new_node.next = head;
			head = new_node;
			return;
		}else{
			Node prev = null;
			while(temp!= null && temp.data < new_node.data){
				prev = temp;
				temp = temp.next;
			}
			new_node.next = temp;
			prev.next = new_node;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeSortedList l_list = new InsertNodeSortedList();
		l_list.push(70);
		l_list.push(60);
		l_list.push(50);
		l_list.push(40);
		l_list.push(30);
		l_list.push(20);
		l_list.push(10);
		
		l_list.traverse();
		
		l_list.insertNode(33);
		
		l_list.traverse();
		
	}

}
