class Sorting{
	static void bsort(int a1[])
	{
	int n =a1.length;
	for(int i=0;i<n-1;i++)//pass
	{
		for(int j=0;j<n-i-1;j++)//internal iterations
		{
			if(a1[j] > a1[j+1])
			{
				//exchange
				int temp = a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				
			}
			
				display(a1);
				System.out.println();
				
		
		}
		//display(a1);
		
	}
	}
	
	static void ssort(int a1[])
{
	int n=a1.length;
	for(int i=0;i<n-1;i++)
	{
		int min = i;
		for(int j=i+1;j<n;j++)
		{
			if(a1[j] < a1[min])
				min =j;
		}
		//swapping 
		int temp = a1[min];
		a1[min]=a1[i];
		a1[i]=temp;
	}
}

static void isort(int a1[])
{
	int n=a1.length;
	for(int i=1;i<n;++i)
	{
		int key = a1[i];
		int j=i-1;
		
		while(j>=0 && a1[j] > key)
		{
			a1[j+1]=a1[j];
			j=j-1;
		}
		a1[j+1]=key;
		display(a1);
				System.out.println();
	}
}


static void mergesort(int a1[],int l, int h)
{
	if(l<h)
	{
		int m=l+(h-l)/2;
		mergesort(a1,l,m);
		mergesort(a1,m+1,h);
		merge(a1,l,m,h);
		
	}

}

static void merge(int a1[],int l, int m, int h)
{
	int n1= m-l+1;
	int n2= h-m;

	int L[]= new int[n1];
	int R[]= new int[n2];

	for(int i=0;i<n1;i++)
		L[i]=a1[l+i];

	for(int j=0;j<n2;j++)
		R[j]=a1[m+1+j];
	

	int i=0,j=0;
	int k=l;
	while(i<n1 && j<n2)
	{
		if(L[i] <= R[j])
		{
			a1[k]=L[i];
			i++;
		}
		else
		{
			a1[k]=R[j];
			j++;
		}
		k++;
	
	}
	while(i<n1)
	{
		a1[k] = L[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		a1[k] = R[j];
		j++;
		k++;
	}


}

static void quicksort(int a1[],int low, int high)
{
	if(low<high)
	{
		int pi=partition(a1, low, high);
		quicksort(a1, low,pi-1);//Left side
		quicksort(a1, pi+1, high);//Right side

	}
}

static int partition(int a1[],int low, int high)
{
		int pivot=a1[high];
		int i =(low -1);//
		
		for(int j=low;j<high;j++)
		{
			if(a1[j] < pivot)
			{
				i++;
				swap(a1,i,j);
			}
			
		}
		swap(a1,i+1,high);
		return (i+1);
		
}

static void swap(int a1[],int i, int j)
{
	int temp = a1[i];
	a1[i]=a1[j];
	a1[j]=temp;
}
	
	static void display(int a1[])
	{
		int n =a1.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}

static void heapify(int a1[], int n, int i)
{
	int largest = i;
	int l=2*i+1;//left child
	int r=2*i+2;//right child
	
	if(l<n && a1[l] > a1[largest])
		largest = l;
	if(r<n && a1[r] > a1[largest])
		largest = r;
	
	if( largest != i)
	{
		int temp = a1[i];
		a1[i]=a1[largest];
		a1[largest]=temp;
		heapify(a1, n, largest);
	}
	
}

static void heapsort(int a1[])
{
	int n = a1.length;
	for(int i=n/2-1;i>=0;i--)
		heapify(a1,n,0);
	
	for(int i=n-1;i>=0;i--)
	{	
	int temp = a1[0];
	a1[0]=a1[i];
	a1[i]=temp;
	
	heapify(a1,i,0);//balancing the max heap
	}
	
}	
		
	public static void main(String args[]){
		//int a1[] = new int[10];
		int a1[]={2,13,24,45,9,30};
		int n =a1.length;
		display(a1);
		System.out.println();
		//bsort(a1);
		//ssort(a1);
		//isort(a1);
		//mergesort(a1,0,n-1);
		//quicksort(a1, 0, n-1);
		heapsort(a1);
		System.out.println("Heap sort");
		display(a1);
		
		
		
	}
}