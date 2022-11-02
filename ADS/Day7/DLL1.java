class DLL1
{
	static Node head;
	
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data = d;
			prev=next=null;
		}
	}
	
	static void insert(int new_data)
	{
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;
		if(head != null)
			head.prev = new_Node;
		head = new_Node;
	}

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
	
public static void main(String args[])
{
	DLL1 d1 = new DLL1();
	
	insert(10);
	insert(20);
	insert(30);
	insert(40);
	insert(50);
	display(d1.head);
	
}

	

}