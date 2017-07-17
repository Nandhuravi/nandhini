import java.util.*;
	import java.io.*;
public	class assymetric
	{
	    int data;
	    assymetric left, right;
	  
	    assymetric(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	  
	class BinaryTree 
	{
	    assymetric root;
	    int countNodes(assymetric root) 
	    {
	        if (root == null)
	            return (0);
	        return (1 + countNodes(root.left) + countNodes(root.right));
	    }
	  
	  
	    boolean isComplete(assymetric root, int index, int number_nodes)
	    {
	        
	        if (root == null)        
	           return true;
	        if (index >= number_nodes)
	           return false;
	  
	        
	        return (isComplete(root.left, 2 * index + 1, number_nodes)
	            && isComplete(root.right, 2 * index + 2, number_nodes));
	  
	    }
	    public static void main(String args[]) 
	    {
	        BinaryTree tree = new BinaryTree();
	        assymetric NewRoot = null;
	        tree.root = new assymetric(1);
	        tree.root.left = new assymetric(2);
	        tree.root.right = new assymetric(3);
	        tree.root.left.right = new assymetric(5);
	        tree.root.left.left = new assymetric(4);
	        tree.root.right.right = new assymetric(6);
	          
	        int node_count = tree.countNodes(tree.root);
	        int index = 0;
	          
	        if (tree.isComplete(tree.root, index, node_count))
	            System.out.print("The binary tree is symentric");
	        else
	            System.out.print("The binary tree is assymetric"); 
	    }
	}


