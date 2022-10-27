class Recursion1
{
	static int i=0;
static void show()
{
	
	++i;
	if(i<=5)//termination condition or base condition
	{
		System.out.println("Happy diwali !!!");
		show();//Recursive call
	}
}

public static void main(String args[])
{
	show();
}
}