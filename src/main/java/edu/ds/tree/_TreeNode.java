package edu.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class _TreeNode {
	Comparable data;
	_TreeNode left,right;
	_TreeNode(Comparable item) {
		if(null != item) {
			data = item;
		}
		left = right = null;
	}
	@Override
	public String toString() {
		return "data="+data+"; left="+(left==null?"null":left.data)+"; right="+(right==null?"null":right.data);
	}
	public static void inorder(_TreeNode root) {
		if(null != root) {
			inorder(root.left);
			System.out.print(root.data+", ");
			inorder(root.right);
		}
		return;
	}
	
	public static void preorder(_TreeNode root) {
		if(null != root) {
			System.out.print(root.data+", ");
			inorder(root.left);
			inorder(root.right);
		}
		return;
	}
	
	public static void postorder(_TreeNode root) {
		if(null != root) {
			inorder(root.left);
			inorder(root.right);
			System.out.print(root.data+", ");
		}
		return;
	}
	
	public static void bfsorder(_TreeNode root) {
		if(null != root) {
			Queue<_TreeNode> q = new LinkedList<_TreeNode>();
			q.add(root);
			while(!q.isEmpty()) {
				_TreeNode parent = q.poll();
				if(null != parent) {
					System.out.print(parent.data+", ");
				}
				if(null != parent.left)
					q.add(parent.left);
				if(null != parent.right)
					q.add(parent.right);
			}
		}
	}
}
