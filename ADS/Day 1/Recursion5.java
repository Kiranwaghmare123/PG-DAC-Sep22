class Recursion5
{
	static void toh(int n,char s, char inter, char d)
	{
		if(n==1)
			System.out.println(s+" to "+d);
		else
		{
			toh(n-1,s,d,inter);
			System.out.println(s+" to "+d);
			toh(n-1,inter,s,d);
			
			
		}
	}
	public static void main(String args[])
	{
		int n=7;
		toh(n,'A','B','C');
	}
}


