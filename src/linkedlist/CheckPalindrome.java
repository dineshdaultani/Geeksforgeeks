package linkedlist;

import java.util.Stack;

public class CheckPalindrome {
	Node head;
	static class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(String data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void traverse(){
		Node temp = head;
		System.out.println("Contents of the list are: ");
		while(temp!= null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	// Using string and string builder
	public boolean checkPalindrome(){
		Node temp = head;
		
		String str = "";
		while(temp != null){
			str = str + temp.data;
			temp = temp.next;
		}
		StringBuilder sbuilder = new StringBuilder(str);
		if(sbuilder.reverse().toString().equals(str))
			return true;
		else
			return false;
	}
	
	// Using Stack
	public boolean checkPalindromeStack(){
		Stack<String> st = new Stack<String>();
		Node temp1 = head;
		while(temp1!= null){
			st.push(temp1.data);
			temp1 = temp1.next;
		}
		Node temp2 = head;
		while(temp2 != null && temp2.data == st.pop()){
				temp2 = temp2.next;
		}
		if(temp2 == null)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		CheckPalindrome l_list = new CheckPalindrome();
		l_list.push("A");
		l_list.push("B");
		l_list.push("C");
		l_list.push("B");
		l_list.push("A");

		System.out.println(l_list.checkPalindrome());
		System.out.println(l_list.checkPalindromeStack());
	}

}
