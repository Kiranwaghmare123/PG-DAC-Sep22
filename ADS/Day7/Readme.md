Date:2-11-2022
Day 7: Algorithms & Data Structures 
-----------------------------------------
Topics:

	-Linked list
	-Doubly Linked List

// Revere a linked list

Linked list: 
10 --> 20--> 30 --> 40
40 --> 30 --> 20 --> 10

10
10

Node reverse(Node head)
{
	Node prev = null;
	Node curr = head;
	Node next = null;
	
	while(curr != null)
	{
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		
	}
	head = prev;
	return head;
}

Doubly Linked List:
-------------------
-variation of linked list in which navigation is possible in both ways.
-in forward and backward direction.

Q. Differentiation between SLL & DLL.
Q. How Circular linked list is different than SLL and DLL.

SLL:
DLL:
CLL:


DLL operations:
----------------
-Insertion
	-At the begining
	-At end
	-In between 2 nodes
-Deletion
	-At the begining
	-At end
	-In between 2 nodes
-Traversal
	-Forward
	-Backward
	
Node structure:
----------------
class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int d)
	{
		data = d;
		prev=next=null;
	}
	
}

Insertion Operation:
--------------------
case 1: Insert at begining.

static void insert(int new_data)
{
	Node new_Node = new Node(new_data);
	new_Node.next = head;
	new_Node.prev = null;
	if(head != null)
		head.prev = new_node;
	head = new_Node;
	
}
