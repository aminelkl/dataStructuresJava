// Implementation of a generic linkedList


public class LinkedList<T> {

	public Node head;

	// Insert an element at the end of the linkedlist
	void insertAtEnd(T data) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
		}

		else {
			Node travelNode = new Node();
			travelNode = head;

			while (travelNode.next != null) {
				travelNode = travelNode.next;
			}
			travelNode.next = node;
		}
	}

	// Print all elements
	void show() {
		Node n = new Node();
		n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	// Insert an element as the first one
	void insertAtFirst(T data) {
		Node n = new Node();
		n.data = data;

		n.next = head;
		head = n;
	}

	// Insert an element at an exact index
	void insertAt(T data, int positionAt) {
		Node n = new Node();
		n.data = data;
		if (positionAt == 0) {
			insertAtFirst(data);
		} else {
			Node travelNode = new Node();
			travelNode = head;
			for (int i = 1; i < positionAt; i++) {
				travelNode = travelNode.next;
			}
			n.next = travelNode.next;
			travelNode.next = n;
		}
	}

	// Remove the first element
	void removeFirst() {
		head = head.next;
	}

	// remove an element at an exact index
	void removeAt(int positionAt) {
		if (positionAt == 0) {
			removeFirst();

		} else {
			Node n1;
			Node travelNode = new Node();
			travelNode = head;
			for (int i = 1; i < positionAt; i++) {
				travelNode = travelNode.next;
			}
			n1 = travelNode.next;
			travelNode.next = n1.next;
		}
	}

}
