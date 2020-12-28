package structures.queue;

import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E> {
	
	private LinkedList<E> list = new LinkedList<E>();

	@Override
	public void clear() {
		//Fill your code here
		list.clear();
	}

	@Override
	public void enqueue(E item) {
		//Fill your code here
		list.addLast(item);
	}

	@Override
	public E dequeue() {
		//Fill your code here
		if (list.isEmpty()){
			return null;
		}
		else {
			E temp = list.getFirst();
			list.removeFirst();
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
