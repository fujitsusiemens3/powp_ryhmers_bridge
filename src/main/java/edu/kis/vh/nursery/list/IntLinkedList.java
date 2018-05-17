package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int EMPTY_LIST = -1;
	private static final int VALUE_IS_EMPTY = -1;
	private int total = EMPTY_LIST;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return VALUE_IS_EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return VALUE_IS_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void countIn(int in) {
		if (!isFull()) {
//			numbers[++total] = in;
			++total;
			push(in);
		}
	}

	public boolean callCheck() {
		return total == EMPTY_LIST;
	}


	public int peekaboo() {
		if (callCheck())
			return EMPTY_LIST;
		return last.getValue();
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_LIST;
		--total;
		return last.getValue();
	}

	private class Node {

		private int value;
		/*
		 * W klasie IntLinkedList zmieniło się z bezpośredniego odwołania do tego atrybutu
		 * na pośrednie, przez getValue()
		 */
		private Node prev;
		private Node next;
		/*
		 * To samo co wyżej, dodatkowo do przypisania wartości zostało wykorzystane 
		 * setPrev() i setNext()
		 */

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
}
