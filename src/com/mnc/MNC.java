/**
 * 
 */
package com.mnc;

/**
 * @author bharat_2
 *
 */
public class MNC {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;
	// Root of SkewedTree
	Node skewedroot;

	public void insertInScewedTree(int value) {
		System.out.print(value + " ");
		if (skewedroot == null) {
			skewedroot = new Node(value);
			// System.out.println("Created root");
		} else {
			Node tempNode = skewedroot;
			int i = 1;
			while (tempNode.right != null) {
				tempNode = tempNode.right;
				i++;
			}
			tempNode.right = new Node(value);
			// System.out.println("Added level "+ i);
		}
	}

	// Constructor
	MNC() {
		root = null;
	}

	// This method mainly calls Inorder()
	Node inorder() {
		inorderRec(root);
		return skewedroot;
	}

	// A utility function to
	// do inorder traversal of BST
	private void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			insertInScewedTree(root.key);
			inorderRec(root.right);
		}
	}

}
