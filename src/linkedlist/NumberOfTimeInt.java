package linkedlist;

public class NumberOfTimeInt {

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
		while(temp != null){
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public int getCount(int key){
		Node temp = head;
		int count = 0;
		while(temp!= null){
			if(temp.data == key)
				count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		NumberOfTimeInt l_list = new NumberOfTimeInt();
		l_list.push(1);
		l_list.push(2);
		l_list.push(3);
		l_list.push(4);
		l_list.push(2);
		l_list.push(2);
		l_list.push(3);
		l_list.push(2);
		
		System.out.println("Count is: " + l_list.getCount(2));
	}

}
