
Date:31-10-2022
# Day 5: Algorithms & Data Structures 
-----------------------------------------
      Topics:

        -Sorting
        -Heap
        -Linked list

Quick Sorting:
---------------
    -divide and conquer
    -3 steps:
      -Identify pivot element
      -Partition
      -recursion

     10 80 70 90 30 20

         80 70 90 30 20 90

       10 20 30 40 79 60 90 50

        10 5 7 9 11 12 18 22

Example:
--------
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
        int i =(low);//

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

Heap:
------
    Definition:
    A special form of complete binary tree that
     key value of each node is no smaller ( larger ) 
     than the key value of its children (if  any).

    14, 12, 7, 10, 8, 6


Homework:

    Q1. Create a heap and perform following operation:(Max heap)
    20, 15, 2, 14, 10
    1. Insert 5
    2. Insert 21
    3. Delete
    4. Delete

    Q2.Create a heap and perform following operation:(Max heap)
    73,74,81,79,90,93,1
    1. Insert 51
    2. Insert 121
    3. Delete
    4. Delete

    Q3.Create a heap and perform following operation:(Max heap)
    97, 93, 84, 90, 79, 83, 81, 42, 55, 73, 21, 83
    1. Insert 1
    2. Insert 100
    3. Delete
    4. Delete

Max heap Implementation:
-------------------------
    static void heapify(int a1[], int n, int i)
    {
      int largest = i;
      int l=2*i;//left child
      int r=2*i+1;//right child

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
    
Linked list:
------------
    -sequence of data structures, which are connected together via links.	
      -sequence of links
      -connections between nodes
      -most used data structure
      -provides lot of flexibility
	
    Terms: 
      -Link :data=element, link=address
      -Next	: next is a link: address
      -Data	: any primitive data types
      -Linked list : connection of links : 

      -First node of linked list = starting node of list
      -Last node of linked list = link is null
      -chain of nodes....
	
Types of Linked List:
-------------------------

![image](https://user-images.githubusercontent.com/72081819/198998101-c8668d5c-1036-4190-ad17-2b2e5d958d2c.png)

    1. Simple linked list
    -navigation is in forward direction

    2. Doubly linked list
    -navigation is in forward abd backward direction

    3. Circular linked list
    -last item contains link of the first element

Node structure:
----singly Linked List-----

    class Node{

      int data;
      Node next;
      Node(int d)
      {
        data = d;
        next = null;
      }

    }

