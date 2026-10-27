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
----------------------------------------------------------------------------------------------
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
2         	     4           8
3         	     9           27
4         	    16         64
5         	    25        125

Test Cases:

1. Input: [2, 3]
   Expected Output: 
	Squares: [4, 9], 
	Cubes: [8, 27]

2. Input: [0, 1]
   Expected Output: 
	Squares: [0, 1], 
	Cubes: [0, 1]

3. Input: [-2, 3]
   Expected Output: 
	Squares: [4, 9], 
	Cubes: [-8, 27]

4. Input: [5]
   Expected Output: 
	Squares: [25], 
	Cubes: [125]

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
---------------------------------------------------------------------------------------------
8. Check Whether an Array Is a Palindrome

Question:
Write a Java program to check whether a given array is a palindrome array or not.

Explanation:
An array is called a palindrome array if its elements remain the same when read from left to right and from right to left. Compare the elements from both ends of the array. If all corresponding elements are equal, the array is a palindrome; otherwise, it is not a palindrome.

Example Input:
[1, 2, 3, 2, 1]

Expected Output:
Palindrome array

Test Cases:

1. Input: [1, 2, 3, 2, 1]
   Expected Output: Palindrome array

2. Input: [1, 2, 3, 4, 5]
   Expected Output: Not a palindrome array

3. Input: [7]
   Expected Output: Palindrome array

4. Input: [1, 2, 2, 1]
   Expected Output: Palindrome array

5. Input: [5, 5, 5, 5]
   Expected Output: Palindrome array

6. Input: [-1, 2, 0, 2, -1]
   Expected Output: Palindrome array

7. Input: [1, 2, 3, 1]
   Expected Output: Not a palindrome array

8. Input: [0, 0, 0]
   Expected Output: Palindrome array

9. Input: []
   Expected Output: Palindrome array (if an empty array is allowed)
---------------------------------------------------------------------------------------------
9. Find the Sum of Digits of Each Element in an Array

Question:
Write a Java program to find the sum of digits of each element in a given array.

Explanation:
Extract each digit of every array element using the modulo (%) operator and remove the last digit using the division (/) operator. Add all the extracted digits to calculate the sum of digits of each element. For negative numbers, calculate the sum using the absolute value of the number.

Example Input:
[123, 456, 789, 10]

Expected Output:
Sum of 123 is: 6
Sum of 456 is: 15
Sum of 789 is: 24
Sum of 10 is: 1

Test Cases:

1. Input: [123, 456]
   Expected Output: 
	Sum of 123 is: 6, 
	Sum of 456 is: 15

2. Input: [0, 10, 100]
   Expected Output: 
	Sum of 0 is: 0, 
	Sum of 10 is: 1, 
	Sum of 100 is: 1

3. Input: [999, 1234]
   Expected Output: 
	Sum of 999 is: 27, 
	Sum of 1234 is: 10

4. Input: [-123, -456]
   Expected Output: 
	Sum of -123 is: 6, 
	Sum of -456 is: 15

5. Input: [7]
   Expected Output: 
	Sum of 7 is: 7

6. Input: []
   Expected Output: No results
---------------------------------------------------------------------------------------------
10. Find the Product of Digits of Each Element in an Array

Question:
Write a Java program to find the product of digits of each element in a given array.

Explanation:
Extract each digit of every array element using the modulo (%) operator and remove the last digit using the division (/) operator. Multiply all the extracted digits to calculate the product of digits of each element. For negative numbers, calculate the product using the absolute value of the number. If any digit is zero, the product of digits will be zero.

Example Input:
[123, 234, 405, 56]

Expected Output:
Product of 123 is: 6
Product of 234 is: 24
Product of 405 is: 0
Product of 56 is: 30

Test Cases:

1. Input: [123, 234]
   Expected Output: 
	Product of 123 is: 6, 
	Product of 234 is: 24

2. Input: [0, 10, 100]
   Expected Output: 
	Product of 0 is: 0, 
	Product of 10 is: 0, 
	Product of 100 is: 0

3. Input: [999, 1234]
   Expected Output: 
	Product of 999 is: 729, 
	Product of 1234 is: 24

4. Input: [-123, -456]
   Expected Output: 
	Product of -123 is: 6, 
	Product of -456 is: 120

5. Input: [7]
   Expected Output: 
	Product of 7 is: 7

6. Input: []
   Expected Output: No results
---------------------------------------------------------------------------------------------
11. Reverse Each Element in an Array

Question:
Write a Java program to reverse the digits of each element in a given array.

Explanation:
Extract the last digit of each array element using the modulo (%) operator and remove the last digit using the division (/) operator. Construct the reversed number by multiplying the current reversed number by 10 and adding the extracted digit. Repeat until all digits have been processed. For negative numbers, reverse the digits of the absolute value and preserve the original negative sign. Leading zeros in the reversed number are not preserved because the result is an integer.

