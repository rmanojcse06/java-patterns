package edu.ds.adt;

import java.util.HashMap;

public class Queue {
	HashMap<Integer,Object> storage = new HashMap<Integer, Object>();
	int end = 0;
	int start = 0;
	public Queue() {}
	void add(Object value) {
		storage.put(end++, value);
	}
	Object poll() {
		if (isEmpty())
			return null;
		Object o = storage.remove(start++);
		return o;
	}
	Object peep() {
		return isEmpty()?null:storage.get(start);
	}
	boolean isEmpty() {
		return start == end;
	}
}
