
# Desired_Array


You have an array with N elements. Initially, each element is 0. You can perform the following operations:


**1. Increment operation:**  

   Choose one element of the array and increment the value by one.

**2. Doubling operation:**

   Double the value of each element.



You are given a int[] desiredArray containing N elements.

Compute and return the smallest possible number of operations needed to change the array from all zeroes to desiredArray.

   **Sample Test Case 1:**

     Input :     {2,1}

     Output :     3

One of the optimal solutions is to apply increment operation to element 0 twice and then to element 1 once.

Total number of operations are 3.

   **Sample Test Case 2:**

         Input :    {16,16,16}

         Output :    7

The optimum solution looks as follows:

First, apply an increment operation to each element. Then, apply the doubling operation four times.

Total number of operations are: 3+4 = 7

   **Sample Test Case 3:**


       Input :    {100}

       Output :    9




   **Sample Test Case 4:**

       Input :     {0,0,1,0,1}

       Output :      2

Some elements in the desiredArray may be zeroes.


   **Sample Test Case 5:**

       Input :      {123,234,345,456,567,789}

       Output :      40
