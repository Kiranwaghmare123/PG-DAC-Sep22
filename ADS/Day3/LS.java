class LS{
	
	
	static int lsearch(int a1[],int x)
	{
			int n = a1.length;
			for(int i=0;i<n;i++){
				if(a1[i] == x)
					return i;
			}
			return -1;
	}
	
	public static void main(String args[]){
		
		int a1[]={2,3,4,5,9,30};
		int x=9;// search key
		int res = lsearch(a1,x);
		if(res == -1)
			System.out.println("Not found !");
		else
			System.out.println("Found !");
		
	}
}