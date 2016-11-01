public class ReverseSinglyLinkedList {

	/**
	 * @param args
	 */

	Node head;
	class Node {
		Node next;
		int data;

		Node(int datavalue) {
			data = datavalue;
			next = null;
		}
	}

	public void add(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void reverse() {
		Node current = head, next = null, prev = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;

	}

	public void ptintlist() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(9);
		list.add(10);
		list.ptintlist();
		list.reverse();
		System.out.println("after reverce");
		list.ptintlist();
	}

}
