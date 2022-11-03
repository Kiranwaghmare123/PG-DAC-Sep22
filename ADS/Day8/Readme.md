Date:3-11-2022
Day 8: Algorithms & Data Structures 
      -----------------------------------------
      Topics:

        -Doubly Linked List
        -Tree
	
Print DLL:

      static void display(Node n)
        {
          Node last = null;

          System.out.println("Forward .....");
          while(n != null)
          {	
            System.out.print(n.data+ " ");
            last = n;
            n=n.next;
          }
          System.out.println();
          System.out.println("Backward .....");
          while(last != null)
          {	
            System.out.print(last.data+ " ");
            last=last.prev;
          }
        }
	
Insert at end:

      void append(int new_data)
      {
        Node new_Node = new Node(new_data);
        Node temp = head;
        new_Node.next = null;
        if(head==null)
        {
          new_Node.prev = null;
          head = new_Node;
          return;	
        }
        while(temp.next != null)
        {
          temp=temp.next;
        }
        temp.next = new_Node;
        new_Node.prev = temp;

      }

Insert in between:

      void insertAfter(int new_data, Node temp)
      {
        if(head==null)
          return;
        Node new_Node = new Node(new_data);
        new_Node.next = temp.next;
        temp.next = new_Node;
        new_Node.prev = temp;
        new_Node.next.prev = new_Node;


      }

Deletion:

    void deleteNode(Node temp)
    {
      if((head == null) || (temp == null))
        return;

      //case 1: head deletion
      if(head == temp)
      {
        head = temp.next;
        //head.prev = null;
      }
      //case 2 and case 3 : deletion
      //Last node in the lis ???
      if(temp.next != null)
        temp.next.prev = temp.prev;
      if(temp.prev != null)
        temp.prev.next = temp.next;

      return;

    }

Tree:

    -A tree is a non-linear data structure that represents a 
    hirarchical relationship among the various data elements.

    Node: Each node in a tree is trefered as a node.
    Root node: Topmost element in a tree is called root.
    Leaf node: Node with no childrens.
    Subtree: portion of tree, which can be viewed as a separate  tree.
    Children of a node:Roots of the subtree of a node are called as 
      the children of the node
    Degree of a node:refers to the number of subtrees/childrens 
      of a node in a tree
    Siblings:

    Binary Tree:
    - specific type of tree, in which each node can have at most two children.
    more specifically left child and right child.

Types of tree:

    1. Strictly Binary tree
    2. Full Binary tree
    3. Complete binary tree.

    1. Strictly Binary tree:
    - every node, except for leaf nodes, 
      has non-empty left and right children.
      -0-2:strictly

    2. Full Binary tree:
    -A binary tree in which every node has 2 children except leaf nodes 
    is known as full binary tree.
    -binary tree of depth 'd' that contains exactly 2 -1 node.

    3. Complete binary tree.
    -binary tree with n nodes and depth d whose nodes corresponds to the nodes 
    numbereded to the nodes numbered from 0 to n-1 in the full binary tree of depth k.


    4. InComplete binary tree.


Relationship between parent and children:
-----------------------------------------

    parent = i=0
    Left child = 2*i = 0
    Right child = 2*i+1 =0 + 1

Tree Node structure:


    class Node{

      int data;
      Node left, right;

      Node(int d)
      {
        data=d;
        left = right = null;
      }
    }

Tree traversal:
---------------

    1.Preorder
      Root, LC, RC : 2-1-3
    2.Inorder
      LC, Root, RC : 1-2-3
    3.Postorder
      LC, RC, Root  : 1-3-2



    Preorder: R,L,Rg
    10, 8,	5, 9,  12

    In order: Lc, R, Rt
    5 8 9 10 12

    Postorder: L Rt, R
    5 9 8 12 10

 Preorder:
 
     void printPreorder(Node n)// Root, LC, RC
     {
       if(n == null)
         return;

       System.out.println(n.data);
       printPreorder(Node n.left);
       printPreorder(Node n.right);

     }
     void prorder()
     {
        printPreorder(root);
     }

Inorder:

      void printInorder(Node n)// LC, Root, RC
     {
       if(n == null)
         return;

       printInorder(Node n.left);
        System.out.println(n.data);
       printInorder(Node n.right);

     }
     void prorder()
     {
        printInorder(root);
     }
 
 Postorder:
 
       void printPostorder(Node n)// LC, RC, Root,
     {
       if(n == null)
         return;

       printPostorder(Node n.left);
       printPostorder(Node n.right);
        System.out.println(n.data);

     }
     void postorder()
     {
        printPostorder(root);
     }
