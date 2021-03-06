package linkedList;


public class CheckCyclic {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void push(int new_data)
    {
        Node new_node = new Node(new_data);
 
       
        new_node.next = head;
 
        
        head = new_node;
    }
	public boolean checkCycle() {
		boolean check = false;
		Node slow = head;
		Node fast = head;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				check = true;
				break;
			}else check = false;
		}
		return check;
	}
	public static void main(String[] args) {
		CheckCyclic llist = new CheckCyclic();
		 llist.push(20);
	        llist.push(4);
	        llist.push(15);
	        llist.push(10);
	 
	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;
	        System.out.println(llist.checkCycle());
	 

	}

}
