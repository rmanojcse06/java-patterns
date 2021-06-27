package edu.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @author rmanojcse06@gmail.com
 * */
public class BinarySearchTree {
	private _TreeNode root = null;
	class _TreeNode{
		Comparable data;
		_TreeNode left, right;
		public _TreeNode(Comparable data) {
			this.data = data;
			this.left = this.right = null;
		}
		@Override
		public String toString() {
			return "data="+data+"; left="+(left==null?"null":left.data)+"; right="+(right==null?"null":right.data);
		}
	}
	public void insert(Comparable data) {
		if(null == root) {
			root = new _TreeNode(data);
			System.out.println("Adding "+data+" to parent");
			return;
		}
		
		Queue<_TreeNode> q = new LinkedList<>();
		q.add(root);
		_TreeNode parent = null;
		while((parent = q.poll())!=null) {
			if(parent.data.compareTo(data) > 0) {
				if(null == parent.left) {
					parent.left = new _TreeNode(data);
					System.out.println("Adding "+data+" to left of parent "+parent.data);
					return;
				}
				q.add(parent.left);
			}else {
				if(null == parent.right) {
					parent.right = new _TreeNode(data);
					System.out.println("Adding "+data+" to right of parent "+parent.data);
					return;
				}
				q.add(parent.right);
			}
		}
	}
	public _TreeNode find(_TreeNode parent, Comparable d) {
		if(null != parent) {
			int comparison = parent.data.compareTo(d);
			if(comparison == 0) {
				return parent;
			}
			if(comparison > 0) {
				return find(parent.left, d);
			}else if(comparison < 0) {
				return find(parent.right, d);
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree bstTree = new BinarySearchTree();
		for(int i : new int[]{10,5,15,3,7,13,17,2,4,6,8,12,14,16,18,1,11}) {
			bstTree.insert(i);
		}
		System.out.println(bstTree.find(bstTree.root, 5));
	}
}
