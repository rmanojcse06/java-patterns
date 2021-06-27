package edu.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @author rmanojcse06@gmail.com
 * */
public class BinaryTree {
	private _TreeNode root = null;
	public void insert(Comparable data) {
		if(null == root) {
			root = new _TreeNode(data);
			System.out.println("Adding "+data+" to parent");
		}else {
			Queue<_TreeNode> q = new LinkedList<_TreeNode>();
			q.add(root);
			_TreeNode parent = null;
			while((parent = q.poll())!=null) {
				if(null == parent.left) {
					parent.left = new _TreeNode(data);
					System.out.println("Adding "+data+" to left of parent "+parent.data);
					q.clear();
					return;
				}
				if(null == parent.right) {
					parent.right = new _TreeNode(data);
					System.out.println("Adding "+data+" to right of parent "+parent.data);
					q.clear();
					return;
				}
				q.add(parent.left);
				q.add(parent.right);
			}
		}
		return;
	}
	
	
	public void delete(Object data) {
		Queue<_TreeNode> q = new LinkedList<>();
		_TreeNode parent = q.poll();
		
	}
	
	public _TreeNode find(_TreeNode parent, Object data) {
		if(null != parent) {
			if(parent.data.equals(data)) {
				return parent;
			}
			if(null != parent.left) {
				return find(parent.left,data);
			}
			if(null != parent.right) {
				return find(parent.right,data);				
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		BinaryTree biTree = new BinaryTree();
		for(int i : new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17}) {
			biTree.insert(i);
		}
		System.out.println(biTree.find(biTree.root, 2));
		System.out.println("\n Bfsorder: ");_TreeNode.bfsorder(biTree.root);
//		System.out.println("\n Preorder: ");_TreeNode.preorder(biTree.root);
//		System.out.println("\n Inorder: ");_TreeNode.inorder(biTree.root);
//		System.out.println("\n Postorder: ");_TreeNode.postorder(biTree.root);
	}
	
}
