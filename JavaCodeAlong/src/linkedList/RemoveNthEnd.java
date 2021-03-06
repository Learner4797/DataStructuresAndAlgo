package linkedList;


public class RemoveNthEnd {

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
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
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
	public void removeNthFromEnd(int idx) {
		RemoveNthEnd ll = new RemoveNthEnd();
		int size = ll.size();
		int index = size-idx;
		int x = 1;
		Node curr = head;
		while(x!=index) {
			x++;
			curr = curr.next;
		}
		curr.next = curr.next.next;
	}
	public static void main(String[] args) {
		RemoveNthEnd ll = new RemoveNthEnd();
		ll.addFirst(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.printList();
		ll.removeNthFromEnd(2);
		ll.printList();

	}

}
