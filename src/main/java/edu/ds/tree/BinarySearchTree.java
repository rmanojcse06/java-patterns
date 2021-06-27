package edu.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * @author rmanojcse06@gmail.com
 * */
public class BinarySearchTree {
	private _TreeNode root = null;

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
	public void delete(Comparable d) {
		_TreeNode removalNode = root;
		_TreeNode parent = root;
		if(null != removalNode) {
			while (removalNode != null) {
				int comparison = removalNode.data.compareTo(d);
				if(comparison == 0) {
					// Select the node to be deleted
					System.out.println("Selected for delete "+removalNode);
					
					boolean isLeaf 			= (null == removalNode.left) && (null == removalNode.right);
					boolean hasOneBranch	= (null != removalNode.left) ^ (null != removalNode.right);
					boolean hasTwoBranches 	= (null != removalNode.left) && (null != removalNode.right);
					
					System.out.println(removalNode.data+" is "+(isLeaf?"leaf":hasOneBranch?"hasOneBranch":hasTwoBranches?"hasTwoBranches":"nil"));
					if(isLeaf || hasOneBranch) {
						if(parent.left == removalNode) 
							if(null != removalNode.left)
								parent.left = removalNode.left;
							else if(null != removalNode.right)
								parent.left = removalNode.right;
							else
								parent.left = null;
						else if(parent.right == removalNode) 
							if(null != removalNode.left)
								parent.right = removalNode.left;
							else if(null != removalNode.right)
								parent.right = removalNode.right;
							else
								parent.right = null;
					}
					
					if (hasTwoBranches) {
						// get maximum on the left most of selected node
						_TreeNode selectedNode = removalNode.left;
						Stack<_TreeNode> s = new Stack<>();
						s.push(selectedNode);
						System.out.println("....... Adding "+selectedNode.data);
						while(null != selectedNode.right) {
							s.push(selectedNode.right);
							System.out.println("....... Adding "+selectedNode.right.data);
							selectedNode = selectedNode.right;
						}

						
						// copy the value to removalNode
						_TreeNode deleteableNode = s.pop();
						if(null != deleteableNode) {
							removalNode.data = deleteableNode.data;
						}
						
						// remove the selected node
						if(s.isEmpty()) {
							removalNode.left = null;
						}else {
							_TreeNode parentNode = s.pop();
							parentNode.right = null;
						}	
					}
					
					break;
					// swap till selected node and all its right branches
				}else if (comparison > 0) {
					parent = removalNode;
					removalNode = removalNode.left;
				}else if (comparison < 0) {
					parent = removalNode;
					removalNode = removalNode.right;
				}
			}
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bstTree = new BinarySearchTree();
		int[] arr = null;
		arr = new int[]{15,7,22,5,10,18,26,3,6,8,12,17,20,24,28,2,4,9,11,16,19,23,25,29,30,21};
//		arr = new int[]{10,5,15,3,7,13,17,2,4,6,8,12,14,16,25};
//		arr = new int[]{10,5,15,3,7,17,2,4,6,8,16,25};
		for(int i : arr) {
			bstTree.insert(i);
		}
		System.out.println("  ================= ");
		System.out.println("Bfsorder: ");_TreeNode.bfsorder(bstTree.root);
//		System.out.println(bstTree.find(bstTree.root, 5));
		System.out.println("\n\n");
		
		int[] rArr = new int[] {22,15,7,29,30};
		for(int remove : rArr) {
			bstTree.delete(remove);
			System.out.println("\n after deleting("+remove+"):: Bfsorder: ");_TreeNode.bfsorder(bstTree.root);
		}
	}
}
