package edu.ds.adt;

import java.util.HashMap;

public class Stack{
	HashMap<Integer,Object> storage = new HashMap<Integer, Object>();
	int counter = 0;
	public Stack() {}
	void push(Object value) {
		storage.put(++counter, value);
	}
	Object pop() {
		return isEmpty()?null:storage.remove(counter--);
	}
	Object peep() {
		return isEmpty()? null: storage.get(counter);
	}
	boolean isEmpty() {
		return counter == 0;
	}
}
