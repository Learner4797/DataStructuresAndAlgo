package linkedList;

public class LLImplementation {

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
	public void printList() {
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode = currNode.next;
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
	public void removeFirst() {
		LLImplementation ll = new LLImplementation();
		int size = ll.size();
		if(size==0) {
			System.out.println("List is Empty...");
		}else if(size==1) {
			head = null;
		}else {
			Node currNode = head;
			head = head.next;
			currNode.next = null;
		}
	}
	public void removeLast() {
		LLImplementation ll = new LLImplementation();
		int size = ll.size();
		if(size==0) {
			System.out.println("List is Empty...");
		}else if(size==1) {
			head = null;
		}else {
			Node currNode = head;
			while(currNode.next.next!=null) {
				currNode = currNode.next;
			}
			currNode.next = null;
		}
	}
	public void addAtIndex(int data,int idx) {
		LLImplementation ll = new LLImplementation();
		int size = ll.size();
		Node newNode = new Node(data);
		if(idx>size || idx<0) {
			System.out.println("You can only insert between 0 to "+size+" index");
		}
		Node currNode = head;
		int curridx = 1;
		while(curridx!=idx) {
			currNode = currNode.next;
			curridx++;
		}
		Node temp = currNode.next;
		currNode.next = newNode;
		newNode.next = temp;
	}
	public void removeAtIndex(int idx) {
		LLImplementation ll = new LLImplementation();
		int size = ll.size();
		if(idx>size || idx<0) {
			System.out.println("You can only remove between 0 to "+size+" index");
		}
		Node currNode = head;
		int curridx = 1;
		while(curridx!=idx) {
			curridx++;
			currNode = currNode.next;
		}
		currNode.next = currNode.next.next;
	}
	public int searchLL(int elem) {
		Node currNode = head;
		int idx = 0;
		while(currNode.data!=elem) {
			idx++;
			currNode = currNode.next;
		}
		return idx;
	}
//	public void deleteGreater(int elem) {
//		Node currNode = head;
//		LLImplementation ll = new LLImplementation();
//		
//	}
	public void reverseIterate() {
		Node prev = head;
		Node curr = head.next;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			// update
			prev = curr;
			curr = next;
		}
		head.next = null;
		head = prev;
	}
	public static void main(String[] args) {
		LLImplementation ll = new LLImplementation();
		ll.addFirst(2);
		ll.addLast(3);
		ll.addLast(5);
		ll.addFirst(23);
		ll.addLast(65);
		ll.addFirst(22);
		ll.printList();
		System.out.println("The size of LinkedList is: "+ll.size());
		ll.removeFirst();
		ll.printList();
		System.out.println("The size of LinkedList is: "+ll.size());
		ll.removeLast();
		ll.printList();
		System.out.println("The size of LinkedList is: "+ll.size());
		ll.addAtIndex(17, 2);
		ll.addAtIndex(32, 3);
		ll.addAtIndex(27, 4);
		ll.printList();
		System.out.println("The size of LinkedList is: "+ll.size());
		ll.removeAtIndex(3);
		ll.removeFirst();
		ll.printList();
		System.out.println("The size of LinkedList is: "+ll.size());
		System.out.println("Index of this elem is : "+ll.searchLL(17));
//		ll.deleteGreater(10);
		ll.reverseIterate();
		ll.printList();
		System.out.println("The size of LinkedList is: "+ll.size());
		
	}

}
