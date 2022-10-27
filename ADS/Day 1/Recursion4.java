class Recursion3
{
	
	static int fact(int n)
	{
		if(n<=100)
			return 1;
		else
			return n*fact(n+1);
	}
public static void main(String args[])
{
	System.out.println(	fact(115));
}
}