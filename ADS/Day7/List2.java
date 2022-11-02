class List2
{
	static Node head;

	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	static void insert(int new_data)
{
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
}
static void append(int new_data)
{
	Node new_node = new Node(new_data);
	if(head == null)// List is empty
	{
		head = new Node(new_data);//new node as 1st node in the list
		return;
	}
	
	new_node.next = null;
	Node n =head;//naya reference banaya
	while(n.next != null)//Loop:jab tak end nahi aata hai...tab tak loop chalega
	{
		n=n.next;
	}
	n.next = new_node;//last link ko connect karenge new node ke sath
	return;
}

static void insertAfter(Node prev, int new_data)
{
	Node new_node = new Node(new_data);
	//Follow the sequence
		new_node.next = prev.next;//1
		prev.next = new_node;//2
	
}
static void deleteNode(int key)//key=52
{
	Node temp = head, prev =null;
	//case 1 : delete at begining
	if(temp !=null && temp.data == key)
	{
		head=temp.next;//head shift karega
		return;
	}
	//remaining cases
	while(temp != null && temp.data != key)
	{
		prev =temp;
		temp=temp.next;
		
	}
	if(temp == null)
		return;
	prev.next = temp.next;
	
		
}
	
	 void display()
	{
		Node n = head;	
		while(n != null)
		{
			System.out.print(n.data+"--->");
			n=n.next;
		}
	}
	
	public static void main(String args[])
	{
		
		List2 l1 = new List2();
		
		l1.display();
		System.out.println("Empty List !!!");
		append(2);
		insert(5);
		insert(15);
		insert(25);
		insert(35);
		append(22);
		append(52);
		insertAfter(head,38);
		insertAfter(head.next,59);
		insertAfter(head.next.next,78);
		l1.display();
		
		deleteNode(35);
		System.out.println();
		l1.display();
		
		deleteNode(5);
		System.out.println();
		l1.display();
		
		deleteNode(52);
		System.out.println();
		l1.display();
	}
	
}