Example Input:
[123, 456, 120, 789]

Expected Output:
Reverse of 123 is: 321
Reverse of 456 is: 654
Reverse of 120 is: 21
Reverse of 789 is: 987

Test Cases:

1. Input: [123, 456]
  Expected Output:
 	 Reverse of 123 is: 321,
  	Reverse of 456 is: 654

2. Input: [10, 100, 120]
   Expected Output: 
	Reverse of 10 is: 1, 
	Reverse of 100 is: 1, 
	Reverse of 120 is: 21

3. Input: [0, 7, 99]
   Expected Output: 
	Reverse of 0 is: 0, 
	Reverse of 7 is: 7,
	Reverse of 99 is: 99

4. Input: [-123, -456]
   Expected Output: 
	Reverse of -123 is: -321, 
	Reverse of -456 is: -654

5. Input: [1234, 5678]
   Expected Output: 
	Reverse of 1234 is: 4321, 
	Reverse of 5678 is: 8765

6. Input: []
   Expected Output: No results

---------------------------------------------------------------------------------------------

12. First Maximum Element in an Array

Question:
Write a Java program to find the first maximum element in a given array. If the maximum element appears more than once, consider its first occurrence.

Explanation:
Traverse the array and compare each element with the current maximum element. Update the maximum whenever a larger element is found. The final maximum value is the first maximum element in the array.

Example Input:
[10, 25, 7, 40, 15]

Expected Output:
First maximum element is: 40

Test Cases:

1. Input: [10, 25, 7, 40, 15]
   Expected Output:
   First maximum element is: 40

2. Input: [50, 20, 30, 10, 40]
   Expected Output:
   First maximum element is: 50

3. Input: [10, 20, 30, 40, 50]
   Expected Output:
   First maximum element is: 50

4. Input: [10, 50, 20, 50, 30, 50]
   Expected Output:
   First maximum element is: 50

5. Input: [-10, -5, -20, -3, -15]
   Expected Output:
   First maximum element is: -3

6. Input: [7, 7, 7, 7]
   Expected Output:
   First maximum element is: 7

7. Input: [25]
   Expected Output:
   First maximum element is: 25

8. Input: []
   Expected Output:
   No results

---------------------------------------------------------------------------------------------

13. First Minimum Element in an Array

Question:
Write a Java program to find the first minimum element in a given array. If the minimum element appears more than once, consider its first occurrence.

Explanation:
Traverse the array and compare each element with the current minimum element. Update the minimum whenever a smaller element is found. The final minimum value is the first minimum element in the array.

Example Input:
[10, 25, 7, 40, 15]

Expected Output:
First minimum element is: 7

Test Cases:

1. Input: [10, 25, 7, 40, 15]
   Expected Output:
   First minimum element is: 7

2. Input: [-20, 10, 30, 40, 50]
   Expected Output:
   First minimum element is: -20

3. Input: [10, 20, 30, 40, -50]
   Expected Output:
   First minimum element is: -50

4. Input: [10, 5, 20, 5, 30, 5]
   Expected Output:
   First minimum element is: 5

5. Input: [-10, -5, -20, -3, -15]
   Expected Output:
   First minimum element is: -20

6. Input: [7, 7, 7, 7]
   Expected Output:
   First minimum element is: 7

7. Input: [25]
   Expected Output:
   First minimum element is: 25

8. Input: []
   Expected Output:
   No results

---------------------------------------------------------------------------------------------

14. Second Maximum Element in an Array

Question:
Write a Java program to find the second maximum distinct element in a given array. If the maximum element appears more than once, consider it only once when finding the second maximum element.

Explanation:
Traverse the array and identify the largest and second-largest distinct elements. If an element is greater than the current maximum, update the second maximum with the current maximum and then update the maximum. Otherwise, if the element is smaller than the maximum but greater than the current second maximum, update the second maximum. If the array contains fewer than two distinct elements, display an appropriate message.

Example Input:
[10, 25, 7, 40, 15]

Expected Output:
Second maximum element is: 25

Test Cases:

1. Input: [10, 25, 7, 40, 15]
   Expected Output:
   Second maximum element is: 25

2. Input: [10, 50, 20, 50, 30, 50]
   Expected Output:
   Second maximum element is: 30

3. Input: [-10, -5, -20, -3, -15]
   Expected Output:
   Second maximum element is: -5

4. Input: [7, 7, 7, 7]
   Expected Output:
   Second maximum element does not exist

5. Input: [25]
   Expected Output:
   Second maximum element does not exist

---------------------------------------------------------------------------------------------

15. Second Minimum Element in an Array

Question:
Write a Java program to find the second minimum distinct element in a given array. If the minimum element appears more than once, consider it only once when finding the second minimum element.

