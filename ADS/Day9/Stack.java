class Stack{
	static final int MAX =5;
	int top;//stack ke top me konsa element hai ?
	int s[] = new int[MAX];//max size of stack
	
	Stack()
	{
		top = -1;
	}
	
	
	boolean isEmpty()
	{
		return (top < 0);
	}
	
	boolean push(int x)
	{
		if(top >= (MAX - 1))
		{
			System.out.println("Stack Overflow !!!");
			return false;
		}
		else{
			
			s[++top] = x;
			System.out.println("Push "+ x);
			return true;
			
		}
	}
		
	int pop()	
	{
		if(top <= 0)
		{
			System.out.println("Stack Underflow !!!");
			return 0;
		}
		else{
			int x = s[top--];
			//System.out.println("Pop "+x);
			return x;
		}
		
	}
	boolean isFull()
	{
		return (top == (MAX-1));
	}
	
	int peek()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow !!!");
			return 0;
		}
		else{
			int x = s[top];
			return x;
		}
	}
	
	public static void main(String args[])
	{
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		System.out.println("Pop " +s1.pop());
		
		s1.push(60);
		//s1.push(70);
		//s1.push(60);
		System.out.println("Pop " +s1.pop());
		System.out.println("Pop " +s1.pop());
		System.out.println("Pop " +s1.pop());
		System.out.println("Pop " +s1.pop());
		System.out.println("Pop " +s1.pop());
		System.out.println("Pop " +s1.pop());
	}
}