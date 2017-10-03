package linkedlist;
import java.util.HashMap;
public class GetMiddleElement {

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
	
	public int getMiddleElementHMap(){
		int index = 0;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		Node temp = head;
		while(temp != null){
			hmap.put(index, temp.data);
			index++;
			temp = temp.next;
		}
		return hmap.get(index/2);
	}
	
	public int getMiddleElement(){
		Node fast_ptr = head;
		Node slw_ptr = head;
		while(fast_ptr != null && fast_ptr.next != null){
			fast_ptr = fast_ptr.next.next;
			slw_ptr = slw_ptr.next;
		}
		return slw_ptr.data;
	}
	
	public static void main(String[] args) {
		GetMiddleElement l_list = new GetMiddleElement();
		l_list.push(10);
		l_list.push(2);
		l_list.push(130);
		l_list.push(120);
		l_list.push(90);
		l_list.push(80);
		l_list.push(111);

		System.out.println("Linkedlist contents are as follows: ");
		l_list.traverse();
		
		System.out.println("Middle element is: " + l_list.getMiddleElement());
		
		System.out.println("Middle element through hashmap is: " + l_list.getMiddleElementHMap());
	}

}
