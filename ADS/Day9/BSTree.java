class BSTree{
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
	
	BSTree()
	{
		root = null;
	}
	BSTree(int d)
	{
		root = new Node(d);
	}
	
	 Node printinsert(Node root, int key)
	 {
		 if(root == null)
		 {
			 root = new Node(key);
			 return root;
		 }
		 if(key <= root.data)
				root.left = printinsert(root.left,key);
			else
				root.right = printinsert(root.right,key);
			return root;
	 }
	 
	 
	 
	 void insert(int key)
	 {
		 root =printinsert(root, key);
	 }
	 
	 
	 
 void printPreorder(Node n)// Root, LC, RC
 {
	 if(n == null)
		 return;
	 
	 System.out.print(n.data+" ");
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
	  System.out.print(n.data+ " ");
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
	  System.out.print(n.data+ " ");
 
 }
 void postorder()
 {
	  printPostorder(root);
 }
 
 
 
Node printdelete(Node root, int key)
{
	//Empty tree
	if(root == null)
		return root;
	if(key < root.data)
		root.left =  printdelete(root.left,key);
	else if(key > root.data)
		root.right =  printdelete(root.right,key);
	else
	{
		//case 1: leaf node : Lc=RC= null
		//case 2:one child : Lc-->RC replace. RC--> replace LC
		if(root.left == null)
			return root.right;
		else if(root.right == null)
			return root.left;
		//case 3: Two children
			root.data = minvalue(root.right);
			root.right = printdelete(root.right,root.data);
	}
	return root;
					
	}
	
	int minvalue(Node root)
	{
		int x = root.data;
		while(root.left != null)
		{
			x = root.left.data;
			root = root.left;
		}
		return x;
	}
	
	void delete(int key)
	{
		root = printdelete(root,key);
	}
	public static void main(String args[])
	{
		BSTree t1 = new BSTree();
		t1.insert(15);
		t1.insert(7);
		t1.insert(21);
		t1.insert(5);
		t1.insert(35);
		t1.insert(2);
		t1.insert(62);
		t1.insert(19);
		
		//System.out.println("Preorder.....");
	//	t1.preorder();
		System.out.println("\nInorder.....");
		t1.inorder();
		//System.out.println("\nPostorder.....");
		//t1.postorder();
		//case 1:
		t1.delete(2);
		System.out.println("\nInorder case 1.....");
		t1.inorder();
		
		
		//case 2:
		t1.delete(7);
		System.out.println("\nInorder case 2.....");
		t1.inorder();
		
		//case 3:
		t1.delete(15);
		System.out.println("\nInorder case 3.....");
		t1.inorder();
		
		
	}
}