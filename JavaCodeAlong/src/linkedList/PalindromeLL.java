package linkedList;


public class PalindromeLL {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	void PrintLinkedList(Node node) {
		while(node!=null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
	public int size() {
		int size = 0;
		Node currNode = head;
		while(currNode!=null) {
			size++;
			currNode = currNode.next;
		}
		return size;
	}
	public Node Reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	public boolean checkPalindrome() {
		PalindromeLL ll = new PalindromeLL();
		boolean check = false;
		Node newHead = head;
		Node first = head;
		int size = ll.size();
		int mid = size/2;
		int idx = 0;
		while(idx!=mid) {
			newHead = newHead.next;
			idx++;
		}
		Node head1 = ll.Reverse(newHead);
		while(first!=null && head1!=null && first.next!=null && 
				head1.next!=null) {
			if(first.data == head1.data) {
				check = true;
				first = first.next;
				head1 = head1.next;
			}
		}
		
		return check;
	}
	public static void main(String[] args) {
		PalindromeLL ll = new PalindromeLL();
		ll.addFirst(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(2);
		ll.addLast(1);
		ll.PrintLinkedList(head);
		System.out.println(ll.checkPalindrome());
	}

}
