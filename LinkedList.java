package bridgeLabz.linkedList;

class Node{
	int data;
	Node nextPointer;
	@Override
	public String toString() {
		return "Node [data=" + data + ", nextPointer=" + nextPointer + "]";
	}
	public Node(int data) {
		this.data = data;
		this.nextPointer = null;
	}
}

public class LinkedList {

	static Node head;

	public void addNode(int data) {

		Node node = new Node(data);
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			while(temp.nextPointer != null) {
				temp = temp.nextPointer;
			}
			temp.nextPointer = node;
		}

	}

	public void displayNode() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.nextPointer;
		}

	}

	public void removeNode(int data) {
		Node temp = head;
		Node prev = head;
		if(temp.data == (data)) {
			head = temp.nextPointer;
		}else {
			while(temp.nextPointer != null) {
				prev = temp;
				temp = temp.nextPointer;
				if(temp.data == data) {
					prev.nextPointer =temp.nextPointer;
					break;
				}
			}
		}
		if(head.data != data) {
			System.out.println("Invalid Node Details");
		}
		
	}

	public void searchNode(int data) {
		Node temp = head ;
		if(head.data == data) {
			temp = head;
			System.out.println("Your Data :" + temp.data);
		}else {
			while(temp.nextPointer != null) {
				temp = temp.nextPointer;
					if(temp.data == data) {
					System.out.println("Your data :" + temp.data);
				}
			}
		}
		if(head.data != data) {
			System.out.println("Invalid Node Details");
		}
		
	}

	public void sort() {
	 boolean swapped;
		Node temp;
		Node prev = null;
		if(head == null) {
			return;
		}
		do {
			swapped = false;
			temp = head;
			while(temp.nextPointer != prev) {
				if(temp.data > temp.nextPointer.data) {
					int temporary = temp.data;
					temp.data = temp.nextPointer.data;
					temp.nextPointer.data = temporary;
					swapped = true;
				}
				temp = temp.nextPointer;
			}
			prev = temp;
		}while(swapped);
		
	}

	
}
