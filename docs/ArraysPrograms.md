1. Find the Factorial of Numbers in an Array

Question: Write a Java program to find the factorial of each number in a given array.

Explanation: Calculate the factorial of every array element. The factorial of a number is the product of all positive integers up to that number. The factorial of  0 is 1.

Example Input:

[3, 5, 0, 1]


Expected Output:

3  -> 6
5  -> 120
0  -> 1
1  -> 1


Test Cases:

| Input   | Expected Output |
|-----------|---------------|
| [2, 3, 4] | [2, 6, 24] 	|
| [0, 1]    | [1, 1] 		|
| [5]       | [120] 		|
| [] 	    | []			|
| [-2]      | Invalid input |
----------------------------------------------------------------------------------------------

2. Find the Sum of Elements in an Array

Question:
Write a Java program to find the sum of all elements in a given array.

Explanation:
Add all the elements of the array and display their total sum.

Example Input:
[10, 20, 30, 40]

Expected Output:
Sum of array elements: 100

Test Cases:

1. Input: [1, 2, 3]
   Expected Output: 6

2. Input: [10, 20, 30]
   Expected Output: 60

3. Input: [5]
   Expected Output: 5

4. Input: [-1, 2, -3]
   Expected Output: -2

5. Input: []
   Expected Output: 0
-----------------------------------------------------------------------------------------------
3. Find the Product of Elements in an Array

Question:
Write a Java program to find the product of all elements in a given array.

Explanation:
Multiply all the elements of the array and display the final product.

Example Input:
[2, 3, 4, 5]

Expected Output:
Product of array elements: 120

Test Cases:

1. Input: [2, 3, 4]
   Expected Output: 24

2. Input: [5]
   Expected Output: 5

3. Input: [1, 2, 3]
   Expected Output: 6

4. Input: [2, 0, 5]
   Expected Output: 0

5. Input: [-2, 3, 4]
   Expected Output: -24

6. Input: []
   Expected Output: 1 (if using the conventional empty-product definition)
  
----------------------------------------------------------------------------------------------
4. Find the Average of Array Elements

Question:
Write a Java program to find the average of all elements in a given array.

Explanation:
Calculate the sum of all array elements and divide it by the total number of elements.

Example Input:
[10, 20, 30, 40, 50]

Expected Output:
Average of array elements: 30.0

Test Cases:

1. Input: [10, 20, 30]
   Expected Output: 20.0

2. Input: [5]
   Expected Output: 5.0

3. Input: [1, 2, 3, 4]
   Expected Output: 2.5

4. Input: [-10, 20, 30]
   Expected Output: 13.3333...

5. Input: [0, 0, 0]
   Expected Output: 0.0

6. Input: []
   Expected Output: Undefined (handle the empty array separately to avoid division by zero)
---------------------------------------------------------------------------------------------
5. Find the Sum of Even-Index Elements in an Array

Question:
Write a Java program to find the sum of elements present at even indexes in a given array.

Explanation:
Add the elements located at indexes 0, 2, 4, 6, and so on.

Example Input:
[10, 20, 30, 40, 50]

Expected Output:
Sum of even-index elements: 90

Test Cases:

1. Input: [1, 2, 3, 4, 5]
   Expected Output: 9

2. Input: [10, 20, 30, 40]
   Expected Output: 40

3. Input: [5]
   Expected Output: 5

4. Input: []
   Expected Output: 0

---------------------------------------------------------------------------------------------
6. Find the Sum of Odd-Index Elements in an Array

Question:
Write a Java program to find the sum of elements present at odd indexes in a given array.

Explanation:
Add the elements located at indexes 1, 3, 5, 7, and so on.

Example Input:
[10, 20, 30, 40, 50]

Expected Output:
Sum of odd-index elements: 60

Test Cases:

1. Input: [1, 2, 3, 4, 5]
   Expected Output: 6

2. Input: [10, 20, 30, 40]
   Expected Output: 60

3. Input: [5]
   Expected Output: 0

4. Input: []
   Expected Output: 0
---------------------------------------------------------------------------------------------
7. Find the Squares and Cubes of Array Elements

Question:
Write a Java program to find the square and cube of each element in a given array.

Explanation:
Calculate the square by multiplying each element by itself and the cube by multiplying it three times.

Example Input:
[2, 3, 4, 5]

Expected Output:
Number    Square    Cube
2         4         8
3         9         27
4         16        64
5         25        125

Test Cases:

1. Input: [2, 3]
   Expected Output: Squares: [4, 9], Cubes: [8, 27]

2. Input: [0, 1]
   Expected Output: Squares: [0, 1], Cubes: [0, 1]

3. Input: [-2, 3]
   Expected Output: Squares: [4, 9], Cubes: [-8, 27]

4. Input: [5]
   Expected Output: Squares: [25], Cubes: [125]

5. Input: []
   Expected Output: No results
---------------------------------------------------------------------------------------------
8. Reverse the Elements in an Array

Question:
Write a Java program to reverse the elements of a given array.

Explanation:
Rearrange the array elements in reverse order, placing the last element first and the first element last.

Example Input:
[10, 20, 30, 40, 50]

Expected Output:
[50, 40, 30, 20, 10]

Test Cases:

1. Input: [1, 2, 3]
   Expected Output: [3, 2, 1]

2. Input: [10, 20, 30, 40]
   Expected Output: [40, 30, 20, 10]

3. Input: [5]
   Expected Output: [5]

4. Input: []
   Expected Output: []

5. Input: [1, 2, 2, 3]
   Expected Output: [3, 2, 2, 1]













