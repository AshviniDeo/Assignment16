package bridgeLabz;



class MyNode<E> {
	E data;
	MyNode next;

	public MyNode(E data) {
		this.data = data;
		next = null;

	}

	@Override
	public String toString() {
		return "MyNode [data=" + data + ", next=" + next + "]";
	}
}

public class MyLinkedList<E> implements MyStack, IList<E> {
	MyNode top;
	int size = 0;

	
	
	@Override
	public Object push(int data) {
		MyNode newNode = new MyNode(data);
		if (top == null) {
			top = newNode;
		} else {
			MyNode temp = top;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size += 1;
		return null;
	}

	public Object print() {
		MyNode temp = top;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
		return null;
	}

	@Override
	public boolean isEmpty() {
		MyNode temp = head;
		if (temp == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void pop() {
		MyNode temp = top;
		MyNode prev = top;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;

	}

	@Override
	public Object peek() {
		if (top == null) {
			return top;
		} else {
			MyNode temp = top;
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp.data;
		}

	}

	MyNode head;

	@Override
	public void addElement(Object data) {
		MyNode node = new MyNode(data);
		if (head == null) {
			head = node;
		} else {
			MyNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	@Override
	public void removeElement(E data) {
		MyNode temp = head;
		MyNode prev = head;
		if (temp.data == (data)) {
			head = temp.next;
		} else {
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
				if (temp.data == data) {
					prev.next = temp.next;
					break;
				}
			}
		}
		if (head.data != data) {
			System.out.println("Invalid Node Details");
		}

	}

	@Override
	public void search(Object data) {
		MyNode temp = head;
		if (head.data == data) {
			temp = head;
			System.out.println("Your Data :" + temp.data);
		} else {
			while (temp.next != null) {
				temp = temp.next;
				if (temp.data == data) {
					System.out.println("Your data :" + temp.data);
				}
			}
		}
		if (head.data != data) {
			System.out.println("Invalid Node Details");
		}

	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public void append(Object data) {
		MyNode node = new MyNode(data);
		if (head == null) {
			head = node;
		} else {
			MyNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	@Override
	public void insert(Object pos, Object data) {
		MyNode node = new MyNode(data);
		MyNode temp = head;
		if (head.data == pos) {
			MyNode prev = head.next;
			head.next = node;
			node.next = prev;

		} else {
			while (temp.next != null) {
				MyNode prev = head.next;
				head.next = node;
				node.next = prev;
			}
			temp.next = node;
		}
	}

	@Override
	public Object push(Object o) {
		MyNode newNode = new MyNode(o);
		if (top == null) {
			top = newNode;
		} else {
			MyNode temp = top;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size += 1;
		return null;
	}

	
}
