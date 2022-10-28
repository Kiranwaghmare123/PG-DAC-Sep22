class Array1
{
		
	public static void main(String args[])
	{
		
		int a1[];
		a1= new int[100];
		int i,n=0;
		
		a1[0]=11;
		a1[1]=77;
		a1[2]=33;
		a1[3]=22;
		a1[4]=66;
		a1[5]=88;
		a1[6]=55;
		a1[7]=44;
		a1[8]=99;
		a1[9]=110;
		n=10;
		//display
		for(i=0;i<=9;i++)
		{
			System.out.print(a1[i]+" ");
		}
		
		//search
		int key=66;
		for(i=0;i<=n;i++)
		{
			if(a1[i] == key)
				break;
		}
		if(a1[i] == key )
				System.out.println("Found");
			else
				System.out.println("Not Found");
		
		//display
		for(i=0;i<=n;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		//delete
		key=55;
		for(i=0;i<=n;i++)
		{
			if(a1[i] == key)
				break;
		}
		for(int k=i;k<=n;k++)
		{
			a1[k]=a1[k+1];
		
					
		}
			n--;
		//display
		for(i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}

	}
	
	
}
