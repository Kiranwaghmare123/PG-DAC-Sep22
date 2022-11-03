class BTree{
	static Node root;
	
	static class Node{
	
	int data;
	Node left, right;
	
	Node(int d)
	{
		data=d;
		left = right = null;
	}
	}
	
	BTree()
	{
		root = null;
	}
	BTree(int d)
	{
		root = new Node(d);
	}
	
	 
 void printPreorder(Node n)// Root, LC, RC
 {
	 if(n == null)
		 return;
	 
	 System.out.println(n.data);
	 printPreorder(n.left);
	 printPreorder(n.right);
 
 }
 void preorder()
 {
	  printPreorder(root);
 }
 
  void printInorder(Node n)// LC, Root, RC
 {
	 if(n == null)
		 return;
	 
	 printInorder(n.left);
	  System.out.println(n.data);
	 printInorder(n.right);
 
 }
 void inorder()
 {
	  printInorder(root);
 }
 
 
   void printPostorder(Node n)// LC, RC, Root,
 {
	 if(n == null)
		 return;
	 
	 printPostorder(n.left);
	 printPostorder(n.right);
	  System.out.println(n.data);
 
 }
 void postorder()
 {
	  printPostorder(root);
 }
	public static void main(String args[])
	{
		BTree t1 = new BTree();
		root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(12);
		root.left.left = new Node(5);
		root.left.right = new Node(9);
		
		System.out.println("Preorder.....");
		t1.preorder();
		System.out.println("Inorder.....");
		t1.inorder();
		System.out.println("Postorder.....");
		t1.postorder();
		
	}
}