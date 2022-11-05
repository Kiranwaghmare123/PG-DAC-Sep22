class Queue
{
	int size = 5;
	int Q[] = new int[size];
	int front, rear;
	
	Queue()
	{
		front = -1;
		rear = -1;
	}

	boolean isFull()
	{
		if(front == 0 && rear == size-1)
		{
			return true;
		}
		return false;	
	}
	
		boolean isEmpty()
	{
		if(front == -1)
		
			return true;
		else
			return false;	
	}
	
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Full !!!");
		}
		else
		{
			if(front == -1)
				front = 0;
			rear++;
			Q[rear] = x;
			System.out.println(x+" Inserted");
			
		}
	}
	
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Empty !!!");
			return -1;
		}
		else
		{
			x=Q[front];
			if(front >= rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
			System.out.println(x+"Deleted !!!");
			return x;
		}
			
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty !!!");
		}
		else
		{
			System.out.println("Front :"+front);
			System.out.println("---------");
			for(int i = front;i<=rear;i++)
				System.out.println(Q[i]+" ");
			
			System.out.println("Rear :"+rear);
		}
	}
	
	public static void main(String args[])
	{
		Queue q = new Queue();
		q.enqueue();//underflow
		q.enqueue(11);
		q.enqueue(22);
		q.enqueue(33);
		q.enqueue(44);
		q.enqueue(55);
		q.enqueue(66);//overflow
		q.display();
		q.dequeue();
		q.display();
	}
}

====================================
package que;

//Deque implementation in Java

class Dque {
static final int MAX = 100;
int DQ[];
int front;
int rear;
int size;

public Dque(int size) {
 DQ = new int[MAX];
 front = -1;
 rear = 0;
 this.size = size;
}

boolean isFull() {
 return ((front == 0 && rear == size - 1) || front == rear + 1);
}

boolean isEmpty() {
 return (front == -1);
}

void insertfront(int key) {
 if (isFull()) {
   System.out.println("Overflow");
   return;
 }

 if (front == -1) {
   front = 0;
   rear = 0;
 }

 else if (front == 0)
   front = size - 1;

 else
   front = front - 1;

 DQ[front] = key;
}

void insertrear(int key) {
 if (isFull()) {
   System.out.println(" Overflow ");
   return;
 }

 if (front == -1) {
   front = 0;
   rear = 0;
 }

 else if (rear == size - 1)
   rear = 0;

 else
   rear = rear + 1;

 DQ[rear] = key;
}

void deletefront() {
 if (isEmpty()) {
   System.out.println("Queue Underflow\n");
   return;
 }

 // Deque has only one element
 if (front == rear) {
   front = -1;
   rear = -1;
 } else if (front == size - 1)
   front = 0;

 else
   front = front + 1;
}

void deleterear() {
 if (isEmpty()) {
   System.out.println(" Underflow");
   return;
 }

 if (front == rear) {
   front = -1;
   rear = -1;
 } else if (rear == 0)
   rear = size - 1;
 else
   rear = rear - 1;
}

int getFront() {
 if (isEmpty()) {
   System.out.println(" Underflow");
   return -1;
 }
 return DQ[front];
}

int getRear() {
 if (isEmpty() || rear < 0) {
   System.out.println(" Underflow\n");
   return -1;
 }
 return DQ[rear];
}

public static void main(String[] args) {

 Dque dq = new Dque(4);

 System.out.println("Insert element at rear end : 12 ");
 dq.insertrear(12);

 System.out.println("insert element at rear end : 14 ");
 dq.insertrear(14);

 System.out.println("get rear element : " + dq.getRear());

 dq.deleterear();
 System.out.println("After delete rear element new rear become : " + dq.getRear());

 System.out.println("inserting element at front end");
 dq.insertfront(13);

 System.out.println("get front element: " + dq.getFront());

 dq.deletefront();

 System.out.println("After delete front element new front become : " + +dq.getFront());

}
}