/**
 * 
 */
package com.mnc;

/**
 * @author bharat_2
 *
 */
public class MNCApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MNC mnc= new MNC();
		mnc.root =mnc.new Node(50);
		mnc.root.left =mnc.new Node(30);
		mnc.root.right = mnc.new Node(60);
		mnc.root.left.left = mnc.new Node(10);
		mnc.root.right.left= mnc.new Node(55);
		mnc.inorder();
	}
}
