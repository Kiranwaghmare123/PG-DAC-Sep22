class Array
{
	private int[]a1;
	private int n;
	
	public Array(int max)
	{
		a1 = new int[max];
		n=0;
	}
	public void display()
	{
		for(int j=0;j<n;j++)
			System.out.print(a1[j]+" ");
		System.out.println();
	}
	public void insert(int value)
	{
		a1[n] =  value;
		n++;
	}
	public boolean search(int key)
	{
		int j;
		for(j=0;j<n;j++)
			if(a1[j] == key)//compare
				break;
		if(j == n)//0-9 == n=9, All element are compared
			return false;
		else
			return true;
					
	}
	
	public boolean delete(int value)
	{
		int j;
		for(j=0;j<n;j++)
			if(a1[j] == value)
				break;
		if(j == n)
			return false;
		else 
		{
			for(int k=j;k<n;k++)
				a1[k] = a1[k+1];
			n--;
			return true;
		}
	}
	
}
class ArrayApp
{
public static void main(String args[])
	{
		int size=100;
		Array a = new Array(size);
		a.insert(12);
		a.insert(22);
		a.insert(34);
		a.insert(56);
		a.insert(78);
		a.insert(45);
		a.insert(34);
		a.insert(0);
		a.insert(45);
		a.insert(67);
		
		a.display();
		boolean x =a.search(45);
		if(x)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		a.delete(34);
		a.display();
	}	
}