Explanation:
Traverse the array and identify the smallest and second-smallest distinct elements. If an element is smaller than the current minimum, update the second minimum with the current minimum and then update the minimum. Otherwise, if an element is greater than the minimum but smaller than the current second minimum, update the second minimum. If the array contains fewer than two distinct elements, display an appropriate message.

Example Input:
[10, 25, 7, 40, 15]

Expected Output:
Second minimum element is: 10

Test Cases:

1. Input: [10, 25, 7, 40, 15]
   Expected Output:
   Second minimum element is: 10

2. Input: [10, 5, 20, 5, 30, 5]
   Expected Output:
   Second minimum element is: 10

3. Input: [-10, -5, -20, -3, -15]
   Expected Output:
   Second minimum element is: -15

4. Input: [7, 7, 7, 7]
   Expected Output:
   Second minimum element does not exist

5. Input: [25]
   Expected Output:
   Second minimum element does not exist

---------------------------------------------------------------------------------------------
16. Print Prime Elements in an Array

Question:
Write a Java program to read an array of integers and print all the prime numbers present in the array. A prime number is a number greater than 1 that has exactly two distinct positive factors: 1 and itself. If the array does not contain any prime numbers, display an appropriate message.

Explanation:
Traverse the array and check each element to determine whether it is a prime number. If the element is prime, print it. A number less than or equal to 1 is not prime. To check whether a number is prime, test whether it is divisible by any integer from 2 up to its square root. If a divisor is found, the number is not prime; otherwise, it is prime. If no prime numbers are found in the array, display an appropriate message.

Example Input:
[10, 3, 7, 8, 11, 15, 13]

Expected Output:
Prime elements are:
3
7
11
13

Test Cases:

1. Input: [2, 3, 4, 5, 6, 7]
   Expected Output:
   Prime elements are:
   2
   3
   5
   7

2. Input: [0, 1, -3, -5, 2, 3, 4]
   Expected Output:
   Prime elements are:
   2
   3

3. Input: [4, 6, 8, 9, 10, 12]
   Expected Output:
   No prime elements found

4. Input: [17, 19, 23, 29, 31]
   Expected Output:
   Prime elements are:
   17
   19
   23
   29
   31

5. Input: [2, 2, 3, 4, 5, 5, 9]
   Expected Output:
   Prime elements are:
   2
   2
   3
   5
   5

---------------------------------------------------------------------------------------------

17. Insert an Element at a Specified Index

Question:
Write a Java program to read an array of integers and insert a given element at a specified index. Display the updated array after insertion. If the specified index is invalid, display an appropriate error message.

Explanation:
Read the array using the reusable ArrayOperations class. Ask the user to enter the index at which the element should be inserted and the element to insert.

Example Input:
Array: [10, 20, 30, 40, 50]
Index: 2
Element: 25

Expected Output:
Updated array:
10 20 25 30 40 50

Test Cases:

1. Insert at the Beginning

Input:
Array: [10, 20, 30, 40, 50]
Index: 0
Element: 5

Expected Output:
Updated array:
5 10 20 30 40 50

2. Insert in the Middle

Input:
Array: [10, 20, 30, 40, 50]
Index: 2
Element: 25

Expected Output:
Updated array:
10 20 25 30 40 50

3. Insert at the End

Input:
Array: [10, 20, 30, 40, 50]
Index: 5
Element: 60

Expected Output:
Updated array:
10 20 30 40 50 60

4. Invalid Negative Index

Input:
Array: [10, 20, 30, 40]
Index: -1
Element: 15

Expected Output:
Invalid index

5. Index Greater Than the Array Length

Input:
Array: [10, 20, 30, 40]
Index: 6
Element: 15

Expected Output:
Invalid index

---------------------------------------------------------------------------------------------

18. Remove an Element at a Specified Index

Question:
Write a Java program to read an array of integers and remove the element at a specified index. Display the updated array after removing the element. If the specified index is invalid, display an appropriate error message.

Explanation:
Read the array using the reusable ArrayOperations class. Ask the user to enter the index of the element to be removed.

Example Input:
Array: [10, 20, 30, 40, 50]
Index: 2

Expected Output:
Updated array:
10 20 40 50

Test Cases:

1. Remove the First Element

Input:
Array: [10, 20, 30, 40, 50]
Index: 0

Expected Output:
Updated array:
20 30 40 50

2. Remove an Element from the Middle

Input:
Array: [10, 20, 30, 40, 50]
Index: 2

Expected Output:
Updated array:
10 20 40 50

3. Remove the Last Element

Input:
Array: [10, 20, 30, 40, 50]
Index: 4

Expected Output:
Updated array:
10 20 30 40

4. Invalid Negative Index

Input:
Array: [10, 20, 30, 40]
Index: -1

Expected Output:
Invalid index

5. Index Equal to the Array Length

Input:
Array: [10, 20, 30, 40]
Index: 4

Expected Output:
Invalid index

---------------------------------------------------------------------------------------------