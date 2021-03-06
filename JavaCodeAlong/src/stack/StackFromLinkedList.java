package stack;

public class StackFromLinkedList {

	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static class Stack{
		public boolean isEmpty() {
			return head==null;
		}
		public void push(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			int data = head.data;
			return data;
		}
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
	}
	public static void main(String[] args) {
		StackFromLinkedList.Stack s = new StackFromLinkedList.Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
