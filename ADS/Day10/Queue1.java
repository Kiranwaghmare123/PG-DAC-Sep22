class Queue1{
	int size = 5;
	int Q[] = new int[size];
	int rear, front;
	
	Queue1()
	{
		front=-1;
		rear=-1;
	}
	
	boolean isEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	
	boolean isFull()
	{
		if(front == 0 && rear == size-1)
			return true;
		else
			return false;
	}
	
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(front == -1)
				front =0;
			rear++;
			Q[rear] = x;
			System.out.println(x+" Inserted.");
			
		}
	}
	
	int dequeue()
	{
		int x;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		return -1;
		}
		else
		{
			x=Q[front];
			if(front >= rear )
			{
				front = -1;
				rear = -1;
			}
			else{
				front++;
			}
			System.out.println(x+"Deleted.");
			return x;
		}
	}
	
	void display()
	{
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
		{
			for(int i=front; i<=rear;i++)
				System.out.println(Q[i]);
		}
	}
	public static void main(String args[])
	{
		Queue1 q1 = new Queue1();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.enqueue(15);
		q1.enqueue(15);
		q1.enqueue(16);
		q1.display();
		q1.dequeue();
		q1.display();
		q1.enqueue(16);
		q1.display();
	}
}