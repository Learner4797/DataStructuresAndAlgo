package linkedList;

public class LengthOfLoop {

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
	public void printList(Node node) {
		Node temp = node;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
	public int lengthOfLoop() {
		Node slow = head;
		Node fast = head;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				slow = slow.next;
				break;
			}
		}
		int size = 1;
		while(slow!=fast) {
			slow = slow.next;
			size++;
		}
		return size;
	}
	public static void main(String[] args) {
		LengthOfLoop ll = new LengthOfLoop();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.head.next.next.next.next.next = ll.head.next;
		System.out.println(ll.lengthOfLoop());
		

	}

}
