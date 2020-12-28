package structures.stack;

import java.util.LinkedList;

public class LinkedStack<E> implements Stack<E> {

	private LinkedList<E> list = new LinkedList<E>();

	@Override
	public void clear() {
		//Fill your code here
		list.clear();
	}

	@Override
	public void push(E item) {
		//Fill your code here
		list.addLast(item);
	}

	@Override
	public E pop() {
		//Fill your code here
		if (list.isEmpty()){
			return null;
		}
		else {
			E temp = list.getLast();
			list.removeLast();
			return temp;
		}
	}

	@Override
	public int length() {
		//Fill your code here
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		//Fill your code here
		return list.isEmpty();
	}
}
