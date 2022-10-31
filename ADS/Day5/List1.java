class List1
{
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
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
		
		List1 l1 = new List1();
		l1.head = new Node(11);
		Node second = new Node(22);
		Node third = new Node(33);
		
		l1.head.next = second;
		second.next = third;
		
		l1.display();
	}
	
}