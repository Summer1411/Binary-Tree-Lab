//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree {
	private TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(Comparable val) {
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree) {
		if (tree == null)
			tree = new TreeNode(val);

		else {
			Comparable treeValue = tree.getValue();
			int dirTest = val.compareTo(treeValue);


			if (dirTest <= 0)
				tree.setLeft( add(val, tree.getLeft()));
			else if (dirTest > 0)
				tree.setRight( add(val, tree.getRight()));
		}
		return tree;
	}
	public void inOrder() {
		// left, root, right
		inOrder(root);
		System.out.println("\n\n");
	}
	private void inOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}
	//add preOrder, postOrder, and revOrder
	public void revOrder() {
		// right, data, left
		revOrder(root);
		System.out.println("\n\n");
	}
	private void revOrder(TreeNode tree)
	{ if (tree != null) {
		revOrder(tree.getRight());
		System.out.print(tree.getValue() + " ");
		revOrder(tree.getLeft());}}
	public void preOrder() {
		revOrder(root);
		System.out.println("\n\n");
	}
	private void preOrder(TreeNode tree)
	{ if (tree != null) {
		System.out.print(tree.getValue() + " ");
		revOrder(tree.getLeft());
		revOrder(tree.getRight());}}
	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}



	//add getNumLeaves, getDiameter, getHeight, getNumNodes, and isFull


	
	//add extra credit options here - 10 points each
	
	//search
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return root.toString();
	}

	private String toString(TreeNode tree)
	{
		return tree.toString();
	}

























}