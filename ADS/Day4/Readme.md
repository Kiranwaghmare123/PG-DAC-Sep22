Date:30-10-2022
Day 4: Algorithms & Data Structures 
-----------------------------------------
Topics:

	-Sorting
	-Heap
	
Sorting:
---------
    -all items i sequence
    -Asending ordere (increasing )
    -Desending order (decressing )

Types of sorting:
---------------------
    1. Internal sorting
      -Main memory 
    2. External sorting
      -Main meory + auxillary memory

stable and unstable:
---------------------
    2 5 7 9 4 6 5 1

    1 2 4 5 5 6 7 9


    1 2 4 5 5 6 7 9

Sorting Techniques:
----------------------

    -Bubble sorting
    -Insertion sorting
    -Selection sorting
    -Merge sorting
    -Quick sorting
    -Heap sorting
    -----------------
    Bucket sorting
    shell sorting
    radix sorting


Bubble sorting:
---------------
	-comparision
	
	 5  3   8   4   6
	 3	5	8	4	6
	 3 	5	8	4	6
	 3	5	4	8	6
	 3	5	4	6	8
	 
	 3	5	4	6	8
	 3	5	4	6	8
	 3	4	5	6	8
	 3	4	5	6	8
	 3	4	5	6	8

    void bsort(int a1[])
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
        }
      }

    }
	 
Selection sort:
----------------

    min=2
    2	5	4	7
    2	5	4	7
    2	4	5	7
    2 	4	5	7
    2 	4	5	7

    void ssort(int a1[])
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
        a[i]=temp;
      }
    }

Insertion sort:
------------------

	4 3 2 10 12 1 5 6
	4 3 2 10 12 1 5 6
	3 4 2 10 12 1 5 6
	2 3 4 10 12 1 5 6
	2 3 4 10 12 1 5 6
	2 3 4 10 12 1 5 6
	1 2	3 4 10 12 5 6
	1 2	3 4 10 12 5 6
	1 2	3 4 5 6	10 12
	
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
      }
    }

------------------------
Example:

    for(int i=1;i<n;i*2)
    {
      stmt;
    }
      Assume, i>=n
        i=2^k

        2^k >= n

        2^k = n

        k = log n
-------------------------

Divide and Conquer:

    -Binary search
    -Merge sort
    -Quick sort
    -Binsary search tree


    -break a problem into sub problem that are similar to the original problem.
    -3 parts:
      -Divide a problem: n number of sub problems
      -Conquer the sub problem: recursive algorithms.
      -Combine the solutions: solution for the original problem.
	
Merge sort:
------------

    -follws divide and conquer strategy
    -divide an array in 2 parts 
    -recursive order

    n---->elements in the array

Example: 

    A = 2 8 15 18
    B = 5 9 12 17

    C = 2 5 8 9 12 15 17 18    
    -----------------------------
    -2-ways sorting
    -merge sorting


     0 1 2 3 4 5 6 7 : index
     9 3 7 5 6 4 8 2 : array
     l			   h
    9 3  7 5 6 4 8 2
    3 9  5 7 4 6 2 8

    3 5  7 9 2 4 6 8

    2 3 4 5 6 7 8 9


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

    void merge(int a1[],int l, int m, int h)
    {
      int n1= m-l-1;
      int n2= h-m;

      int L[]= new int[n1];
      int R[]= new int[n2];

      for(int i=0;i<n1;i++)
        L[i]=a1[l+1];

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
