Date:28-10-2022
# Day 2: Algorithms & Data Structures 
-----------------------------------------
	Topics:
		-Recursion
		-Arrays

	
AB

BA

-----ABC

A(BC)

ACB

BAC

BCA

CAB

CBA

-----

ABCD

A(B(C(D)))

B(A(C(D)))

C(A(B(D)))

D(A(B(C)))


# Homework:
	1.write a recursive program for reverse a string.(2/3 types)
	2.write a recursive program to reverse a sentence.

# Types of recursive:
--------------------
	1. Tail recursion:

		void fun(int n)
		{
			if(n<0)
					SOP(n);
			else
				fun(n-1);//recursive function call
		}

	2. Head recursion
	void fun(int n)
		{
			if(n<0)
					SOP(n);
			else
				fun(n-1);//recursive function call
				SOP("hhjkjkd");
				SOP("hhjkjkd");
				SOP("hhjkjkd");
				SOP("hhjkjkd");
		}
		
# Linear & Non-linear:
----------------------
	Terminologies:

	Linear: data are arranged in sequence.
	Non-linear:data elements are not  arranged in sequence.
	Homogeneous:similar type of elements.
	-primitive data type:
		-int, float, byte, double, long
	Non-homogeneous:Vector,
	Static:
	Dynamic:

	Note: Data type and Data structure

# Array:
------
	Array is an finite,ordered, and homogenous collection of elements.
	Type of indexing:
	----------------------
		0:zero-based indexing
		1:one-based indexing
		n:n-based indexing


	int a1[5]={};
	int a1[]={1,2,3,4};//HW

# Operations:
-----------
	Insert
		-single element: O(1)
		-n elements: O(n)
	Delete
		-single element: O(1)
		-n elements: O(n)
	Search
		-n elements: O(n)
		-Best case: O(1)
		-Average case: O(n)
		-Worst case: O(n)
	Access:
		-O(1)
	Display


# Size of Array:
----------------
	Size(A)= U-L+1
			=4-0+1
			=5

			U=365
			L=211

# Address of Array:
------------------
	1-D:
	----
	A[i]=M+(i-L)*w
	M=100, i=2, int
	A[2]=100+(2-0)*2
		=104

	2-D:
	----
	Row major Order:
	-----------------
	Address[aij]=M+(i-1)*n+j-1
	M=100
	a13=100+(1-1)*4+3-1
	=102

	Column major Order:
	-------------------
	Address[aij]=M+(j-1)*m+i-1
	a13=100+(3-1)*3+1-1
	=106


