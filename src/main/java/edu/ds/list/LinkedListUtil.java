package edu.ds.list;

public class LinkedListUtil {
	
	public _SingleNode insert(_SingleNode node, Object data) {
		if(null == node) {
			return new _SingleNode(data);
		}
		_SingleNode next = node.next;
		while(next !=null) {
			node = next;
			next = next.next;
		}
		node.next = new _SingleNode(data);
		return node;
	}
	public _SingleNode delete(_SingleNode head, Object data) {
		if(null == head) {
			return head;
		}
		if(head.data.equals(data)) {
			head = head.next;
			return head;
		}
		_SingleNode node = head;
		_SingleNode next = node.next;
		while(next !=null) {
			if(next.data.equals(data)) {
				node.next = next.next;
				return head;
			}
			node = next;
			next = node.next;
		}
		return head;
		
	}
	public void print(_SingleNode node) {
		System.out.println("\nSingle Linked List ::");
		while(null != node) {
			System.out.print(node.data+", ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		LinkedListUtil sll = new LinkedListUtil();
		_SingleNode head = sll.insert(null, 1);
		for(int i=0; i<10; i++)
			sll.insert(head, 2+i);
		head = sll.delete(head, 10);
		sll.print(head);
		head = sll.delete(head, 11);
		sll.print(head);
		head = sll.delete(head, 1);
		sll.print(head);
	}
	
}
