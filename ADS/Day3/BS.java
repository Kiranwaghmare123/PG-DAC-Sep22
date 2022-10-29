class BS{
	
	
	static int bsearch(int a1[], int x, int l, int r)
	{
		if(r>=l)
		{
			int mid = l+(r-l)/2;
			
			if(a1[mid] == x)
				return mid;
			if(a1[mid] > x)
				return bsearch(a1,x,l,mid-1);
			
			return bsearch(a1, x, mid+1, r);
				
		}
		return -1;
	}
	
	public static void main(String args[]){
		
		int a1[]={2,3,4,5,9,30};
		int x=9;// search key
		int n=a1.length;
		int res = bsearch(a1,x,0,n-1);
		if(res == -1)
			System.out.println("Not found !");
		else
			System.out.println("Found !"+res);
		
	}
}