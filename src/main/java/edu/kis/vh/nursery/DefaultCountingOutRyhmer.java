package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.stack.Stackable;

public class DefaultCountingOutRyhmer {

	private Stackable list;
	/*
	 * Umożliwia nam to wykorzystanie dowolnego typu implementującego interfejs Stackable.
	 * W tym przypadku mamy możliwość wyboru między IntLinkedList a IntArrayStack
	 */
	
	public DefaultCountingOutRyhmer() {
		list = new IntLinkedList();
	}
	
	public DefaultCountingOutRyhmer(Stackable list) {
		this.list = list;
	}

	public int getTotal() {
		return list.getSize();
	}

	public void countIn(int in) {
		list.push(in);
	}

	public boolean callCheck() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return list.isFull();
	}

	public int countOut() {
		return list.pop();
	}
	
	protected int peekaboo() {
		return list.top();
	}
	
}
